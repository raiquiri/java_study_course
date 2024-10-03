import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число в 10-ной системе счисления:");
        double x = input.nextDouble();

        //Для целой части
        int a = (int) Math.floor(x);
        String base_1 = "";
        while (a != 0) {
            base_1 += a % 4;
            a = a / 4;
        }
        base_1 = reverse(base_1);

        //Для дробной
        double b = x - Math.floor(x);
        String base_2 = "";
        while (b % 1 != 0) {
            b = b * 4;
            base_2 += (int) Math.floor(b);
            b = b - Math.floor(b);
        }
        System.out.println("Число в 4-ной системе счисления:\n" +
                base_1 + "," + base_2);

    }
    public static String reverse(String base) {
        if (base == "") {
            return "0";
        } else {
            String result = "";
            for (int i = 0; i < base.length(); i++) {
                result = base.charAt(i) + result;
            }
            return result;
        }
    }
}
