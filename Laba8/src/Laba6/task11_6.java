import java.util.Scanner;

public class task11_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество треугольников");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int[2][3*n];
        double[][] b = new double[3][n];

        fill(a, n);
        output(a, n);
        check1(a, b, n);
        System.out.println();
        check2(a, b, n);
        System.out.println();
        check3(a, b, n);
    }
    public static void check1(int[][] a, double[][] b, int n) {
        System.out.println("Проверка №1:\n1 - треугольник существует\n0 - треугольник не существует\n");
        int k = 0;
        while ( k < n) {
            double ab = Math.pow(Math.pow(a[0][0+3*k] - a[0][1+3*k],2) +
                    Math.pow(a[1][0+3*k] - a[1][1+3*k],2),1/2.f);
            double bc = Math.pow(Math.pow(a[0][1+3*k] - a[0][2+3*k],2) +
                    Math.pow(a[1][1+3*k] - a[1][2+3*k],2),1/2.f);
            double ac = Math.pow(Math.pow(a[0][0+3*k] - a[0][2+3*k],2) +
                    Math.pow(a[1][0+3*k] - a[1][2+3*k],2),1/2.f);
            if (ab < bc + ac && bc < ab + ac && ac < ab + bc) {
                b[0][k] = 1;
                System.out.print("№" + (k+1) + ". 1\t");
            } else {
                b[0][k] = 0;
                System.out.print("№" + (k+1) + ". 0\t");
            }
            k++;
        }
    }
    public static void check2(int[][] a, double[][] b, int n) {
        System.out.println("\nПроверка №2:\n1 - треугольник равносторонний\n2 - треугольник прямоугольный\n" +
                "3 - равнобедренный\n4 - треугольник произвольный\n0 - треугольник не существует\n");
        int k = 0;
        while (k < n) {
            double ab = Math.pow(Math.pow(a[0][1 + 3 * k] - a[0][0 + 3 * k], 2) +
                    Math.pow(a[1][1 + 3 * k] - a[1][0 + 3 * k], 2), 1 / 2.f);
            double bc = Math.pow(Math.pow(a[0][2 + 3 * k] - a[0][1 + 3 * k], 2) +
                    Math.pow(a[1][2 + 3 * k] - a[1][1 + 3 * k], 2), 1 / 2.f);
            double ac = Math.pow(Math.pow(a[0][2 + 3 * k] - a[0][0 + 3 * k], 2) +
                    Math.pow(a[1][2 + 3 * k] - a[1][0 + 3 * k], 2), 1 / 2.f);

            double corner_a = Math.round(Math.acos(((a[0][1 + 3 * k] - a[0][0 + 3 * k]) * (a[0][2 + 3 * k] - a[0][1 + 3 * k]) +
                    (a[1][1 + 3 * k] - a[1][0 + 3 * k]) * (a[1][2 + 3 * k] - a[1][1 + 3 * k])) / (ab * bc)) * 180 / Math.PI);
            double corner_b = Math.round(Math.acos(((a[0][2 + 3 * k] - a[0][1 + 3 * k]) * (a[0][2 + 3 * k] - a[0][0 + 3 * k]) +
                    (a[1][2 + 3 * k] - a[1][1 + 3 * k]) * (a[1][2 + 3 * k] - a[1][0 + 3 * k])) / (bc * ac)) * 180 / Math.PI);
            double corner_c = Math.round(Math.acos(((a[0][1 + 3 * k] - a[0][0 + 3 * k]) * (a[0][2 + 3 * k] - a[0][0 + 3 * k]) +
                    (a[1][1 + 3 * k] - a[1][0 + 3 * k]) * (a[1][2 + 3 * k] - a[1][0 + 3 * k])) / (ab * ac)) * 180 / Math.PI);

            while (corner_a + corner_b + corner_c != 180) {
                int random = (int) ((Math.random()*((3-1)+1)) + 1);
                if (random == 1) {
                    corner_a = 180 - corner_a;
                } else if (random == 2) {
                    corner_b = 180 - corner_b;
                } else if (random == 3) {
                    corner_c = 180 - corner_c;
                }
            }

            if (ab == bc && bc == ac && ab == ac) {
                b[1][k] = 1;
                System.out.print("№" + (k+1) + ". 1\t");
            } else if (b[0][k] == 0) {
                b[1][k] = 0;
                System.out.print("№" + (k+1) + ". 0\t");
            } else if (corner_a == 90 || corner_b == 90 || corner_c == 90){
                b[1][k] = 2;
                System.out.print("№" + (k+1) + ". 2\t");
            } else if (corner_a == corner_b || corner_b == corner_c || corner_a == corner_c) {
                b[1][k] = 3;
                System.out.print("№" + (k+1) + ". 3\t");
            } else if (b[0][k] == 1) {
                b[1][k] = 4;
                System.out.print("№" + (k+1) + ". 4\t");
            }
            k++;
        }
    }
    public static void check3(int[][] a, double[][] b, int n) {
        System.out.println("\nПроверка №3:\nS - площадь\n0 - треугольник не существует\n");
        int k = 0;
        while (k < n) {
            double ab = Math.pow(Math.pow(a[0][0 + 3 * k] - a[0][1 + 3 * k], 2) +
                    Math.pow(a[1][0 + 3 * k] - a[1][1 + 3 * k], 2), 1 / 2.f);
            double bc = Math.pow(Math.pow(a[0][1 + 3 * k] - a[0][2 + 3 * k], 2) +
                    Math.pow(a[1][1 + 3 * k] - a[1][2 + 3 * k], 2), 1 / 2.f);
            double ac = Math.pow(Math.pow(a[0][0 + 3 * k] - a[0][2 + 3 * k], 2) +
                    Math.pow(a[1][0 + 3 * k] - a[1][2 + 3 * k], 2), 1 / 2.f);

            double p = (ab + bc + ac) * 0.5;
            double s = Math.pow(p * (p-ab) * (p-bc) * (p-ac),1/2.f);

            if (b[0][k] == 1) {
                b[2][k] =  s;
                System.out.print("№" + (k+1) + ". " + s + "\t");
            } else {
                b[2][k] = 0;
                System.out.print("№" + (k+1) + ". 0\t");
            }
            k++;
        }
    }
    public static void fill(int[][] a, int n) {
        Scanner s = new Scanner(System.in);
        for (int i = 0 ; i < 3*n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Введите координату х точки №" + (i+1));
                    a[j][i] = s.nextInt();
                } else {
                    System.out.println("Введите координату у точки №" + (i+1));
                    a[j][i] = s.nextInt();
                }
            }
        }
    }
    public static void output(int[][] a, int n) {
        for (int i = 0 ; i < 2; i++) {
            for (int j = 0; j < 3*n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
