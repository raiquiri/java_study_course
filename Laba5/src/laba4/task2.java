package laba4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите х");
        double a, b, c, max, min, x = n.nextDouble();
        a = Math.pow(x, 3)/6 - Math.pow(x, 2);
        b = Math.log(x)/x;
        c = Math.pow(Math.E, x) - Math.pow(x, Math.E);
        if (x == 0) {
            max = Math.max(a,c);
            min = Math.min(a,c);
            System.out.println("Выражение ln(x)/x не имеет решения");
            System.out.println(min + " " + max);
        } else if (x < 0) {
            System.out.println("Выражения ln(x)/x и e^x-x^e не имеют решений");
            System.out.println(a);
        } else {
            max = Math.max(Math.max(a, b),c);
            min = Math.min(Math.min(a, b),c);
            System.out.println(min + "; " + (a+b+c-max-min) + "; " + max);
        }
    }
}

