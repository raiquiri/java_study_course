import java.util.Scanner;

public class task5_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите порядок матрицы");
        int n = s.nextInt();
        int[][] a = new int[n][n];
        while (n <= 0) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }

        System.out.println("Элементы матрицы");

        f(a);

        System.out.println("\nЭлементы перевёрнутой матрицы");

        r(a);
    }

    public static void f(int[][] a) {
        int k = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = k;
                System.out.print(a[i][j] + "\t");
                k++;
            }
            System.out.println();
        }
    }
    public static void r(int[][] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[0].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}