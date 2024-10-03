package Laba4;

public class task3_4 {
    public static void main(String[] args) {
        for(double x = -3; x <= 3; x = x + 0.5) {
            if ( x >= 0 ) {
                double f = Math.pow(Math.E,x) - 5 * x;
                System.out.println("при х = " + x + " f = " + f);
            } else if (x < 0) {
                double f = 2 * Math.sin(x) * Math.cos(x);
                System.out.println("при х = " + x + " f = " + f);
            }
        }
    }
}
