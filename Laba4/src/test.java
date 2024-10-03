import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите координату х");
        double x = input.nextDouble();

        System.out.println("Введите координату у");
        double y = input.nextDouble();

        if (f1(x,y)) {
            System.out.println("Точка попала в область №1");
        }

    }
    public static boolean f1 (double x, double y) {
        if (y < k(1,4,5,7)*x + b(1,4,5,7)
        && y > k(1,4,7,1)*x + b(1,4,7,1)
        && y < k(7,1,5,7)*x + b(7,1,5,7)) {
            return true;
        }
        return false;
    }
    public static double k(double x1, double y1, double x2, double y2) {
        return (y1-y2)/(x1-x2);
    }
    public static double b(double x1 , double y1, double x2, double y2) {
        return y1 - x1 * k(x1,y1,x2,y2);
    }
}
