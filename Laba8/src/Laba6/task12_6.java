import java.util.Scanner;

public class task12_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размерность матрицы A");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int[n][n];
        double[][] b = new double[n][n];
        double[][] c = new double[n][n];

        fill(a, n);
        System.out.println("Матрица А:");
        outputa(a, n);
        System.out.println("Введите обратную матрицу, матрице выше:");
        handfill(b, n);
        System.out.println("Матрица В:");
        outputb(b, n);
        rev(a, b, c, n);
        System.out.println("Проверка:");
        outputb(c, n);
        check(c, n);

    }
    public static void fill(int[][] a, int n) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите член строки №" + (i + 1) + " столбца №" + (j + 1) + " = ");
                a[i][j] = s.nextInt();
            }
        }
    }
    public static void handfill(double[][] b, int n) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите член строки №" + (i+1) + " столбца №" + (j+1) + " = ");
                b[i][j] = s.nextDouble();
            }
        }
    }
    public static void rev(int[][] a, double[][] b, double[][] c, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    public static void check(double[][] c, int n) {
        boolean check = true;
        boolean check1 = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (c[i][j] == 1) {
                        check = true;
                    } else {
                        check = false;
                    }
                } else if (i != j) {
                    if (c[i][j] == 0) {
                        check1 = true;
                    } else {
                        check1 = false;
                    }
                }
            }
        }
        if (check && check1) {
            System.out.println("Вы ввели правильно обратную матрицу");
        } else {
            System.out.println("К сожалению, вы допустили ошибку в рассчетах");
        }
    }
    public static void outputa(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void outputb(double[][] b, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}