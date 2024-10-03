package laba5;

public class task10_5 {
    public static void main(String[] args) {
        System.out.println("1. при n = 10\t\t" + f1(10));
        System.out.println("2. при n = 100\t\t" + f1(100));
        System.out.println("3. при n = 1000\t\t" + f1(1000));
        System.out.println("4. при n = 10000\t" + f1(10000));

    }
    public static double f1(int n) {
        double a = 1, b = 2, sum = 0;
        double h = (b-a) / n;
        for (int i = 1; i <= n; i++) {
            double y = Math.exp(2 * a - 5) + Math.pow(a,5) - Math.pow(a,3);
            double y1 = Math.exp(2 * (a + h) - 5) + Math.pow(a+h,5) - Math.pow(a+h,3);
            sum += (y + y1) * h/2;
            a += h;
        }
        return sum;
    }
}
