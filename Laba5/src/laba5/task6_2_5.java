package laba5;

import java.util.Scanner;

public class task6_2_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        func();

        System.out.println("Вы хотите повторить попытку?\n1. Да\t2. Нет");
        double n = s.nextDouble();
        while (n != 1 && n != 2) {
            System.out.println("Повторите попытку");
            n = s.nextDouble();
        }
        while (n == 1) {
            func();
            System.out.println("Вы хотите повторить попытку?\n1. Да\t2. Нет");
            n = s.nextDouble();
        }
        System.out.println("Всего доброго <3");
    }

    public static void func() {
        Scanner s = new Scanner(System.in);
        task6_1_5 body = new task6_1_5();

        System.out.println("Введите переменую х");
        double x = s.nextDouble();

        System.out.println("Введите переменную у");
        double y = s.nextDouble();

        if (body.Oblast(x, y)) {
            System.out.println("Точка попала в область");
        } else {
            System.out.println("Точка не попала в область");
        }
    }
}