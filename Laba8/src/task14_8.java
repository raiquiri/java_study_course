import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task14_8 {
    public static void main(String[] args) throws IOException {
        File file_scan = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №14.txt");
        Scanner input = new Scanner(file_scan);
        File file_put = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №14.txt");
        FileWriter print = new FileWriter(file_put);
        String all = "";
        int count = 0;

        double sum_s1 = 0, sum_s2 = 0, sum_s3 = 0,
               sum_sint = 0, sum_seqv = 0;

        double max_s1 = 0, min_s1 = 0,
               max_s2 = 0, min_s2 = 0,
               max_s3 = 0, min_s3 = 0,
               max_sint = 0, min_sint = 0,
               max_seqv = 0, min_seqv = 0;

        while (input.hasNextLine()) {
            String base = input.nextLine();

            Pattern p = Pattern.compile(".+NODE.+S1.+S2.+S3.+SINT.+SEQV.+");
            Matcher m = p.matcher(base);

            if (m.find()) {
                base = input.nextLine();

                Pattern dash = Pattern.compile("-");
                Matcher m_dash = dash.matcher(base);
                base = m_dash.replaceAll("  -");

                Pattern space = Pattern.compile(" {2,}");
                Matcher find_space = space.matcher(base);
                base = find_space.replaceAll(" ");

                String[] mas = base.split(" ");
                max_s1 = Double.parseDouble(mas[2]);
                min_s1 = Double.parseDouble(mas[2]);
                sum_s1 += Double.parseDouble(mas[2]);

                max_s2 = Double.parseDouble(mas[3]);
                min_s2 = Double.parseDouble(mas[3]);
                sum_s2 += Double.parseDouble(mas[3]);

                max_s3 = Double.parseDouble(mas[4]);
                min_s2 = Double.parseDouble(mas[4]);
                sum_s3 += Double.parseDouble(mas[4]);

                max_sint = Double.parseDouble(mas[5]);
                min_sint = Double.parseDouble(mas[5]);
                sum_sint += Double.parseDouble(mas[5]);

                max_seqv = Double.parseDouble(mas[6]);
                min_seqv = Double.parseDouble(mas[6]);
                sum_seqv += Double.parseDouble(mas[6]);

                count++;

                for (int i = 1; i < mas.length; i++) {
                    all += mas[i] + ";";
                }

                break;
            }
        }

        while (input.hasNextLine()) {
            String base = input.nextLine();

            Pattern dash = Pattern.compile("-");
            Matcher m_dash = dash.matcher(base);
            base = m_dash.replaceAll("  -");

            Pattern space = Pattern.compile(" {2,}");
            Matcher find_space = space.matcher(base);
            base = find_space.replaceAll(" ");

            String[] mas = base.split(" ");

            max_s1 = max(max_s1, mas[2]);
            min_s1 = min(min_s1, mas[2]);
            sum_s1 += Double.parseDouble(mas[2]);

            max_s2 = max(max_s2, mas[3]);
            min_s2 = min(min_s2, mas[3]);
            sum_s2 += Double.parseDouble(mas[3]);

            max_s3 = max(max_s3, mas[4]);
            min_s3 = min(min_s3, mas[4]);
            sum_s3 += Double.parseDouble(mas[4]);

            max_sint = max(max_sint, mas[5]);
            min_sint = min(min_sint, mas[5]);
            sum_sint += Double.parseDouble(mas[5]);

            max_seqv = max(max_seqv, mas[6]);
            min_seqv = min(min_seqv, mas[6]);
            sum_seqv += Double.parseDouble(mas[6]);

            count++;

            for (int i = 1; i < mas.length; i++) {
                all += mas[i] + ";";
            }
        }

        print.write("Максимум по S1:\t\t" + max_s1 + "\n");
        print.write("Минимум по S1:\t\t" + min_s1 + "\n" + separator() + "\n");
        print.write("Максимум по S2:\t\t" + max_s2 + "\n" );
        print.write("Минимум по S2:\t\t" + min_s2 + "\n" + separator() + "\n");
        print.write("Максимум по S3:\t\t" + max_s3 + "\n");
        print.write("Минимум по S3:\t\t" + min_s3 + "\n" + separator() + "\n");
        print.write("Максимум по SINT:\t" + max_sint + "\n");
        print.write("Минимум по SINT:\t" + min_sint + "\n" + separator() + "\n");
        print.write("Максимум по SEQV:\t" + max_seqv + "\n");
        print.write("Минимум по SEQV:\t" + min_seqv + "\n" + separator() + "\n");
        print.write("Отклонение от среднего значения:");

        double sred_s1 = sum_s1/count,
               sred_s2 = sum_s2/count,
               sred_s3 = sum_s1/count,
               sred_sint = sum_sint/count,
               sred_seqv = sum_seqv/count;
        String[] mas = all.split(";");
        for (int i = 0; i < mas.length; i++) {
            if (i % 6 == 0) {
                print.write("\n" + mas[i] + "\t");
            } else {
                print.write(mas[i] + "\t");
            }
        }

        print.close();
    }
    public static String separator() {
        String base = "";
        for (int i = 0 ; i < 85; i++) {
            base += "=";
        }
        return base;
    }
    public static double max(double max, String base) {
        if (max > Double.parseDouble(base)) {
            return max;
        } else {
            return Double.parseDouble(base);
        }
    }
    public static double min(double min, String base) {
        if (min < Double.parseDouble(base)) {
            return min;
        } else {
            return Double.parseDouble(base);
        }
    }
}
