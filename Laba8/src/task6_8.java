import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task6_8 {
    public static void main(String[] args) throws IOException {
        File file_scan = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №6.txt");
        Scanner input = new Scanner(file_scan);
        File file_put = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №6.txt");
        FileWriter print = new FileWriter(file_put);
        String prof = "";
        String value = "";

        while (input.hasNextLine()) {
            String base = input.nextLine();
            String[] base_mas = base.split(";");

            if (Integer.parseInt(base_mas[3]) >= 900 && Integer.parseInt(base_mas[4]) < 5) {
                Pattern find = Pattern.compile(base_mas[1]);
                Matcher m_find = find.matcher(prof);

                if (m_find.find()) {
                    String[] prof_mas = prof.split(";");
                    String[] valeu_mas = value.split(";");
                    for (int i = 0; i < prof_mas.length; i++) {
                        if (prof_mas[i].equals(base_mas[1])) {
                            valeu_mas[i] = String.valueOf(Integer.parseInt(valeu_mas[i]) + 1);
                            i = prof_mas.length;
                        }
                    }
                    value = "";
                    for (int i = 0; i < valeu_mas.length; i++) {
                        value += valeu_mas[i] + ";";
                    }
                } else {
                    prof += base_mas[1] + ";";
                    value += 1 + ";";
                }
            }
        }
        String[] prof_mas = prof.split(";");
        String[] valeu_mas = value.split(";");
        print.write("Специализации врачей со стоимостью часа работы от 900 руб и стажем менее 5 лет и их количество:\n" +
                "Специлизация:\t\tКоличесвто:\n");
        for (int i = 0 ; i < prof_mas.length; i++) {
            print.write(space(prof_mas[i]) + "\t\t" + valeu_mas[i] + "\n");
        }
        print.close();
    }
    public static String space (String base) {
        while (base.length() != 15) {
            base += " ";
        }
        return base;
    }
}