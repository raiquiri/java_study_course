import java.util.Scanner;

public class task3_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество точек");
        int n = s.nextInt();
        while (n < 3) {
            System.out.println("Попробуйте ещё разок");
            n = s.nextInt();
        }
        int[] a = new int[2 * n];
        int[] b = new int[n];
        fill(a, n);
        outputa(a, n);
        check(a, b, n);
        outputb(b, n);
    }
    public static void check(int[] a,int[] b, int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= n/3; i++) {

                double ab = Math.pow(Math.pow(a[2 + 2 * i] - a[0 + 2 * i], 2) +
                        Math.pow(a[3 + 2 * i] - a[1 + 2 * i], 2), 1 / 2.f);
                double bc = Math.pow(Math.pow(a[4 + 2 * i] - a[2 + 2 * i], 2) +
                        Math.pow(a[5 + 2 * i] - a[3 + 2 * i], 2), 1 / 2.f);
                double ac = Math.pow(Math.pow(a[4 + 2 * i] - a[0 + 2 * i], 2) +
                        Math.pow(a[5 + 2 * i] - a[1 + 2 * i], 2), 1 / 2.f);

                double corner_a = Math.acos(((a[2 + 2 * i] - a[0 + 2 * i]) * (a[4 + 2 * i] - a[2 + 2 * i]) +
                        (a[3 + 2 * i] - a[1 + 2 * i]) * (a[5 + 2 * i] - a[3 + 2 * i])) / (ab * bc)) * 180 / Math.PI;
                double corner_b = Math.acos(((a[4 + 2 * i] - a[2 + 2 * i]) * (a[4 + 2 * i] - a[0 + 2 * i]) +
                        (a[5 + 2 * i] - a[3 + 2 * i]) * (a[5 + 2 * i] - a[1 + 2 * i])) / (bc * ac)) * 180 / Math.PI;
                double corner_c = Math.acos(((a[2 + 2 * i] - a[0 + 2 * i]) * (a[4 + 2 * i] - a[0 + 2 * i]) +
                        (a[3 + 2 * i] - a[1 + 2 * i]) * (a[5 + 2 * i] - a[1 + 2 * i])) / (ab * ac)) * 180 / Math.PI;

                if (corner_a + corner_b + corner_c != 180) {
                    corner_a = 180 - corner_a;
                    if (corner_a + corner_b + corner_c != 180) {
                        corner_b = 180 - corner_b;
                        if (corner_a + corner_b + corner_c != 180) {
                            corner_c = 180 - corner_c;

                        }
                    }
                }
                if (ab < bc + ac && bc < ab + ac && ac < ab + bc) {
                    if (corner_a == corner_b || corner_b == corner_c || corner_a == corner_c) {
                        System.out.println(corner_a + " " + corner_b + " " + corner_c);
                        b[j] = 1;
                    }
                }else {
                    System.out.println(corner_a + " " + corner_b + " " + corner_c);
                    b[j] = 0;
                }
            }
        }
    }
    public static void fill(int[] a, int n) {
        Scanner s = new Scanner(System.in);
        int k = 1;
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                System.out.println("Введите коордтнату х точки №" + k);
                a[i] = s.nextInt();
            } else {
                System.out.println("Введите координату у точки №" + k);
                a[i] = s.nextInt();
            }
            if (i % 2 == 1) {
                k++;
            }
        }
    }
    public static void outputa(int[] a, int n) {
        System.out.println();
        for (int i = 0; i < 2*n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
    public static void outputb(int[] b, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + "\t");
        }
    }
}