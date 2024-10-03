import java.util.Scanner;

public class task7_4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите x в интервале от -4 до 4");
        double x = n.nextDouble();
        while (x > 4 | x < -4) {
            System.out.println("Попробуйте ещё раз");
            x = n.nextDouble();
        }
        System.out.println("g = " + G(x) + " z = " + Z(x));
    }
    public static double G(double x) {
        double g = 0 ;
        if (x <= 0 ) {
            g = 3*Math.pow(x,2)/(1 + Math.pow(x,2));
        } else if (x > 0) {
            g = Math.pow(1 + 2*x/(1 + Math.pow(x,2)),1/2.f);
        }
        return g;
    }
    public static double Z(double x) {
        double z = 0;
        if (x < 0) {
            z = 3 * x + Math.pow(1 + Math.pow(x,2),1/2.f);
        } else if (x >= 0 & x <= 1) {
            z = 2 * Math.cos(x)*Math.pow(Math.E,-2 * x);
        } else if (x > 1) {
            z = 2 * Math.sin(3*x);
        }
        return z;
    }
}
