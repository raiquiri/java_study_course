import java.util.Scanner;

public class task6_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число строк матрицы");
        int m = s.nextInt();
        while (m < 1) {
            System.out.println("Повторите попытку");
            m = s.nextInt();
        }
        System.out.println("Введите число столбцов матрицы");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }

        int[][] a = new int[m][n];
        fill(a, m, n);
        output(a, m, n);
        System.out.println("Точки локального максимума:");
        max(a, m, n);
        System.out.println("\nТочки локального минимума:");
        min(a, m, n);
    }
    public static void fill(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) ((Math.random() * (100 - 10)) + 10);
            }
        }
    }
    public static void output(int[][] a, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void max(int[][] a, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (a[i][j] > a[i+1][j] && a[i][j] > a[i][j+1] && a[i][j] > a[i+1][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == 0 && j != n - 1 && j != 0) {
                    if (a[i][j] > a[i][j-1] && a[i][j] > a[i+1][j-1] && a[i][j] > a[i+1][j] &&
                            a[i][j] > a[i+1][j+1] && a[i][j] > a[i][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == 0 && j == n - 1) {
                    if (a[i][j] > a[i][j-1] && a[i][j] > a[i+1][j-1] && a[i][j] > a[i+1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (j == 0 && i != 0 && i != m - 1) {
                    if (a[i][j] > a[i-1][j] && a[i][j] > a[i-1][j+1] && a[i][j] > a[i][j+1] &&
                            a[i][j] > a[i+1][j+1] && a[i][j] > a[i+1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == m - 1 && j == 0) {
                    if (a[i][j] > a[i-1][j] && a[i][j] > a[i-1][j+1] && a[i][j] > a[i][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == m - 1 && j != 0 && j != n - 1) {
                    if (a[i][j] > a[i][j-1] && a[i][j] > a[i-1][j-1] && a[i][j] > a[i-1][j] &&
                            a[i][j] > a[i-1][j+1] && a[i][j] > a[i][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == m - 1 && j == n - 1) {
                    if (a[i][j] > a[i][j-1] && a[i][j] > a[i-1][j-1] && a[i][j] > a[i-1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (j == n - 1 && i != 0 && i != m - 1) {
                    if (a[i][j] > a[i+1][j] && a[i][j] > a[i+1][j-1] && a[i][j] > a[i][j-1] &&
                            a[i][j] > a[i-1][j-1] && a[i][j] > a[i-1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else {
                    if (a[i][j] > a[i-1][j] && a[i][j] > a[i-1][j-1] && a[i][j] > a[i][j-1] &&
                            a[i][j] > a[i+1][j] && a[i][j] > a[i+1][j+1] && a[i][j] > a[i][j+1] &&
                            a[i][j] > a[i-1][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                }
            }
        }
    }
    public static void min(int[][] a, int m, int n) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    if (a[i][j] < a[i+1][j] && a[i][j] < a[i][j+1] && a[i][j] < a[i+1][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == 0 && j != n - 1 && j != 0) {
                    if (a[i][j] < a[i][j-1] && a[i][j] < a[i+1][j-1] && a[i][j] < a[i+1][j] &&
                            a[i][j] < a[i+1][j+1] && a[i][j] < a[i][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == 0 && j == n - 1) {
                    if (a[i][j] < a[i][j-1] && a[i][j] < a[i+1][j-1] && a[i][j] < a[i+1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (j == 0 && i != 0 && i != m - 1) {
                    if (a[i][j] < a[i-1][j] && a[i][j] < a[i-1][j+1] && a[i][j] < a[i][j+1] &&
                            a[i][j] < a[i+1][j+1] && a[i][j] < a[i+1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == m - 1 && j == 0) {
                    if (a[i][j] < a[i-1][j] && a[i][j] < a[i-1][j+1] && a[i][j] < a[i][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == m - 1 && j != 0 && j != n - 1) {
                    if (a[i][j] < a[i][j-1] && a[i][j] < a[i-1][j-1] && a[i][j] < a[i-1][j] &&
                            a[i][j] < a[i-1][j+1] && a[i][j] < a[i][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (i == m - 1 && j == n - 1) {
                    if (a[i][j] < a[i][j-1] && a[i][j] < a[i-1][j-1] && a[i][j] < a[i-1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else if (j == n - 1 && i != 0 && i != m - 1) {
                    if (a[i][j] < a[i+1][j] && a[i][j] < a[i+1][j-1] && a[i][j] < a[i][j-1] &&
                            a[i][j] < a[i-1][j-1] && a[i][j] < a[i-1][j]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                } else {
                    if (a[i][j] < a[i-1][j] && a[i][j] < a[i-1][j-1] && a[i][j] < a[i][j-1] &&
                            a[i][j] < a[i+1][j] && a[i][j] < a[i+1][j+1] && a[i][j] < a[i][j+1] &&
                            a[i][j] < a[i-1][j+1]) {
                        System.out.print(a[i][j] + " (" + (i+1) + ";" + (j+1) + ")\t");
                    }
                }
            }
        }
    }
}