import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task3_8 {
    public static void main(String[] args) throws IOException {
        File file_scan = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №3.txt");
        Scanner input = new Scanner(file_scan);
        File file_put = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №3.txt");
        FileWriter print = new FileWriter(file_put);
        String[] base_mas;

        print.write(separator());
        while (input.hasNextLine()) {
            String base = input.nextLine();
            base_mas = base.split(" ");
            for (int i = 1; i < base_mas.length; i++) {
                if (Character.isUpperCase(base_mas[i].charAt(0)) && base_mas[i-1].charAt(base_mas[i-1].length() - 1) != '.' && base_mas[i].length() >= 3) {
                    String check = ".,/<>?\"»";
                    for (int j = base_mas[i].length() - 1; j >= base_mas[i].length() -2; j--) {
                        for (int k = 0; k < check.length(); k++) {
                            if (base_mas[i].charAt(j) == check.charAt(k)) {
                                base_mas[i] = base_mas[i].replace(base_mas[i].substring(base_mas[i].length()-1), "");
                                k = check.length();
                            }
                        }
                    }
                    print.write("\n" + base_mas[i]);
                }
            }
        }
        print.write("\n" + separator());
        print.close();
    }
    public static String separator() {
        String base = "";
        for (int i = 0; i < 51; i++) {
            base += "=";
        }
        return base;
    }
}
