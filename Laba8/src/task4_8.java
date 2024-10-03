import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4_8 {
    public static void main(String[] args) throws IOException {
        File file_scan = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №4.txt");
        Scanner input = new Scanner(file_scan);
        File file_put = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №4.txt");
        FileWriter print = new FileWriter(file_put);
        String abc_down = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String abc_up = "АБВГДЕЁЖХИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String check = "«_.,;:\\n\\t!?»";
        String condition_1 = "", condition_2 = "";
        String[] base_mas;

        print.write(separator());
        while (input.hasNextLine()) {
            String base = input.nextLine();
            base_mas = base.split(" ");
            for (int i = 1; i < base_mas.length; i++) {
                for (int j = 0; j < check.length(); j++) {
                    for (int k = 0; k < check.length(); k++) {
                        if (base_mas[i-1].charAt(base_mas[i-1].length() - 1) == check.charAt(j)
                        && base_mas[i].charAt(base_mas[i].length() - 1) == check.charAt(k)) {
                            condition_1 += base_mas[i] + " ";
                        }
                    }
                }
                for (int j = 1; j < abc_down.length(); j++) {
                    for (int k = 0; k < check.length(); k++) {
                        if (base_mas[i].charAt(base_mas[i].length() - 1) == check.charAt(k)) {
                            if (base_mas[i].charAt(0) == abc_down.charAt(j-1)
                            && base_mas[i].charAt(base_mas[i].length() - 2) == abc_down.charAt(j)
                            || base_mas[i].charAt(0) == abc_up.charAt(j-1)
                            && base_mas[i].charAt(base_mas[i].length() - 2) == abc_up.charAt(j)) {
                                condition_2 += base_mas[i] + " ";
                                j = abc_down.length();
                            }
                        } else {
                            if (base_mas[i].charAt(0) == abc_down.charAt(j-1)
                            && base_mas[i].charAt(base_mas[i].length() - 1) == abc_down.charAt(j)
                            || base_mas[i].charAt(0) == abc_up.charAt(j-1)
                            && base_mas[i].charAt(base_mas[i].length() - 1) == abc_up.charAt(j)) {
                                condition_2 += base_mas[i] + " ";
                                j = abc_down.length();
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < check.length(); i++) {
            condition_1 = condition_1.replace(check.charAt(i), '\u0000');
            condition_2 = condition_2.replace(check.charAt(i), '\u0000');
        }


        Pattern space_1 = Pattern.compile(" {2,}");
        Matcher find_space_1 = space_1.matcher(condition_1);
        condition_1 = find_space_1.replaceAll(" ");

        Pattern space_2 = Pattern.compile(" {2,}");
        Matcher find_space = space_2.matcher(condition_2);
        condition_2 = find_space.replaceAll(" ");

        print.write("\nСлова, удовлетворяющие условию №1:");
        base_mas = condition_1.split(" ");
        for (int i = 0; i < base_mas.length; i++) {
            print.write("\n" + base_mas[i]);
        }

        print.write("\n" + separator());

        print.write("\nСлова, удовлетворяющие условию №2:");
        base_mas = condition_2.split(" ");
        for (int i = 0; i < base_mas.length; i++) {
            print.write("\n" + base_mas[i]);
        }

        print.write("\n" + separator());
        print.close();
    }

    public static String separator () {
        String base = "";
        for (int i = 0; i < 35; i++) {
            base += "=";
        }
        return base;
    }
}
