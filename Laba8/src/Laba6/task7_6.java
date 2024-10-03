package Laba6;
import java.util.Scanner;

public class task7_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = s.nextInt();
        while (n <= 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int [n][n];
        if(n % 2 == 0){
            fill_chet(a, n);
            output(a);
        } else {
            fill_nechet(a, n);
            output(a);
        }

    }
    public static void fill_chet(int[][] a,int n) {
        int k = 0, score = 1;
        while (k < n/2.f) {
            for (int i = n - 1; i >= k; i--) {
                a[i][k] = score++;
            }
            for (int i = k; i < n - k - 1 ; i++) {
                a[k][i+1] = score++;
            }
            for (int i = k + 1; i < n ; i++) {
                a[i][n-k-1] = score++;
            }
            k++;
       }
    }
    public static void fill_nechet(int[][] a, int n) {
        int k = 0, count = 0, score = 1;
        if (n <= 3) {
            while (k < n / 3.f) {
                for (int i = n - 1; i >= k; i--) {
                    a[i][k] = score++;
                }
                for (int i = k; i < n - k - 1; i++) {
                    a[k][i + 1] = score++;
                }
                for (int i = k + 1; i < n; i++) {
                    a[i][n - k - 1] = score++;
                }
                k++;
            }
            int f = 0;
            for (int i = n / 2; i < n; i++) {
                a[i][i - f] = score++;
                f++;
            }
        } else {
            if (n >= 11) {
                count += (n - 5)/6;
            }
            while (k <= n / 3.f + count) {
                for (int i = n - 1; i >= k; i--) {
                    a[i][k] = score++;
                }
                for (int i = k; i < n - k - 1; i++) {
                    a[k][i + 1] = score++;
                }
                for (int i = k + 1; i < n; i++) {
                    a[i][n - k - 1] = score++;
                }
                k++;
            }
            int f = 0;
            for (int i = n / 2; i < n; i++) {
                a[i][i - f] = score++;
                f++;
            }
        }
    }
    public static void output(int[][] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
