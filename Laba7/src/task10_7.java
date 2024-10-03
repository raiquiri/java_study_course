import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class task10_7 {
    static LocalDate date_now = LocalDate.now();
    static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("Задание №10");
        Scanner input = new Scanner(file);
        long min_age = format.parse(String.valueOf(date_now)).getTime();
        int sum_person = 1, str_index = 0, person_index = 0;
        String[] base_mas;

        while (input.hasNextLine()) {
            String base = input.nextLine();
            base_mas = base.split(";");

            base_mas[5] = base_mas[5].replace(" см", "");
            base_mas[6] = base_mas[6].replace(" кг", "");
            if (Integer.parseInt(base_mas[5]) >= 150 && Integer.parseInt(base_mas[5]) <= 180
            && Integer.parseInt(base_mas[6]) >= 50 && Integer.parseInt(base_mas[6]) <= 80) {
                sum_person += 1;
            }

            if (date_check(base_mas[7]) < min_age) {
                min_age = date_check(base_mas[7]);
                person_index = str_index;
            }
            str_index += 1;
        }

        System.out.println("Количесвто людей, удовлетворяющих следующим категориям:" +
                "\n1. Рост от 150 до 180 см\n2. Вес от 50 до 80 кг" +
                "\nВсего таких людей:\t" + sum_person);

        String young_person = Files.readAllLines(file.toPath()).get(person_index);
        base_mas = young_person.split(";");

        System.out.println("\nСамым молодым является " + base_mas[0] + " " + base_mas[1] + " " + base_mas[2] +
        "\nПол:\t" + base_mas[3] + "\nРост:\t" + base_mas[5] + "\nВес:\t" + base_mas[6] + "\nВозраст:\t" + (date_check(base_mas[7])/86400000)/365 + " лет" +
        "\nНомер телефона:\t" + base_mas[8] + "\nАдрес проживания:\t" + base_mas[9]);
    }
   public static long date_check(String base) throws ParseException {
       Date time = format.parse(base);
       Date date = format.parse(String.valueOf(date_now));
       long delt = date.getTime() - time.getTime();

       return delt;
   }
}
