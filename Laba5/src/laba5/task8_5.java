package laba5;

import java.util.Scanner;

public class task8_5 extends Function_My {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        func();

        System.out.println("Вы хотите повторить попытку?\n1. Да\t2. Нет");
        double r = s.nextDouble();

        while (r != 1 && r != 2) {
            System.out.println("Повторите попытку");
            r = s.nextDouble();
        }

        while (r == 1) {
            func();
            System.out.println("Вы хотите повторить попытку?\n1. Да\t2. Нет");
            r = s.nextDouble();
        }
        System.out.println("Всего доброго <3");
    }

    public static void func() {
        Scanner s = new Scanner(System.in);
        System.out.println("Какую функцию вы хотите посчитать?\n1. E\t2. L");
        double n = s.nextDouble();
        while (n != 1 && n != 2) {
            System.out.println("Повторите попытку");
            n = s.nextDouble();
        }
        if (n == 1) {
            System.out.println("Введите переменную у");
            double y1 = s.nextDouble();
            System.out.println("Введите переменную q");
            double q = s.nextDouble();

            System.out.println("E = " + f1(y1, q));
        } else if (n == 2) {
            System.out.println("Введите переменную х");
            double x = s.nextDouble();
            System.out.println("Введите переменную y");
            double y2 = s.nextDouble();
            System.out.println("Введите переменную z");
            double z = s.nextDouble();

            System.out.println("L = " + f2(x, y2, z));
        }
    }
}