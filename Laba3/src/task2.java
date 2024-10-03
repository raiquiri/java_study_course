import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите время на один заказ");
        double t = s.nextDouble();
        while (t <= 0) {
            System.out.println("Вы ввели некорректное значение, повторите попытку");
            t = s.nextDouble();
        }
        System.out.println("Введите через сколько второй рабочий присоединился");
        double t1 = s.nextDouble();
        while (t1 > t || t1 == t || t1 <= 0) {
            System.out.println("Вы ввели некорректное значение, повторите попытку");
            t1 = s.nextDouble();
        }
        double f1, f, a = 1/t, a1 = 1/(t-t1);
        f =  1/(a + a1);
        f1 = f + t1;
        //String result = String.format("%.2f",f1);
        System.out.println("Время выполнения заказа " + f1 + " часов");
    }
}