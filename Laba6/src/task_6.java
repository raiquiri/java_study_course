import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите n");
        int n = s.nextInt();
        while (n < 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }

        System.out.println("Введите k");
        int k = s.nextInt();
        while (k < 1 || k % 2 != 0) {
            System.out.println("Повторите попытку");
            k = s.nextInt();
        }

        int[][] a = new int [k*n][k*n];
        fill_chet(a, k*n);
        output(a);

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

