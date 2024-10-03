import java.util.Scanner;

public class task8_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = s.nextInt();
        while (n <= 0 || n % 2 == 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int[n][n];
        part1(a, n);
        part2(a, n);
        part3(a, n);
        part4(a, n);
        output(a, n);

    }
    public static void output ( int[][] a, int n){
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void part1( int[][] a, int n) {
        int k = 0, score = 1;
        while (k <= n/2.f) {
            for (int i = 0; i < n/2 - 2*k ; i++) {
                a[n/2-i-1][i+k] = score++;
            }
            for (int i = 2*k + 1; i < n/2; i++) {
                a[i][n/2-k-1] = score++;
            }
            k++;
        }
    }
    public static void part2( int[][] a, int n) {
        int k = 0, score = 1;
        while (k <= n/2.f) {
            for (int i = 0; i < n/2 - 2*k ; i++) {
                a[n-i-1][i+k] = score++;
            }
            for (int i = 2*k + 1; i < n/2; i++) {
                a[i + n/2][n/2-k-1] = score++;
            }
            k++;
        }
    }
    public static void part3( int[][] a, int n) {
        int k = 0, score = 1;
        while (k <= n / 2.f) {
            for (int i = 0; i < n/2 - 2*k; i++) {
                a[n/2-i-1][n/2+i+k] = score++;
            }
            for (int i = 2*k + 1; i < n/2; i++) {
                a[i][n-k-1] = score++;
            }
            k++;
        }
    }
    public static void part4( int[][] a, int n) {
        int k = 0, score = 1;
        while (k <= n / 2.f) {
            for (int i = 0; i < n/2 - 2*k; i++) {
                a[n-i-1][n/2+i+k] = score++;
            }
            for (int i = 2*k + 1; i < n/2; i++) {
                a[n/2+i][n-k-1] = score++;
            }
            k++;
        }
    }
}