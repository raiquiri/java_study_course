public class function_6 {
    public static double k(double x1, double y1, double x2, double y2) {
        return (y1 - y2) / (x1 - x2);
    }

    public static double b(double x1, double y1, double x2, double y2) {
        return y1 - x1 * k(x1, y1, x2, y2);
    }

    public static int figura1(double x, double y) {
        if (y > k(-1, -1, 2, 0) * x + b(-1, -1, 2, 0)
                && y < k(1, 5, 2, 0) * x + b(1, 5, 2, 0)
                && y < 5 && x > -1) {
            return 1;
        } else if ((y == k(-1, -1, 2, 0) * x + b(-1, -1, 2, 0) && x >= -1 && x <= 2)
                || (y == k(1, 5, 2, 0) * x + b(1, 5, 2, 0) && x >= 1 && x <=2)
                || (y == 5 && x >= -1 && x <= 1)) {
            return 0;
        } else return -1;
    }

    public static int figura2(double x, double y) {
        if (y > k(-1, -1, 1, -3) * x + b(-1, -1, 1, -3)
                && y > k(1, -3, 2, 0) * x + b(1, -3, 2, 0)
                && y < k(-1, -1, 2, 0) * x + b(-1, -1, 2, 0)) {
            return 1;
        } else if ((y == k(-1, -1, 1, -3) * x + b(-1, -1, 1, -3) && x >= -1 && x <= 1)
                || (y == k(1, -3, 2, 0) * x + b(1, -3, 2, 0) && x >= 1 && x <= 2)
                || (y == k(-1, -1, 2, 0) * x + b(-1, -1, 2, 0) && x >= -1 && x <= 2)) {
            return 0;
        } else return-1;
    }

    public static int figura3(double x, double y) {
        if (y < Math.pow(Math.pow(2, 2) - Math.pow(x + 1, 2), 1 / 2.f) + 1
                && y > -1 * (Math.pow(Math.pow(2, 2) - Math.pow(x + 1, 2), 1 / 2.f) + 1)
                && x < -1) {
            return 1;
        } else if (((y == Math.pow(Math.pow(2, 2) - Math.pow(x + 1, 2), 1 / 2.f) + 1 && y > -1 * (Math.pow(Math.pow(2, 2) - Math.pow(x + 1, 2), 1 / 2.f)) + 1 && x < -1)
                || (y == -1 * Math.pow(Math.pow(2, 2) - Math.pow(x + 1, 2), 1 / 2.f) + 1 && y < Math.pow(Math.pow(2, 2) - Math.pow(x + 1, 2), 1 / 2.f) + 1 && x <-1)
                || (x == -1 && y >= -1 && y <= 3))) {
            return 0;
        } else return -1;
    }
    public static int figura4(double x, double y) {
        if (y < k(5, -2, 6, -1) * x + b(5, -2, 6, -1)
                && y > k(5, -2, 7, -3) * x + b(5, -2, 7, -3)
                && y < k(6, -1, 7, -3) * x + b(6, -1, 7, -3)) {
            return 1;
        } else if ((y == k(5, -2, 6, -1) * x + b(5, -2, 6, -1) && x >= 5 && x <= 6)
                || (y == k(5, -2, 7, -3) * x + b(5, -2, 7, -3) && x >= 5 && x <= 7)
                || (y == k(6, -1, 7, -3) * x + b(6, -1, 7, -3) && x >= 6 && x <= 7)) {
            return 0;
        } else return -1;
    }

    public static int figura5(double x, double y) {
        if (y < Math.pow(Math.pow(2, 2) - Math.pow(x - 4, 2), 1 / 2.f) - 1
                && y < k(2, -1, 4, 1) * x + b(2, -1, 4, 1)
                && y > -1 * (Math.pow(Math.pow(2, 2) - Math.pow(x - 4, 2), 1 / 2.f)) - 1
                && y > k(4, -3, 6, -1) * x + b(4, -3, 6, -1)) {
            return 1;
        } else if ((y == Math.pow(Math.pow(2, 2) - Math.pow(x - 4, 2), 1 / 2.f) - 1
                && y == k(2, -1, 4, 1) * x + b(2, -1, 4, 1))
                || (y == -1 * (Math.pow(Math.pow(2, 2) - Math.pow(x - 4, 2), 1 / 2.f)) - 1
                && y == k(4, -3, 6, -1) * x + b(4, -3, 6, -1))) {
            return 0;
        } else return -1;
    }

    public static int figura6(double x, double y) {
        if (y < k(2, -1, 3, 0) * x + b(2, -1, 3, 0)
                && y > k(2, -1, 4, -2) * x + b(2, -1, 4, -2)
                && y < k(3, 0, 4, -2) * x + b(3, 0, 4, -2)) {
            return -1;
        } else if ((y == k(2, -1, 3, 0) * x + b(2, -1, 3, 0) && x >= 2 && x <= 3)
                || (y == k(2, -1, 4, -2) * x + b(2, -1, 4, -2) && x >= 2 && x <= 4)
                || (y == k(3, 0, 4, -2) * x + b(3, 0, 4, -2) && x >= 3 && x <= 4)) {
            return 0;
        } else return 1;
    }
}
