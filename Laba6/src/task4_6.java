import java.util.Scanner;

public class task4_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = s.nextInt();
        while (n <= 0) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[] a = new int[n];
        int[] b = new int[n];
        filla(a,n);
        fillb(a,b,n);

        System.out.println("Пузырёк");
        output(a,n);
        System.out.println();
        bubble(a,n);

        System.out.println("\n\nГномик");
        output(b,n);
        System.out.println();
        gnom(b,n);
    }
    public static void filla(int a[], int n) {
        for (int i = 0; i < n; i++) {
            a[i] = (int) ((Math.random() * (100 - 1)) + 1);
        }
    }
    public static void fillb(int a[], int b[], int n) {
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
    }
    public static void output(int a[], int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }
    public static void bubble(int a[], int n) {
        int k = 0;
        int i = 0;
        for (;k < n;) {
            if (k != n - 1) {
                if (a[k] <= a[k+1]) {
                    output(a,n);
                    k++;
                    i++;
                } else {
                    int swap = a[k+1];
                    a[k+1] = a[k];
                    a[k] = swap;
                    output(a,n);
                    k = 0;
                    i++;
                }
            } else {
                break;
            }
        }
        System.out.print("\n\nКоличество иттераций:\t" + i);
    }
    public static void gnom(int b[], int n) {
        int i = 0;
        int k = 1;
        int in = 1;
        while (k < n) {
                if (b[k-1] <= b[k]) {
                    output(b,n);
                    k = in;
                    in++;
                    i++;
                } else {
                    int swap = b[k];
                    b[k] = b[k-1];
                    b[k-1] = swap;
                    output(b,n);
                    k--;
                    i++;
                    if (k == 0) {
                        k = in;
                        in++;
                        i++;
                    }
                }
        }
        System.out.print("\n\nКоличество иттераций:\t" + i);
    }
}
