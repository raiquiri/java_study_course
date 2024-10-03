import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите на сколько меньше поймал рыбы Петя, чем они поймали вместе");
        int p = n.nextInt();
        while (p <= 1 ) {
            System.out.println("Вы ввели некорректное значение, повторите попытку");
            p = n.nextInt();
        }

        System.out.println("Введите на сколько у Пети было меньше, чем у Васи");
        int y = n.nextInt();
        while (y <= 0 || y > p) {
            System.out.println("Вы ввели некорректное значение, повторите попытку");
            y = n.nextInt();
        }
        int result;
        result = p + (p - y);
        System.out.println("Всего мальчики поймали " + result + " рыб");
    }

}
