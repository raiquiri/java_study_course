import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Введите координату x первой точки, лежащей на прямой");
        double x1 = n.nextDouble();
        System.out.println("Введите кооридинату y первой точки, лежащей на прямой");
        double y1 = n.nextDouble();
        System.out.println("Введите координату x второй точки, лежащей на прямой");
        double x2 = n.nextDouble();
        System.out.println("Введите координату y второй точки, лежащей на прямой");
        double y2 = n.nextDouble();

        System.out.println("Введите координату x произвольной точки");
        double x3 = n.nextDouble();
        System.out.println("Введите коорединату y произвольной точки");
        double y3 = n.nextDouble();

        System.out.println("Проекцией точки А на прямую l является точка A1 (" + dot(x1,y1,x2,y2,x3,y3) + ")");
    }
    public static String dot(double x1, double y1, double x2, double y2, double x3, double y3) {
        double x, y, c1, k1, k2, c2;
        k1 = x2 - x1;
        k2 = y2 - y1;
        c1 = y1 * x2 - x1 * y2;
        c2 = (-1 * k1 * x3) +(-1 * k2 * y3);
        x = (((- c1) * k2) - ( (- c2) * (- k1))) / (k2 * k2 - ( k1 * (- k1)));
        y = (k2 * (- c2) - k1 * (- c1)) / (k2 * k2 - ( k1 * (- k1)));
       return x + " ; " + y;
    }
}

