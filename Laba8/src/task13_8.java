import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task13_8 {
    public static void main(String[] args) throws IOException {
        File file_matrix = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №13 СЛАУ.txt");
        Scanner scan_matrix = new Scanner(file_matrix);
        File file_result = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №13 Решение.txt");
        Scanner scan_result = new Scanner(file_result);
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №13.txt");
        FileWriter print = new FileWriter(file);
        String matrix = "", result = "";

        while (scan_matrix.hasNextLine() && scan_result.hasNextLine()) {
            String step = scan_matrix.nextLine();
            matrix += step + "|";
            result += scan_result.nextLine() + "|";

            if (step.equals("-")) {
                String[] step1 = matrix.split("\\|");
                String[] step2 = step1[0].split(" ");
                String[] step3 = result.split("\\|");

                String[][] array = new String[step1.length - 1][step2.length];
                String[] answer = new String[step1.length - 1];

                for (int i = 0; i < array.length; i++) {
                    String[] turn = step1[i].split(" ");
                    for (int j = 0; j < array[0].length; j++) {
                        array[i][j] = turn[j];
                    }
                    answer[i] = step3[i];
                }

                if (check(array, answer)) {
                    print.write("Матрица решина правильно:\n");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[0].length; j++) {
                            print.write(array[i][j] + " ");
                        }
                        print.write("\t" + answer[i] + "\n");
                    }
                } else {
                    print.write("Матрица решина не правильно, ниже записано правильное решение:\n");
                    double sum = 0;
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[0].length - 1; j++) {
                            sum += Double.parseDouble(array[i][j]) * Double.parseDouble(answer[i]);
                            print.write(array[i][j] + " ");
                        }
                        print.write(" " + sum + "\t" + answer[i] + "\n");
                        sum = 0;
                    }
                }

                matrix = "";
                result = "";
            }
        }
        print.close();
    }
    public static boolean check (String[][] base, String [] answer) {
        String[] free_members = new String[base.length];
        double sum = 0;

        for (int i = 0; i < base.length; i++) {
            for (int j = 0; j < base[0].length - 1; j++) {
                sum += Double.parseDouble(base[i][j]) * Double.parseDouble(answer[j]);
            }
            free_members[i] = Double.toString(sum);
            sum = 0;
        }

        boolean check = true;

        for (int i = 0; i < base.length; i++) {
            if (Double.parseDouble(base[i][base[0].length - 1]) != Double.parseDouble(free_members[i])) {
                check = false;
            }
        }

        return check;
    }
}
