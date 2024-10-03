import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
            System.out.println("Введите чему равно верхние основание трапеции");
        double a = n.nextDouble();
            while (a <= 0) {
                System.out.println("Вы ввели некорректное значение, повторите попытку");
                a = n.nextDouble();
        }
            System.out.println("Введите чему равно нижние основание трапеции");
        double b = n.nextDouble();
            while (b <= 0 || b == a) {
                System.out.println("Вы ввели некорректное значение, повторите попытку");
                b = n.nextDouble();
            }
        double h, r, l;
        h = Math.pow(a*b, 1/2.f);
        r = h/2.f;
        l = 2 * Math.PI * r;

        String result = String.format("%.2f", h);
        String result1 = String.format("%.2f", l);

            System.out.println("Диаметр окружности равен " + h);
            System.out.println("Длина окружности равна " + l);
    }
}
