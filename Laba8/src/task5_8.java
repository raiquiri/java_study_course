import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5_8 {
    public static void main(String[] args) throws IOException {
        File file_scan = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Исходники\\Задание №5.txt");
        Scanner input = new Scanner(file_scan);
        File file_put = new File("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №5.txt");
        FileWriter print = new FileWriter(file_put, true);
        Scanner check = new Scanner(file_put);

        print.write("\n" + separator());

        String text = "";
        while (check.hasNextLine()) {
            text += check.nextLine() + "\n";
        }

        while (input.hasNextLine()) {
            String base = input.nextLine();
            Pattern proposal = Pattern.compile(base);
            Matcher m_proposal = proposal.matcher(text);

            if (!m_proposal.find()) {
                Pattern dash = Pattern.compile("-");
                Matcher m_dash = dash.matcher(base);
                Pattern colon = Pattern.compile(":");
                Matcher m_colon = colon.matcher(base);

                if (m_dash.find() && m_colon.find()) {
                    print.write("\n" + base);
                }
            }
        }
        print.close();
    }
    public static String separator() {
        String base = "";
        for (int i = 0; i < 111; i++) {
            base += "=";
        }
        return base;
    }
}
