import java.util.Scanner;

public class task1_4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите координату х точки А1");
        double x1 = n.nextDouble();
        System.out.println("Введите координату у точки А1");
        double y1 = n.nextDouble();
        System.out.println("Введите координату х точки А2");
        double x2 = n.nextDouble();
        System.out.println("Введите координату у точки А2");
        double y2 = n.nextDouble();

        double lenght1, lenght2 ;
        lenght1 = Math.pow(Math.pow(5 - x1, 2) + Math.pow(-0.55 - y1, 2), 1/2.f);
        lenght2 = Math.pow(Math.pow(5 - x2, 2) + Math.pow(-0.55 - y2, 2), 1/2.f);
        if ( lenght1 > lenght2 ) {
            System.out.println("Точка А2 ближе к центру окружности");
        } else {
            System.out.println("Точка А1 ближе к центру окружности");
        }
        if ( lenght1 == 3 ) {
            System.out.println("Точка А1 лежит на окружности");
        } else {
            System.out.println("Точка А1 не лежит на окружности");
        }
        if ( lenght2 == 3 ) {
            System.out.println("Точка А2 лежит на окружности");
        } else {
            System.out.println("Точка А2 не лежит на окужности");
        }
    }
}
