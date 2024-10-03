import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class task5_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("Задание №5.1");
        Scanner input = new Scanner(file);

        String base = "";
        System.out.println("Изначальный текст:");
        while (input.hasNextLine()) {
            base += input.nextLine() + "\n";
        }

        System.out.println(base);

        System.out.println("\nПеределанный текст:");

        System.out.print(base.charAt(0));
        int k = 1;
        for (int i = 1; i < base.length(); i++) {
            if (base.charAt(i) == '.') {
                System.out.print(base.charAt(i));
                k = 1;
            }  else if ((base.charAt(i-1) == ' ' && base.charAt(i-2) != '.')
                    || base.charAt(i-1) == '«') {
                if (Character.isUpperCase(base.charAt(i))) {
                    while (base.charAt(i) != ' ' && i != base.length()-1
                            && base.charAt(i) != '»') {
                        i++;
                    }
                    k++;
                    if (base.charAt(i-1) == ',') {
                        System.out.print(k + "" + base.charAt(i-1) + "" + base.charAt(i));
                    } else if (base.charAt(i) == '»') {
                        System.out.print(k + "" + base.charAt(i));
                    } else {
                        System.out.print(k + " ");
                    }
                } else {
                    System.out.print(base.charAt(i));
                    if (Character.isLetterOrDigit(base.charAt(i))) {
                        k++;
                    }
                }
            } else {
                System.out.print(base.charAt(i));
            }
        }
    }
}
