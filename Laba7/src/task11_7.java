import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task11_7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Задание №11");
        Scanner input = new Scanner(file);
        String base = "";

        while (input.hasNextLine()) {
            base += input.nextLine() + "\n";
        }

        System.out.println("Исходные данные:\n" + base);

        Pattern mail = Pattern.compile("[a-zA-z0-9+.-]+@[a-z]+.[a-z]{2,}");
        Matcher find_mail = mail.matcher(base);
        base = find_mail.replaceAll(" ");

        Pattern number = Pattern.compile("\\+[0-9()-]{8,}");
        Matcher find_number = number.matcher(base);
        base = find_number.replaceAll(" ");

        Pattern ran_num = Pattern.compile(" [0-9]+ ");
        Matcher find_ran_num = ran_num.matcher(base);
        base = find_ran_num.replaceAll(" ");

        System.out.println("Изменённый текст:\n" + base);
    }
}
