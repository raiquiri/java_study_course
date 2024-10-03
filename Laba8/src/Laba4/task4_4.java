import java.util.Scanner;

public class task4_4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите х");
        double y, x = n.nextDouble();
        if (x < -3) {
            y = Math.tan(x);
            System.out.println("y = " + y);
        } else if (x > -3 & x < 3) {
            y = 1/Math.tan(x);
            System.out.println("y = " + y);
        } else if ( x > 3 ) {
            y = Math.pow(Math.abs(4-x),1/2.f)/(2 + Math.pow(x,2));
            System.out.println("y = " + y);
        } else if ( x == -3 || x == 3) {
            y = Math.PI;
            System.out.println("y = " + y);
        }
    }
}