import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task9_7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Задание №9");
        Scanner input = new Scanner(file);

        String base = "";
        while (input.hasNextLine()) {
            base += input.nextLine() + "\n";
        }
        System.out.println("Изначальный текст:\n" + base);


        Pattern pat_1 = Pattern.compile("(Комментирую|Комментарий) - .+- все");
        Matcher mat_1 = pat_1.matcher(base);
        base = mat_1.replaceAll(" ");

        Pattern pat_2 = Pattern.compile("все - .+- комментарий");
        Matcher mat_2 = pat_2.matcher(base);
        base = mat_2.replaceAll(" ");


        System.out.println("Исправленный текст:\n" + base);
    }
}
