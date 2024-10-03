import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task6_7 {


    static String[] kampus = {"Корпус А","Корпус Б","Корпус В","Корпус Г"};
    static String[] fac = {"ФПММ","ХТФ","ЭТФ"};
    static int[] kampus_room = new int [kampus.length];
    static int[][] fac_room = new int[2][fac.length];
    static String[] base_mas;
    public static void main(String[] args) throws FileNotFoundException {

        Scanner vvod = new Scanner(System.in);
        System.out.println("В каком виде исходные даннык\n1. Регламентированный ввод\t2. Не регламентированный ввод");
        int turn = vvod.nextInt();
        while (turn != 1 && turn != 2) {
            System.out.println("Вы допустили ошибку, повторите ввод");
            turn = vvod.nextInt();
        }

        if (turn == 1) {
            File file = new File("Задание №6(Регл.)");
            Scanner input = new Scanner(file);

            reg_vvod(input);
            System.out.println("Аудиторий для самостоятельной работы с наличием не менее 10 компьютеров\nи не менее" +
                    " 30 посадочных мест по корпусам и по факультетам:");
            print_string(1);
            System.out.println();
            print_string(2);
            System.out.println("Лекционных аудиторий без мультимедийного оборудования и с наличием\nболее" +
                    " 60 посадочных мест по факультетам:");
            print_string(3);
        } else if (turn == 2) {
            File file = new File("Задание №6(Не регл.)");
            Scanner input = new Scanner(file);

            nereg_vvod(input);
            System.out.println("Аудиторий для самостоятельной работы с наличием не менее 10 компьютеров\nи не менее" +
                    " 30 посадочных мест по корпусам и по факультетам:");
            print_string(1);
            System.out.println();
            print_string(2);
            System.out.println("Лекционных аудиторий без мультимедийного оборудования и с наличием\nболее" +
                    " 60 посадочных мест по факультетам:");
            print_string(3);
        }


    }
    public static void nereg_vvod(Scanner input) {
        while (input.hasNextLine()) {
            String base = input.nextLine();
            Pattern aud_sam = Pattern.compile("аудиторией для самостоятельной работы");
            Matcher find_sam = aud_sam.matcher(base);
            Pattern aud_lec = Pattern.compile("лекционной аудиторией");
            Matcher find_lec = aud_lec.matcher(base);
            Pattern k_comp = Pattern.compile("\\d{2} компьютеров");
            Matcher find_comp = k_comp.matcher(base);
            Pattern k_mest = Pattern.compile("\\d{2} рабочих мест");
            Matcher find_mest = k_mest.matcher(base);
            Pattern mult = Pattern.compile("не установлено");
            Matcher find_mult = mult.matcher(base);

            if (find_sam.find() && find_comp.find() && find_mest.find()) {
                int start_comp = find_comp.start();
                String check_comp = base.substring(start_comp, start_comp + 2);
                int start_mest = find_mest.start();
                String check_mest = base.substring(start_mest, start_mest+2);
                if (Integer.parseInt(check_comp) >= 10 && Integer.parseInt(check_mest) >= 30) {
                    for (int i = 0; i < kampus.length; i++) {
                        Pattern kampus_p = Pattern.compile("корпусе " + kampus[i].charAt(7));
                        Matcher find_kampus = kampus_p.matcher(base);
                        if (find_kampus.find()) {
                            kampus_room[i] += 1;
                        }
                    }
                    for (int i = 0; i < fac.length; i++) {
                        Pattern fac_p = Pattern.compile(fac[i]);
                        Matcher find_fac = fac_p.matcher(base);
                        if (find_fac.find()) {
                            fac_room[0][i] += 1;
                        }
                    }
                }
            } else if (find_lec.find() && find_mult.find() && find_mest.find()) {
                int start_mest = find_mest.start();
                String check_mest = base.substring(start_mest, start_mest+2);
                if (Integer.parseInt(check_mest) > 60) {
                    for (int i = 0; i < fac.length; i++) {
                        Pattern fac_p = Pattern.compile(fac[i]);
                        Matcher find_fac = fac_p.matcher(base);
                        if (find_fac.find()) {
                            fac_room[1][i] += 1;
                        }
                    }
                }
            }
        }
    }
    public static void reg_vvod(Scanner input){
        while (input.hasNextLine()) {
            String base = input.nextLine();
            base_mas = base.split(";");
            Pattern k_mest = Pattern.compile(" рабочих мест");
            Matcher find_mest = k_mest.matcher(base_mas[4]);
            Pattern k_comp = Pattern.compile(" компьютеров");
            Matcher find_comp = k_comp.matcher(base_mas[7]);
            if(base_mas[3].equals("Для самостоятельной работы")) {
                base_mas[7] = find_comp.replaceAll("");
                base_mas[4] = find_mest.replaceAll("");
                if (Integer.parseInt(base_mas[7]) >= 10 && Integer.parseInt(base_mas[4]) >= 30) {
                        for (int i = 0; i < kampus.length; i++) {
                            if (base_mas[1].equals(kampus[i])) {
                                kampus_room[i] += 1;
                            }
                        }
                        for (int i = 0; i < fac.length; i++) {
                            if (base_mas[8].equals(fac[i])) {
                                fac_room[0][i] += 1;
                            }
                    }
                }
            } else if (base_mas[3].equals("Лекционная аудитория")) {
                if (base_mas[5].equals("Не установлено")) {
                    base_mas[4] = find_mest.replaceAll("");
                    if (Integer.parseInt(base_mas[4]) > 60) {
                        for (int i = 0; i < fac.length; i++) {
                            if (base_mas[8].equals(fac[i])) {
                                fac_room[1][i] += 1;
                            }
                        }
                    }
                }
            }
        }
    }
    public static void print_string(int n) {
        if (n == 1) {
            for (int i = 0; i < kampus.length; i++) {
                System.out.print(kampus[i] + ":\t" + kampus_room[i] + "\n");
            }
        } else if (n == 2) {
            for (int i = 0; i < fac.length; i++) {
                System.out.print(fac[i] + ":\t" + fac_room[0][i] + "\n");
            }
        } else if (n == 3) {
        for (int i = 0; i < fac.length; i++) {
            System.out.print(fac[i] + ":\t" + fac_room[1][i] + "\n");
        }
    }
    }
}
