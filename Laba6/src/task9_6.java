import java.util.Scanner;

public class task9_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите n - половина от порядка матрицы");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int[2*n][2*n];
        part1(a, n);
        part2(a, n);
        part3(a, n);
        part4(a, n);
        output(a, n);
    }
    public static void output(int[][] a, int n) {
        for (int i = 0; i < 2*n; i++) {
            for (int j = 0; j < 2*n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void part1(int[][] a, int n) {
        int k =0, score = 1;
        while (k < n/2) {
            for (int i = 0; i < n - 2*k; i++) {
                a[k][i+k] = score++;
            }
            for (int i = 0; i < n - 2*k - 1; i++) {
                a[i+k+1][n-k-1] = score++;
            }
            for (int i = 0; i < n - 2*k - 1 ; i++) {
                a[i+k+1][k] = score++;
            }
            for (int i = 0; i < n - 2*k - 2; i++) {
                a[n-k-1][i+k+1] = score++;
            }
            k++;
        }
        if (n % 2 == 1) {
            a[n/2][n/2] = score;
        }
    }
    public static void part2(int[][] a, int n) {
        int k = 0,f = 0, score = 1;
        while (k < n/2) {
            for (int i = 0; i < n - (n-1) + 2*k; i++) {
                a[n-2*k+i-1][n+i] = score++;
            }
            for (int i = 0; i < n - (n-2) + 2*k; i++) {
                a[n-i-1][n+2*k-i+1] = score++;
            }
            k++;
        }
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                a[i][n+i] = score++;
            }
            while (f < n/2) {
                for (int i = 0; i < n - 1 - 2 * f; i++) {
                    a[n - 2 * f - i - 2][2 * n - i - 1] = score++;
                }
                for (int i = 0; i < n - 2 - 2 * f; i++) {
                    a[i][n + i + 2 * f + 2] = score++;
                }
                f++;
            }
        } else {
            while (f < n/2) {
            for (int i = 0; i < n - 1 - 2 * f; i++) {
                a[i][n + i + 2 * f + 1] = score++;
            }
            for (int i = 0; i < n - 2 - 2 * f; i++) {
                a[n - 2 * f - i - 3][2 * n - i - 1] = score++;
            }
            f++;
            }
        }
    }
    public static void part3(int[][] a, int n) {
        int k =0, score = 1;
        while (k < n/2) {
            for (int i = 0; i < n - 2*k; i++) {
                a[n+k][n+i+k] = score++;
            }
            for (int i = 0; i < n - 2*k - 1; i++) {
                a[n+i+k+1][2*n-k-1] = score++;
            }
            for (int i = 0; i < n - 2*k - 1 ; i++) {
                a[n+i+k+1][n+k] = score++;
            }
            for (int i = 0; i < n - 2*k - 2; i++) {
                a[2*n-k-1][n+i+k+1] = score++;
            }
            k++;
        }
        if (n % 2 == 1) {
            a[n+n/2][n+n/2] = score;
        }
    }
    public static void part4(int[][] a, int n) {
        int k = 0,f = 0, score = 1;
        while (k < n/2) {
            for (int i = 0; i < n - (n-1) + 2*k; i++) {
                a[2*n-2*k+i-1][i] = score++;
            }
            for (int i = 0; i < n - (n-2) + 2*k; i++) {
                a[2*n-i-1][2*k-i+1] = score++;
            }
            k++;
        }
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                a[n+i][i] = score++;
            }
            while (f < n/2) {
                for (int i = 0; i < n - 1 - 2 * f; i++) {
                    a[2 * n - 2 * f - i - 2][n - i - 1] = score++;
                }
                for (int i = 0; i < n - 2 - 2 * f; i++) {
                    a[n + i][i + 2 * f + 2] = score++;
                }
                f++;
            }
        } else {
            while (f < n/2) {
                for (int i = 0; i < n - 1 - 2 * f; i++) {
                    a[n + i][i + 2 * f + 1] = score++;
                }
                for (int i = 0; i < n - 2 - 2 * f; i++) {
                    a[2 * n - 2 * f - i - 3][n - i - 1] = score++;
                }
                f++;
            }
        }
    }
}