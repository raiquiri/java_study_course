import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task12_8 {
    public static void main(String[] args) throws IOException {
        File file_scan = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №12.txt");
        Scanner input = new Scanner(file_scan);
        File file_put = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №12.txt");
        FileWriter print = new FileWriter(file_put);
        String result = "";

        print.write("Исходный текст:");
        while (input.hasNextLine()) {
            String base = input.nextLine();
            print.write("\n" + base);

            Pattern space = Pattern.compile(" {2,}");
            Matcher find_space = space.matcher(base);
            base = find_space.replaceAll(" ");

            Pattern chu = Pattern.compile("чю");
            Matcher find_chu = chu.matcher(base);
            base = find_chu.replaceAll("чу");

            Pattern shu = Pattern.compile("щю");
            Matcher find_shu = shu.matcher(base);
            base = find_shu.replaceAll("щу");

            String[] base_mas = base.split(" ");
            for (int i = 0; i < base_mas.length; i++) {
                Pattern letter = Pattern.compile("(([а-яА-Я])\\2+)+");
                Matcher find_letter = letter.matcher(base_mas[i]);
                if (find_letter.find()) {
                    base_mas[i] = find_letter.replaceAll(find_letter.group(2));
                }
                result += base_mas[i] + " ";
            }
            result += "\n";
        }

        print.write("\n" + separator() + "\nПеределанный текст:\n" + result);

        print.close();

    }
    public static String separator() {
        String base = "";
        for (int i = 0; i < 127; i++) {
            base += "=";
        }
        return base;
    }
}
