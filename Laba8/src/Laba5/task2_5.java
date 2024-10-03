package laba5;

import java.util.Scanner;

public class task2_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите А");
        double a = s.nextDouble();
        while (a <= 0) {
            System.out.println("Повторите попытку");
            a = s.nextDouble();
        }

        System.out.println("Введите В");
        double b = s.nextDouble();
        while (b <= 0) {
            System.out.println("Повторите попытку");
            b = s.nextDouble();
        }

        System.out.println("Введите N");
        double n = s.nextDouble();
        while (n <= 0) {
            System.out.println("Повторите попытку");
            n = s.nextDouble();
        }

        double ans = 0;

        for (int i = 1; i <= 6; i++) {
            if (i%2 == 1) {
                ans += a;
            } else {
                ans += b;
            }
        }

        System.out.println("Cтудент набрал " + ans);

        if (ans >= n) {
            System.out.println("Студент перешёл порог баллов");
        } else System.out.println("Студент не набрал минимальное количество баллов");
    }
}