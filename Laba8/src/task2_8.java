import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static Laba6.task7_6.*;

public class task2_8 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №2.txt");
        FileWriter print = new FileWriter(file, true);
        System.out.println("Введите порядок матрицы");
        int n = s.nextInt();
        while (n <= 1) {
            System.out.println("Повторите попытку");
            n = s.nextInt();
        }
        int[][] a = new int [n][n];
        print.write(separator(n));
        if(n % 2 == 0){
            fill_chet(a, n);
            print.write("\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    print.write(a[i][j] + "\t");
                }
                print.write("\n");
            }
        } else {
            fill_nechet(a, n);
            print.write("\n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    print.write(a[i][j] + "\t");
                }
                print.write("\n");
            }
        }
        print.write(separator(n) + "\n\n");
        print.close();
    }
    public static String separator(int n) {
        String base = "";
        for (int i = 0; i < n*8; i++) {
            base += "=";
        }
        return base;
    }
}
