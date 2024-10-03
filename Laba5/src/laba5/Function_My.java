package laba5;

public class Function_My {

    public static double f1(double y, double q) {

        double e, f1, f2;
        f1 = Math.pow(3*Math.pow(y,2) + 0.5*y + 4, 1/2.f);
        f2 = Math.log(0.7*y + 2*q);
        e = f2/f1;

        return e;

    }
    public static double f2(double x, double y1, double z) {

        double l, f1, f2, f3, f4, f5;
        f1 = Math.cos(Math.pow(x,2))/Math.pow(Math.E,Math.pow(y1,3) + 1);
        f2 = Math.sin(Math.pow(y1,2))/Math.pow(Math.PI, Math.pow(x,3) + 1);
        f3 = Math.pow(x + Math.pow(Math.E, y1 + Math.pow(z, 2)), 1/3.f);
        f4 = Math.pow(x * y1 * z + f3,1/4.f);
        f5 = f4/3.f;
        l = f5 * (1 + f1 + f2);

        return l;
    }
}