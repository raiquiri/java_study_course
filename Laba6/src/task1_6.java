import java.util.Scanner;

public class task1_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите "  + (i + 1) +  " член массива");
            a[i] = s.nextInt();
            while (a[i] < 0 && a[i] >= 9) {
                System.out.println("Повсторите попытку");
                a[i] = s.nextInt();
            }
        }
        System.out.println("Исходные элементы:");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] +", ");
            }
        }
        System.out.println("\nЭлементы в 10-ой системе счисления: ");
        int f = 0, k = 0, sum = 0, rev = 0;
        for (int i = n-1; i >= 0; i--) {
            sum += a[i] * Math.pow(9,k);
            k++;
        }
        while (sum != 0) {
            int ost = sum % 10;
            rev = rev * 10 + ost;
            sum = sum / 10;
        }
        while (rev != 0) {
            int ost = rev % 10;
            rev = rev / 10;
            if (rev == 0) {
                b[f] = ost;
                System.out.print(b[f]);
            } else {
                b[f] = ost;
                System.out.print(b[f] + ", ");
            }
            f++;
        }
    }
}
