import java.util.Scanner;

public class task2_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент №" + (i + 1));
            a[i] = s.nextInt();
        }
        if (f(n,a)) {
            System.out.println("Вы сталкнулись с последовательностью Перрина");
        } else {
            System.out.println("Вы не сталкнулись с последовательностью Перрина");
        }
    }
    public static boolean f(int n, int[] a) {
        if (a[0] == 3) {
            if (n > 1) {
                if (a[1] == 0) {
                    if (n > 2) {
                        if (a[2] == 2) {
                            if (n > 3) {
                                for (int i = 3; i < n; i++) {
                                    if (a[i] == a[i - 2] + a[i - 3]) {
                                        return true;
                                    } else {
                                        return false;
                                    }
                                }
                            } else {
                                return true;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}

