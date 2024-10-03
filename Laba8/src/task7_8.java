import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task7_8 {
    public static void main(String[] args) throws IOException {
        File file = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №7.txt");
        FileWriter print = new FileWriter(file);

        print.write(separator());
        print.write("\nf(x) = Math.pow(Math.E,x) - 5 * x\t, при x >= 0");
        print.write("\nf(x) = 2 * Math.sin(x) * Math.cos(x)\t, при x < 0");
        print.write("\n" + separator());
        print.write("\n\tx\t\tf(x)\n");

        int count = 1;
        for(double x = -3; x <= 3; x = x + 0.5) {
            if ( x >= 0 ) {
                double f = Math.pow(Math.E,x) - 5 * x;
                print.write(count + ".\t" + x + "\t\t" + f + "\n");
            } else if (x < 0) {
                double f = 2 * Math.sin(x) * Math.cos(x);
                print.write(count + ".\t" + x + "\t\t" + f + "\n");
            }
            count++;
        }
        print.write("\n" + separator());


        print.close();
    }

    public static String separator() {
        String base = "";
        for (int i = 0; i < 55; i++) {
            base += "=";
        }
        return base;
    }
}
