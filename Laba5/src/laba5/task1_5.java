package laba5;

import java.util.Scanner;

public class task1_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите х");
        double x = s.nextDouble();
        System.out.println("Введите N");
        double n = s.nextDouble();

        while (n < 0) {
            System.out.println("Повторите попытку");
            n = s.nextDouble();
        }
        System.out.println("Введите M");
        double m = s.nextDouble();

        double f = 0, sum = 0, sum1 = 0;

        for(int i = 1 ; i <= n; i ++) {
            f = Math.pow(-1,i+1)*(Math.pow(x,2*i-1)/(Math.cos(i)-Math.sin(i)));
            sum += f;
           System.out.println(i + ". " + f);
            if (sum < m) {
                sum1 += f;
            }
        }
        System.out.println("Сумма первых "+ n + " членов " + sum);
        System.out.println("");
        System.out.println("Сумма первых "+ n + " членов, меньше чем " + m + " равна " +sum1);
    }
}