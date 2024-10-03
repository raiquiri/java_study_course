import java.util.Scanner;

public class task10_6 extends function_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество точек для проверки");
        int n = s.nextInt();
        int[][] a = new int[2][n];

        fill(a, n);
        output(a, n);
        System.out.println("Ответ:");
        for (int i = 0; i < n; i++) {
            if (figura1(a[0][i], a[1][i]) == 0 || figura2(a[0][i], a[1][i]) == 0
                    || figura3(a[0][i], a[1][i]) == 0 || figura4(a[0][i], a[1][i]) == 0
                    || (figura5(a[0][i], a[1][i]) == 0 && figura6(a[0][i], a[1][i]) == 0)) {
                System.out.print("0\t");
            } else if (figura1(a[0][i], a[1][i]) == 1 || figura2(a[0][i], a[1][i]) == 1
                    || figura3(a[0][i], a[1][i]) == 1 || figura4(a[0][i], a[1][i]) == 1
                    || (figura5(a[0][i], a[1][i]) == 1 && figura6(a[0][i], a[1][i]) == 1)) {
                System.out.print("1\t");
            } else {
                System.out.print("-1\t");
            }
        }
    }
    public static void fill(int[][] a, int n) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) ((Math.random() * (8 + 4)) - 4);
                a[0][n-1] = 2;
                a[1][n-1] = -2;
            }
        }
    }
    public static void output(int[][] a, int n) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
