import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task8_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("Задание №8");
        Scanner input = new Scanner(file);

        String base = "";
        System.out.println("Изначальный текст: ");
        while(input.hasNextLine()) {
            base += input.nextLine() + "\n";
        }
        System.out.println(base);
        String check = base;

        System.out.println("Переделанный текст: ");
        base = base.replace('б','<');
        base = base.replace('ю','>');
        base = base.replace('ж',':');
        base = base.replace('э','"');
        base = base.replace('х','{');
        base = base.replace('ъ','}');

        System.out.println(base);

        int k = 0;
        for (int i = 0; i < base.length(); i++) {
            if (check.charAt(i) != base.charAt(i)){
                k++;
            }
        }
        System.out.println("Всего изменений:\t" + k);
    }
}