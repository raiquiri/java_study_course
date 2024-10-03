import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task7_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("Задание №7");
        Scanner input = new Scanner(file);

        String base = "";
        while (input.hasNextLine()) {
            base += input.nextLine() + "\n";
        }
        System.out.println("Изначальный текст:\n" + base);


        int count_1, count_2 = 0;
        for (int i = 0; i < base.length(); i++) {
            count_1 = 1;
            if (i == 0) {
                if (base.charAt(i) == 'б' || base.charAt(i) == 'Б') {
                    while (base.charAt(i) != ' ') {
                        i++;
                        count_1++;
                    }
                    if (count_1 >= 5 && ((base.charAt(i-1)  == 'я' && base.charAt(i-2) == 'с' &&
                            base.charAt(i-3)  == 'ь' && base.charAt(i-4) == 'т') || (base.charAt(i-1) == 'я'
                            && base.charAt(i-2)  == 'с' && base.charAt(i-3)  == 'т'))) {
                        count_2++;
                    }
                }
            } else {
                if (base.charAt(i-1) == ' ' && (base.charAt(i) == 'б' || base.charAt(i) == 'Б')) {
                    while (base.charAt(i) != ' ' && i != base.length()-1) {
                        i++;
                        count_1++;
                    }
                    if (count_1 >= 5 && ((base.charAt(i-1)  == 'я' && base.charAt(i-2)  == 'с' &&
                            base.charAt(i-3)  == 'ь' && base.charAt(i-4)  == 'т') || (base.charAt(i-1)  == 'я'
                            && base.charAt(i-2) == 'с' && base.charAt(i-3) == 'т'))) {
                        count_2++;
                    }
                }
            }
        }
        System.out.println("Подходит условию:\t" + count_2 + " слов");
    }
}
