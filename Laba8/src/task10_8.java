import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import static Laba5.task5_5.*;

public class task10_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №10.txt");
        FileWriter print = new FileWriter(file, true);
        Scanner s = new Scanner(System.in);
        System.out.println("Введите х от -1 до 1");
        double x = s.nextDouble();

        while (x >= 1 || x <= -1) {
            System.out.println("Повторите попытку");
            x = s.nextDouble();
        }

        double delta = Math.abs((f(x,1)-Math.log(1+x))/Math.log(1+x));
        String format = String.format("%.4f", delta);
        print.write(separator());

        print.write("\nФункция f(x) = ln(x-1) для  x = " + x + " равняется " + f(x,1) +
                "\nРезультаты определения значений функции f(x) = ln(x-1) с помощью ряда Маклорена" +
                "\nПогрешность итерационной процедуры " + format);
        print.write("\nЗначение функции по Маклорену\t\tПогрешность, %\t\tЧисло итераций\n" +
                  f(x,1) + "\t\t\t" + format + "\t\t\t" + f(x,2) );

        print.write("\n" + separator() + "\n\n");
        print.close();
    }
    public static String separator() {
        String base = "";
        for (int i = 0; i < 81; i++) {
            base += "=";
        }
        return base;
    }
}
