import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task15_8 {
    public static void main(String[] args) throws IOException {
        File file_sub = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №15 участки.txt");
        Scanner input_sub = new Scanner(file_sub);
        File file_ob = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №15 постройки.txt");
        Scanner input_ob = new Scanner(file_ob);
        File result = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №15.txt");
        FileWriter print = new FileWriter(result);

        print.write("№ участка\tПлощадь участка\t\tКол-во объектов\t\tПлощадь дома\t\tПлощадь бани\n");
        int count = 1;
        while (input_sub.hasNextLine() && input_ob.hasNextLine()) {
            String sub = input_sub.nextLine(), ob = input_ob.nextLine();
            String[] sub_mas = sub.split(" ");

            String[] coordinate_1 = sub_mas[0].split(";");
            double x1 = Double.parseDouble(coordinate_1[0]);
            double y1 = Double.parseDouble(coordinate_1[1]);

            String[] coordinate_2 = sub_mas[1].split(";");
            double x2 = Double.parseDouble(coordinate_2[0]);
            double y2 = Double.parseDouble(coordinate_2[1]);

            String[] coordinate_3 = sub_mas[2].split(";");
            double x3 = Double.parseDouble(coordinate_3[0]);
            double y3 = Double.parseDouble(coordinate_3[1]);

            String[] coordinate_4 = sub_mas[3].split(";");
            double x4 = Double.parseDouble(coordinate_4[0]);
            double y4 = Double.parseDouble(coordinate_4[1]);

            double s_spot = S(x1, y1, x2, y2, x3, y3, x4, y4);

            Pattern home = Pattern.compile("Дом:( [0-9\\;\\.]+){4}");
            Matcher m_home = home.matcher(ob);
            double s_home = 0;
            int score = 0;
            if (m_home.find()) {
                int start = m_home.start();
                int end = m_home.end();
                String base = ob.substring(start, end);
                String[] mas = base.split(" ");

                String[] coordinate1_1 = mas[1].split(";");
                double x1_1 = Double.parseDouble(coordinate1_1[0]);
                double y1_1 = Double.parseDouble(coordinate1_1[1]);

                String[] coordinate1_2 = mas[2].split(";");
                double x1_2 = Double.parseDouble(coordinate1_2[0]);
                double y1_2 = Double.parseDouble(coordinate1_2[1]);

                String[] coordinate1_3 = mas[3].split(";");
                double x1_3 = Double.parseDouble(coordinate1_3[0]);
                double y1_3 = Double.parseDouble(coordinate1_3[1]);

                String[] coordinate1_4 = mas[4].split(";");
                double x1_4 = Double.parseDouble(coordinate1_4[0]);
                double y1_4 = Double.parseDouble(coordinate1_4[1]);

                s_home = S(x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4);

                if (hit(x1, y1, x3, y3, x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4)) {
                    score++;
                }
            }

            Pattern banya = Pattern.compile("Баня:( [0-9\\;\\.]+){4}");
            Matcher m_banya = banya.matcher(ob);
            double s_banya = 0;
            if (m_banya.find()) {
                int start = m_banya.start();
                int end = m_banya.end();
                String base = ob.substring(start, end);
                String[] mas = base.split(" ");

                String[] coordinate1_1 = mas[1].split(";");
                double x1_1 = Double.parseDouble(coordinate1_1[0]);
                double y1_1 = Double.parseDouble(coordinate1_1[1]);

                String[] coordinate1_2 = mas[2].split(";");
                double x1_2 = Double.parseDouble(coordinate1_2[0]);
                double y1_2 = Double.parseDouble(coordinate1_2[1]);

                String[] coordinate1_3 = mas[3].split(";");
                double x1_3 = Double.parseDouble(coordinate1_3[0]);
                double y1_3 = Double.parseDouble(coordinate1_3[1]);

                String[] coordinate1_4 = mas[4].split(";");
                double x1_4 = Double.parseDouble(coordinate1_4[0]);
                double y1_4 = Double.parseDouble(coordinate1_4[1]);

                s_banya = S(x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4);

                if (hit(x1, y1, x3, y3, x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4)) {
                    score++;
                }
            }

            Pattern hoz = Pattern.compile("Хоз.постройки:( [0-9\\;\\.]+){4}");
            Matcher m_hoz = hoz.matcher(ob);
            if (m_hoz.find()) {
                int start = m_hoz.start();
                int end = m_hoz.end();
                String base = ob.substring(start, end);
                String[] mas = base.split(" ");

                String[] coordinate1_1 = mas[1].split(";");
                double x1_1 = Double.parseDouble(coordinate1_1[0]);
                double y1_1 = Double.parseDouble(coordinate1_1[1]);

                String[] coordinate1_2 = mas[2].split(";");
                double x1_2 = Double.parseDouble(coordinate1_2[0]);
                double y1_2 = Double.parseDouble(coordinate1_2[1]);

                String[] coordinate1_3 = mas[3].split(";");
                double x1_3 = Double.parseDouble(coordinate1_3[0]);
                double y1_3 = Double.parseDouble(coordinate1_3[1]);

                String[] coordinate1_4 = mas[4].split(";");
                double x1_4 = Double.parseDouble(coordinate1_4[0]);
                double y1_4 = Double.parseDouble(coordinate1_4[1]);

                if (hit(x1, y1, x3, y3, x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4)) {
                    score++;
                }
            }

            Pattern lep = Pattern.compile("Опоры ЛЭП:( [0-9\\;\\.]+){4}");
            Matcher m_lep = lep.matcher(ob);
            if (m_lep.find()) {
                int start = m_lep.start();
                int end = m_lep.end();
                String base = ob.substring(start, end);
                String[] mas = base.split(" ");

                String[] coordinate1_1 = mas[2].split(";");
                double x1_1 = Double.parseDouble(coordinate1_1[0]);
                double y1_1 = Double.parseDouble(coordinate1_1[1]);

                String[] coordinate1_2 = mas[3].split(";");
                double x1_2 = Double.parseDouble(coordinate1_2[0]);
                double y1_2 = Double.parseDouble(coordinate1_2[1]);

                String[] coordinate1_3 = mas[4].split(";");
                double x1_3 = Double.parseDouble(coordinate1_3[0]);
                double y1_3 = Double.parseDouble(coordinate1_3[1]);

                String[] coordinate1_4 = mas[5].split(";");
                double x1_4 = Double.parseDouble(coordinate1_4[0]);
                double y1_4 = Double.parseDouble(coordinate1_4[1]);

                if (hit(x1, y1, x3, y3, x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4)) {
                    score++;
                }
            }

            Pattern pool = Pattern.compile("Бассейн:( [0-9\\;\\.]+){4}");
            Matcher m_pool = pool.matcher(ob);
            if (m_pool.find()) {
                int start = m_pool.start();
                int end = m_pool.end();
                String base = ob.substring(start, end);
                String[] mas = base.split(" ");

                String[] coordinate1_1 = mas[1].split(";");
                double x1_1 = Double.parseDouble(coordinate1_1[0]);
                double y1_1 = Double.parseDouble(coordinate1_1[1]);

                String[] coordinate1_2 = mas[2].split(";");
                double x1_2 = Double.parseDouble(coordinate1_2[0]);
                double y1_2 = Double.parseDouble(coordinate1_2[1]);

                String[] coordinate1_3 = mas[3].split(";");
                double x1_3 = Double.parseDouble(coordinate1_3[0]);
                double y1_3 = Double.parseDouble(coordinate1_3[1]);

                String[] coordinate1_4 = mas[4].split(";");
                double x1_4 = Double.parseDouble(coordinate1_4[0]);
                double y1_4 = Double.parseDouble(coordinate1_4[1]);

                if (hit(x1, y1, x3, y3, x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4)) {
                    score++;
                }
            }

            Pattern bhole = Pattern.compile("Бассейн:( [0-9\\;\\.]+){4}");
            Matcher m_bhole = bhole.matcher(ob);
            if (m_bhole.find()) {
                int start = m_bhole.start();
                int end = m_bhole.end();
                String base = ob.substring(start, end);
                String[] mas = base.split(" ");

                String[] coordinate1_1 = mas[1].split(";");
                double x1_1 = Double.parseDouble(coordinate1_1[0]);
                double y1_1 = Double.parseDouble(coordinate1_1[1]);

                String[] coordinate1_2 = mas[2].split(";");
                double x1_2 = Double.parseDouble(coordinate1_2[0]);
                double y1_2 = Double.parseDouble(coordinate1_2[1]);

                String[] coordinate1_3 = mas[3].split(";");
                double x1_3 = Double.parseDouble(coordinate1_3[0]);
                double y1_3 = Double.parseDouble(coordinate1_3[1]);

                String[] coordinate1_4 = mas[4].split(";");
                double x1_4 = Double.parseDouble(coordinate1_4[0]);
                double y1_4 = Double.parseDouble(coordinate1_4[1]);

                if (hit(x1, y1, x3, y3, x1_1, y1_1, x1_2, y1_2, x1_3, y1_3, x1_4, y1_4)) {
                    score++;
                }
            }

            String format_1 = String.format("%.2f", s_spot);
            String format_2 = String.format("%.2f", s_home);
            String format_3 = String.format("%.2f", s_banya);
            print.write(count + "\t\t" + format_1 + "\t\t\t" + score + "\t\t\t" + format_2 + "\t\t\t" + format_3 + "\n");

            count++;
        }
        print.close();
    }
    public static boolean hit(double x1, double y1, double x3, double y3, double x1_1, double y1_1, double x1_2, double y1_2, double x1_3, double y1_3, double x1_4, double y1_4) {
        if (x1 <= x1_1 && x3 >= x1_1 && y1 <= y1_1 && y3 >= y1_1 &&
            x1 <= x1_2 && x3 >= x1_2 && y1 <= y1_2 && y3 >= y1_2 &&
            x1 <= x1_3 && x3 >= x1_3 && y1 <= y1_3 && y3 >= y1_3 &&
            x1 <= x1_4 && x3 >= x1_4 && y1 <= y1_4 && y3 >= y1_4) {
            return true;
        } else {
            return false;
        }
    }
    public static double S(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double x_v1 = x3 - x1;
        double y_v1 = y3 - y1;
        double x_v2 = x4 - x2;
        double y_v2 = y4 - y2;
        double sin = Math.pow(1 - Math.pow((x_v1*x_v2 + y_v1*y_v2)/(lenght_v(x_v1,y_v1) * lenght_v(x_v2, y_v2)),2), 1/2.f);
        return lenght_v(x_v1,y_v1) * lenght_v(x_v2, y_v2) * sin;
    }
    public static double lenght_v (double x, double y) {
        return Math.pow(x*x + y*y, 1/2.f);
    }
}
