import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task11_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №11.txt");
        FileWriter print = new FileWriter(file);

        // Заполняем и записываем массив х в файл
        print.write(separator() + "\nМассив координат x:\n");
        double[] mas_x = new double[33];
        int k = 0;
        for (double i = -4; i <= 4; i += 0.25) {
            mas_x[k] = i;
            print.write(mas_x[k] + "\t");
            k++;
        }

        // Заполняем и записываем массив у в файл
        print.write("\n" + separator() + "\nМассив координат y:\n");
        double[] mas_y = new double[41];
        k = 0;
        for (double i = -4; i <= 4.2; i += 0.2) {
            mas_y[k] = (double) Math.round(i*10)/10;
            print.write(mas_y[k] + "\t");
            k++;
        }

        // Записываем в файл значения функции
        print.write("\n" + separator() + "\nМатрица значений поверхности (z)\n");
        for (int i = 0; i < mas_x.length; i++) {
            for (int j = 0; j < mas_y.length; j++) {
                double func = Math.pow(mas_x[i]-mas_y[j], 2) + Math.pow(mas_x[i]+mas_y[j], 5);
                String format = String.format("%.3f", func); // общий вид для значений
                print.write( znak_bef(func) + format + znak_after(func, format) + " | ");
            }
            print.write("\n");
        }
        print.close();

    }
    // Методы znak_after и znak_bef нужны для того чтобы выровнять значения в файле
    public static String znak_after(double x, String format) {
        String base = "";
        int len = 12 - znak_bef(x).length() - format.length();
        for (int i = 0; i < len; i++) {
            base += " ";
        }
        return base;
    }
    public static String znak_bef (double x) {
        if (x > 0) {
            return " ";
        } else {
            return "";
        }
    }
    // Метод separator является разделителем
    public static String separator() {
        String base = "";
        for (int i = 0; i < 441; i++) {
            base += "=";
        }
        return base;
    }
}
