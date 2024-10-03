package Laba5;

import java.util.Scanner;

public class task9_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        double x = s.nextDouble();

        while (x < 0) {
            System.out.println("Повторите попытку");
            x = s.nextDouble();
        }
        System.out.println("Введите спенеь корня");
        double p = s.nextDouble();

        while (p <= 0) {
            System.out.println("Повторите попытку");
            p = s.nextDouble();
        }

        System.out.println("Введите у0");
        double y0 = s.nextDouble();

        while ( y0 > Math.exp((Math.log(x*(p+1)))/p) || y0 == 0) {
            System.out.println("Повторите попытку");
            y0 = s.nextDouble();
        }

        System.out.println("Ответ по формуле Ньютона: " + f(x,p,y0,1));
        System.out.println("Ответ по функции: " + Math.pow(x,1/p));
        System.out.println("Погрешность: " + Math.abs(f(x,p,y0,1) - Math.pow(x,1/p)));

    }
    public static double f(double x, double p, double y0, int n) {
        int k = 1;
        double acc = Math.pow(10,-k);
        double y = (1/p) * ((p-1)*y0 + x/Math.pow(y0,p-1));
        while (Math.abs(y-y0) > acc) {
            y0 = y;
            y = (1/p) * ((p-1) * y0 + x / Math.pow(y0, p - 1));
            k++;
        }
        if (n == 1) {
            return y;
        } else if (n == 2) {
            return k-1;
        } else {
            return 0;
        }
    }
}