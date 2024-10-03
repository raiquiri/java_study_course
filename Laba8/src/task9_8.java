import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static Laba5.task9_5.*;

public class task9_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №9.txt");
        FileWriter print = new FileWriter(file, true);
        Scanner s = new Scanner(System.in);

        System.out.println("Введите число");
        double x = s.nextDouble();

        while (x < 0) {
            System.out.println("Повторите попытку");
            x = s.nextDouble();
        }
        System.out.println("Введите спенеь корня");
        double p = s.nextDouble();

        while (p <= 0) {
            System.out.println("Повторите попытку");
            p = s.nextDouble();
        }

        System.out.println("Введите у0");
        double y0 = s.nextDouble();

        while ( y0 > Math.exp((Math.log(x*(p+1)))/p) || y0 == 0) {
            System.out.println("Повторите попытку");
            y0 = s.nextDouble();
        }

        print.write(separator());

        double delta = Math.abs((f(x,p,y0,1) - Math.pow(x,1/p))/Math.pow(x,1/p));
        String format = String.format("%.10f", delta);

        print.write("\nНахождения корня p-ой степени из числа x по формуле Ньютона" +
                "\nпри x = " + x + " p = " + p + " y0 = " + y0 +
                "\nЗначение по формуле Ньютона:\t\t" + f(x,p,y0,1) +
                "\nЗначение с использованием пакета:\t" + Math.pow(x,1/p) +
                "\nПогрешность:\t\t\t\t" + format + " %" +
                "\nЧисол иттераций:\t\t\t" + f(x,p,y0,2));

        print.write("\n" + separator() + "\n\n");
        print.close();
    }
    public static String separator() {
        String base = "";
        for (int i = 0; i < 71; i++) {
            base += "=";
        }
        return base;
    }
}
