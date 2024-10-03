package laba5;

public class task3_5 {
    public static void main(String[] args) {
        System.out.println("1. " + f1());
        System.out.println("2. " + f2());
        System.out.println("3. " + f3());
    }

    public static double f1() {
        double si = 0;
        double sj = 0;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                sj += Math.log(Math.pow(j + 1, i));
            }
            si += sj;
            sj = 0;
        }
        return si;
    }

    public static double f2() {
        double pi = 1;
        double pj = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                pj *= ((Math.cos(j) + Math.sin(i))/ (Math.sin(j) * Math.cos(i)));
            }
            pi *= pj;
            pj = 1;
        }
        return pi;
    }

    public static double f3() {
        double sk = 0;
        double sj = 0;
        double pi = 1;
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j <= 2*i-1; j++) {
                for (int k = i + j; k <= 2*(i+j); k++) {
                    sk += (2*j - 3*Math.log(Math.abs(( Math.cos( i-0.5*k)))));
                }
                sj += sk;
                sk = 0;

            }
            pi *= sj;
            sj = 0;
        }
        return pi;
    }
}

