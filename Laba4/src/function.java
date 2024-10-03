public class function {
    public static void main(String[] args) {
        for ( int i = 0; i <= 10; i++) {
            double x = Math.round(((Math.random() * ((8 + 3) + 1)) - 3)*10);
            x = x/10;
            double y = Math.round(((Math.random() * ((5 + 3) + 1)) - 3)*10);
            y = y/10;

            if (figura1(x, y) || figura2(x, y) || figura3(x, y)) {
                System.out.println("x = " + x + " y = " + y);
                System.out.println("Точка попала в левую область");
            } else if ((figura4(x, y) || figura5(x, y)) && figura6(x, y)) {
                System.out.println("x = " + x + " y = " + y);
                System.out.println("Точка попала в правая область");
            } else {
                System.out.println("x = " + x + " y = " + y);
                System.out.println("Точка не попала в область");
            }
        }

    }
    public static double k(double x1, double y1, double x2, double y2) {
        return (y1-y2)/(x1-x2);
    }
    public static double b(double x1 , double y1, double x2, double y2) {
        return y1 - x1 * k(x1,y1,x2,y2);
    }

    public static boolean figura1(double x, double y) {
        if ( y >= k(-1,-1,2,0)*x + b(-1,-1,2,0)
                && y <= k(1,5,2,0)*x + b(1,5,2,0)
                && y <= 5 && x >= -1  ) {
            return true;
        } else return false;
    }

    public static boolean figura2(double x, double y) {
        if ( y >= k(-1,-1,1,-3)*x + b(-1,-1,1,-3)
                && y >= k(1,-3,2,0)*x + b(1,-3,2,0)
                && y <= k(-1,-1,2,0)*x + b(-1,-1,2,0)) {
            return true;
        } else return false;
    }

    public static boolean figura3(double x, double y) {
        if (y <= Math.pow(Math.pow(2,2)-Math.pow(x+1,2),1/2.f) + 1
                && y >= -1 * (Math.pow(Math.pow(2,2)-Math.pow(x+1,2),1/2.f) + 1)
                && x <= -1) {
            return true;
        } else return false;
    }

    public static boolean figura4(double x, double y) {
        if ( y <= k(5,-2,6,-1)*x + b(5,-2,6,-1)
                && y >= k(5,-2,7,-3)*x + b(5,-2,7,-3)
                && y <= k(6,-1,7,-3)*x + b(6,-1,7,-3)) {
            return true;
        } else return false;
    }

    public static boolean figura5(double x, double y) {
        if ( y <= Math.pow(Math.pow(2,2) - Math.pow(x-4,2),1/2.f) -1
                && y <= k(2,-1,4,1)*x + b(2,-1,4,1)
                && y >= -1 * (Math.pow(Math.pow(2,2) - Math.pow(x-4,2),1/2.f)) -1
                && y >= k(4,-3,6,-1)*x + b(4,-3,6,-1)) {
            return true;
        } else return false;
    }

    public static boolean figura6(double x, double y) {
        if ( y <= k(2,-1,3,0)*x + b(2,-1,3,0)
                && y > k(2,-1,4,-2)*x + b(2,-1,4,-2)
                && y < k(3,0,4,-2)*x + b(3,0,4,-2)) {
            return false;
        } else return true;
    }
}
