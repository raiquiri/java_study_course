import java.util.Random;
import java.util.Scanner;
import java.lang.Character;

public class task1_7 {
    static Random random = new Random();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите кол-во строк матрицы");
        int n = input.nextInt();

        while (n <= 0) {
            System.out.println("Вы допустили ошибку, повторите попытку");
            n = input.nextInt();
        }

        System.out.println("Введите кол-во столбцов матрицы");
        int m = input.nextInt();

        while (m <= 0) {
            System.out.println("Вы допустили ошибку, повторите попытку");
            m = input.nextInt();
        }

        char[][] array = new char[n][m];

        System.out.println("Вы желаете ввести матрицу вручную или использовать генератор случайных символов" +
                "\n1.Ввести самому\t2.Использовать генератор");
        int answer = input.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.println("Вы допустили ошибку, повторите попытку");
            answer = input.nextInt();
        }

        if (answer == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = fill_myself();
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    array[i][j] = fill_compself();
                }
            }
        }

        output(array, n, m);
        check(array, n, m);



    }
    public static char fill_myself() {
        char base = ' ';
        String simvol = input.next();
        if (simvol.length() == 1) {
            base = simvol.charAt(0);
        } else {
            while (simvol.length() != 1) {
                System.out.println("Вы допустили ошибку, повторите попытку");
                simvol = input.next();
            }
            base = simvol.charAt(0);
        }
        return base;
    }
    public static char fill_compself() {
        String interpreter = "no";
        char mix = interpreter.charAt(random.nextInt(interpreter.length()));
        return mix;
    }
    public static void output(char[][] array, int n, int m) {
        System.out.println("Матрица символов:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void check (char[][] array, int n, int m) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m-1; j++) {
                if (array[i][j] == 'n' && array[i][j+1] == 'o') {
                    k++;
                }
            }
            System.out.println("В строке №" + (i+1) + " всего " + k + " знаков припенания\n");
            k = 0;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j][i] == 'n' && array[j+1][i] == 'o') {
                    k++;
                }
            }
            System.out.println("В столбце №" + (i+1) + " всего " + k + " знаков припенания\n");
            k = 0;
        }
    }
}