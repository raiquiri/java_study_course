import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static Laba7.task3_7.*;

public class task1_8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №1.txt");
        FileWriter print = new FileWriter(file,true);

        System.out.println("Введите количесвто символов массива:");
        int n = input.nextInt();

        while (n < 0) {
            System.out.println("Вы допустили ошибку, повторите попытку");
            n = input.nextInt();
        }

        char[] array = new char[n];

        System.out.println("Введите массив посимвольно:");
        for (int i = 0; i < n; i++) {
            array[i] = fill();
        }

        print.write(separator());

        print.write("\nЗаданный массив:\n");
        for (int i = 0; i < array.length; i++) {
            print.write(array[i] + "\t");
        }

        System.out.println("\nВведиете букву для проверки:");
        char letter = fill();

        print.write("\nПроверочная буква:\t" + letter);

        System.out.println("Введите проверочное слово:");
        String word = "";
        boolean proverka = false;

        while (proverka == false) {
            word = input.next();
            if (word.matches("[а-яА-Яa-zA-Z]+")) {
                proverka = true;
            } else {
                System.out.println("Вы допустили ошибку, повторите попытку");
            }
        }
        print.write("\nПроверочное слово:\t" + word + "\n");

        print.write(separator());

        print.write("\nКоличество пробелов в этом массиве:\t" + check_a(array) +
                "\nЕсть несколько подряд проверочных букв:\t" + cheak_b(array, letter) +
                "\nЕсть ли среди символов проверочное слово:\t" + check_v(array, word) +
                "\nКоличесвтов пар \"но\" или \"он\", стоящих рядом:\t" + check_g(array) +
                "\nКоличество пар одиновых символов, стоящих рядом:\t" + check_d(array) +
                "\nСуществуют ли такие S(i), S(j), что S(i) = S(i+1) и S(j) = S(j+1):\t" + check_e(array) + "\n");

        print.write(separator() + "\n\n");

        print.close();
    }
    public static String separator(){
        String base = "";
        for (int i = 0; i < 101; i++) {
            base += "=";
        }
        return base;
    }
}
