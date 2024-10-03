import java.util.Scanner;

public class task2_7 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите количество цифр числа в двоичной системе");
        int n = input.nextInt();

        while (n < 1) {
            System.out.println("Вы допустили ошибку, повторите попытку");
            n = input.nextInt();
        }

        char[] array = new char[n];

        System.out.println("Введите посимвольно это число");
        for (int i = 0; i < n; i++) {
            array[i] = fill(i);
        }
        System.out.println("Число:");
        output(array);

        System.out.println("\nЧисло в 10-ной системе счисления:\n" + translate_to_10(array));
        System.out.println("Число в 13-ной системе счисления:\n" + translate_to_13(translate_to_10(array)));

    }
    public static int translate_to_10(char[] array) {
        int k = 0, sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum += Character.getNumericValue(array[i]) * Math.pow(2, k);
            k++;
        }
        return sum;
    }

    public static String translate_to_13(int sum) {
        String answer = "", result = "";
        while (sum > 0) {
            int ost = sum % 13;
            if (ost == 10) {
                answer += "A";
            } else if (ost == 11) {
                answer += "B";
            } else if (ost == 12) {
                answer += "C";
            } else {
                answer += ost;
            }
            sum = sum / 13;
        }
        for (int i = answer.length() - 1; i >= 0; i--) {
            result += answer.charAt(i);
        }
        return result;
    }

    public static char fill(int i) {
        char base = ' ';
        String simvol = input.next();
        while (i == 0 && simvol.charAt(0) == '0') {
            System.out.println("Вы допустили ошибку, повторите попытку");
            simvol = input.next();
        }
        if (simvol.length() == 1 && (simvol.charAt(0) == '1' || simvol.charAt(0) == '0')) {
            base = simvol.charAt(0);
        } else {
            while (simvol.length() != 1 || (simvol.charAt(0) != '1' && simvol.charAt(0) != '0')) {
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