import java.util.Scanner;

public class task3_7 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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

        System.out.println("Введённый вами массив:");
        output(array);

        System.out.println("\nВведиете букву для проверки:");
        char letter = fill();

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

        System.out.println("\nКоличество пробелов в этом массиве:\t" + check_a(array));
        System.out.println("Есть несколько подряд проверочных букв:\t" + cheak_b(array, letter));
        System.out.println("Есть ли среди символов проверочное слово:\t" + check_v(array, word));
        System.out.println("Количесвтов пар \"но\" или \"он\", стоящих рядом:\t" + check_g(array));
        System.out.println("Количество пар одиновых символов, стоящих рядом:\t" + check_d(array));
        System.out.println("Существуют ли такие S(i), S(j), что S(i) = S(i+1) и S(j) = S(j+1):\t" + check_e(array));


    }
    public static int check_a(char[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                k++;
            }
        }
        return k;
    }
    public static boolean cheak_b(char[] array, char letter) {
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i] && array[i] == letter) {
                k++;
            }
        }
        if (k != 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean check_v(char[] array, String word) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (array[i] == word.charAt(j)) {
                    k++;
                }
            }
        }
        if (k >= word.length()) {
            return true;
        } else {
            return false;
        }
    }
    public static int check_g(char[] array) {
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            if ((array[i-1] == 'н' && array[i] == 'о') || (array[i-1] == 'о' && array[i] == 'н')) {
                k++;
            }
        }
        return k;
    }
    public static int check_d(char[] array) {
        int k = 0;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i; j < i + 2; j++) {
                if (i != j && array[i] == array[j]) {
                    k++;
                }
            }
        }
        return k;
    }
    public static boolean check_e(char[] array) {
        int k = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (Character.isDigit(array[i]) && array[i] == array[i+1]) {
                for (int j = i + 1; j < array.length - 1; j++) {
                    if (Character.isDigit(array[j]) && array[j] == array[j+1]) {
                        k++;
                    }
                }
            }
        }
        if (k > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static char fill() {
        char base = ' ';
        String simvol = input.next();
        if (simvol.length() == 1) {
            base = simvol.charAt(0);
        } else {
            while (simvol.length() != 1) {
                System.out.println("Вы допустили ошибку, повторите попытку");
                simvol = input.next();
            }
            base = simvol.charAt(0);
        }
        return base;
    }
    public static void output(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
