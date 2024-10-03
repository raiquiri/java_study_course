import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = s.nextInt();
        while (n <= 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int [n][n];

        fill(a, n);
        output(a);
    }
    public static void fill(int[][] a,int n) {
        int k = 0, score = 1, ind = 0;
        while (k < n/2.f) {

            for (int i = 0; i < n - 3*k - 1 + ind; i++) {
                a[i+k][i+2*k] = score++;
            }
            for (int i = 0; i < n - 3*k - 1; i++) {
                a[n-i-2*k-1][n-1 - k] = score++;
            }
            for (int i = 0; i < n - 3*k - 1; i++) {
                a[k][n-i-k-1] = score++;
            }
            k++;

            if (k >= n/(3*k)) {
                ind = 1;
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
