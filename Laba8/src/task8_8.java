import Laba4.task5_4.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static Laba4.task5_4.*;


public class task8_8 {
    public static void main(String[] args) throws IOException {
        File file = new File ("A:\\Политех\\Информатика\\Семестр №2\\№8\\Задание №8.txt");
        FileWriter print = new FileWriter(file);
        double[][] dots = new double[2][10];

        print.write(separator());
        print.write("\nПостановка задачи:\n" +
                "Даны две фигуры , организовать программу, которая дает ответ, \n" +
                "попала ли произвольно введенная точка в одну из фигур и если попала,\n" +
                "то в какую.");
        print.write("\nФигура №1:" +
                "\n1. y = 5\t\t\t\t, при -1 <= x <= 1" +
                "\n2. y = " + k(1,5,2,0) + "*x + (" + b(1,5,2,0) + ")\t\t\t, при 1 <= x <= 2" +
                "\n3. y = " + k(-1,-1,1,-3) + "*x + (" + b(-1,-1,1,-3) + ")\t\t\t, при -1 <= x <= 1" +
                "\n4. x = -1\t\t\t\t, при 3 <= y <= -1" +
                "\n5. y = (4 - (x+1)^2)^(1/2) + 1\t\t, при -3 <= x <= -1" +
                "\n6. y = -1 * (4 - (x+1)^2)^(1/2) + 1\t, при -3 <= x <= -1");

        print.write("\nФигура №2" +
                "\n1. y = " + k(5,-2,7,-3) + "*x + (" + b(5,-2,7,-3) + ")\t\t\t, при 5 <= x <= 7" +
                "\n2. y = " + k(6,-1,7,-3) + "*x + (" + b(6,-1,7,-3) + ")\t\t\t, при 6 <= x <= 7" +
                "\n3. y = (4 - (x-4)^2)^(1/2) + 1\t\t, при 2 <= x <= 6" +
                "\n4. y = -1 * (4 - (x-4)^2)^(1/2) + 1\t, при 2 <= x <= 6" +
                "\nУравнения ниже ограничивают уравнения №3 и №4:" +
                "\n5. y = " + k(4,-3,5,-2) + "*x + (" + b(4,-3,5,-2) + ")\t\t\t, при 4 <= x <= 5" +
                "\n6. y = " + k(3,0,4,1) + "*x + (" + b(3,0,4,1) + ")\t\t\t, при 3 <= x <= 4" +
                "\n7. y = " + k(2,-1,4,-2) + "*x + (" + b(2,-1,4,-2) + ")\t\t\t, при 2 <= x <= 4" +
                "\n8. y = " + k(3,0,4,-2) + "*x + (" + b(3,0,4,-2) + ")\t\t\t, при 3 <= x <= 4");

        print.write("\n" + separator());

        print.write("\nПары точек:");
        for ( int i = 0; i < 10; i++) {
            double x = Math.round(((Math.random() * ((8 + 3) + 1)) - 3) * 10);
            dots[0][i] = x / 10;
            double y = Math.round(((Math.random() * ((5 + 3) + 1)) - 3) * 10);
            dots[1][i] = y / 10;

            print.write("\n" + (i+1) + ". x = " + dots[0][i] + "\ty = " + dots[1][i]);
        }

        print.write("\n" + separator());

        print.write("\nОтвет:");
        for (int i = 0; i < 10; i++) {
            if (figura1(dots[0][i], dots[1][i]) || figura2(dots[0][i], dots[1][i]) || figura3(dots[0][i], dots[1][i])) {
                print.write("\n" + (i+1) + ". x = " + dots[0][i] + "\ty = " + dots[1][i]);
                print.write("       Точка попала в фигуру №1");
            } else if ((figura4(dots[0][i], dots[1][i]) || figura5(dots[0][i], dots[1][i])) && figura6(dots[0][i], dots[1][i])) {
                print.write("\n" + (i+1) + ". x = " + dots[0][i] + "\ty = " + dots[1][i]);
                print.write("       Точка попала в фигуру №2");
            } else {
                print.write("\n" + (i+1) + ". x = " + dots[0][i] + "\ty = " + dots[1][i]);
                print.write("       Точка не попала ни в одну фигуру");
            }
        }

        print.write("\n" + separator());
        print.close();
    }

    public static String separator(){
        String base = "";
        for (int i = 0; i < 71; i++) {
            base += "=";
        }
        return base;
    }
}
