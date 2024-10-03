import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1_7 {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("Задание №10");
        Scanner input = new Scanner(file);
        String[] mas;

        while (input.hasNextLine()) {
            String base = input.nextLine();
            mas = base.split(";");
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + "\t");
            }
            System.out.println();
        }
    }
}
