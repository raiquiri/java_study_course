package Laba5;

import java.util.Scanner;

public class task5_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х от -1 до 1");
        double x = s.nextDouble();

        while (x >= 1 || x <= -1) {
            System.out.println("Повторите попытку");
            x = s.nextDouble();
        }

        System.out.println("Ответ по ряду Маклорена: " + f(x,1));
        System.out.println("Ответ по функции: " + Math.log(1+x));
        System.out.println("Погрешность: " + Math.abs(f(x,1) - Math.log(1+x)));
    }
    public static double f(double x, int n) {
        double r = x;
        int k = 1;
        double acc = Math.pow(10, -3);
        double s = -Math.pow(x,2)/(k+1);
        while (Math.abs(s) > acc) {
            r += s;
            s *= -1 * x * (k + 1) / (k + 2);
            k++;
        }
        if (n == 1) {
            return r;
        } else if (n == 2) {
            return k-1;
        } else {
            return 0;
        }
    }
}
