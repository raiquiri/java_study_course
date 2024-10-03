package laba5;

public class task6_1_5 {

    public static boolean Oblast(double x, double y) {
        if (f1(x,y) && f2(x,y) && f3(x,y)) {
            return true;
        } else {
           return false;
        }
    }
    public static double k(double x1, double y1, double x2, double y2) {
        return (y1-y2)/(x1-x2);
    }

    public static double b(double x1 , double y1, double x2, double y2) {
        return y1 - x1 * k(x1,y1,x2,y2);
    }

    public static boolean f1(double x, double y) {
        if ( y <= Math.pow(Math.pow(6,2) - Math.pow(x,2),1/2.f)
                && y >= -1 * Math.pow(Math.pow(6,2) - Math.pow(x,2),1/2.f)
                && x <= 0) {
            return true;
        } else return false;
    }

    public static boolean f2(double x, double y) {
        if ( y <= Math.pow(Math.pow(2,2) - Math.pow(x+2,2),1/2.f) + 3
                && y >= -1 * (Math.pow(Math.pow(2,2) - Math.pow(x+2,2),1/2.f)) + 3) {
            if ( y <= Math.pow(Math.pow(1,2) - Math.pow(x+1,2),1/2.f) + 3
                    && y >= -1 * (Math.pow(Math.pow(1,2) - Math.pow(x+1,2),1/2.f)) + 3) {
                return true;
            } else return false;
        } else return true;
    }

    public static boolean f3(double x, double y) {
        if ( y <= k(-5,0,0,1)*x + b(-5,0,0,1)
                && y >= k(-5,-3,0,-5)*x + b(-5,-3,0,-5)
                && x >= -5) {
            if (( y <= Math.pow(Math.pow(1,2) - Math.pow(x + 3,2),1/2.f) -1
                    && y >= -1 * (Math.pow(Math.pow(1,2) - Math.pow(x + 3,2),1/2.f)) - 1)
                    || (y <= Math.pow(Math.pow(1,2) - Math.pow(x + 1,2),1/2.f) - 3
                    && y >= -1 * (Math.pow(Math.pow(1,2) - Math.pow(x + 1,2),1/2.f)) -3)) {
                return true;
            } else return false;
        } else return true;
    }
}