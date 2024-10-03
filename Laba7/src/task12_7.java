import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task12_7 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Задание №12");
        Scanner input = new Scanner(file);

        while (input.hasNextLine()) {
            String base = input.nextLine();
            System.out.println("Исходная строчка:\n" + base);

            Pattern space = Pattern.compile(" {2,}");
            Matcher find_space = space.matcher(base);
            base = find_space.replaceAll(" ");

            Pattern chu = Pattern.compile("чю");
            Matcher find_chu = chu.matcher(base);
            base = find_chu.replaceAll("чу");

            Pattern shu = Pattern.compile("щю");
            Matcher find_shu = shu.matcher(base);
            base = find_shu.replaceAll("щу");

            System.out.println("Переделанная строка:");
            String[] base_mas = base.split(" ");
            for (int i = 0; i < base_mas.length; i++) {
                Pattern letter = Pattern.compile("(([а-яА-Я])\\2+)+");
                Matcher find_letter = letter.matcher(base_mas[i]);
                if (find_letter.find()) {
                    base_mas[i] = find_letter.replaceAll(find_letter.group(2));
                }
                System.out.print(base_mas[i] + " ");
            }
            System.out.println();


        }
    }
}
