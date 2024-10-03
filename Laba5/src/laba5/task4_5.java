package laba5;

import java.util.Scanner;

public class task4_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите целое число");
        int x = s.nextInt();
        System.out.println("Введите систему счисления");
        int sis = s.nextInt();

        while ( sis >= 10 || sis < 2) {
            System.out.println("Повторите попытку");
            sis = s.nextInt();
        }
        System.out.println("Ответ: " + f(x,sis));

        System.out.println("Вы хотите повторите попытку?\n1. Да\t2. Нет");
        int n = s.nextInt();

        while ( n != 1 && n != 2) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }

        while (n == 1) {
            yes(n,x);
            n = s.nextInt();
        }

        no(n);
    }
    public static long f(int x, int sis) {
        int k = 0;
        long result = 0;
        while (x > 0) {
            double f = x % sis;
            x = x / sis;
            result += f * Math.pow(10,k);
            k++;
        }
        return result;
    }
    public static void yes(int n, int x) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите систему счисления");
        int sis = s.nextInt();

        while ( sis >= 10 || sis < 2) {
            System.out.println("Повторите попытку");
            sis = s.nextInt();
        }
        System.out.println("Ответ: " + f(x,sis));

        System.out.println("Вы хотите повторите попытку?\n1. Да\t2. Нет");
    }
    public static void no(int n) {
        System.out.println("Всего доброго <3");
    }
}
