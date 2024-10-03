package laba4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Каждая позиция содержит в себе информацию про одного зверя");
        System.out.println("Выберите цифру от 1 до 8");
        int x = n.nextInt();
        while (x != 1 & x != 2 & x != 3 & x != 4 & x != 5 & x != 6 & x != 7 & x != 8) {
            System.out.println("Повторите попытку");
            x = n.nextInt();
        }
        switch (x){
            case 1:
                System.out.println("Гепард, скорость которого 98 км/ч");
                break;
            case 2:
                System.out.println("Вилорог, скорость которого 87 км/ч");
                break;
            case 3:
                System.out.println("Газель Гранта, скорость которой 86 км/ч");
                break;
            case 4:
                System.out.println("Лев, скорость которого 86 км/ч");
                break;
            case 5:
                System.out.println("Антилопа Гну, скорость которой 80 км/ч");
                break;
            case 6:
                System.out.println("Газель Томсона, скорость которой 76 км/ч");
                break;
            case 7:
                System.out.println("Лось, скорость которого 75 км/ч");
                break;
            case 8:
                System.out.println("Гиеновидная собака, скорость которой 7- км/ч");
                break;
            default:
            }
        }
    }
