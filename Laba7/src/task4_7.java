import java.util.ArrayList;
import java.util.Scanner;

public class task4_7 {
    static Scanner input = new Scanner(System.in);
    static ArrayList<char[]> array_list = new ArrayList<char[]>();
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        int n = input.nextInt();

        while (n < 12) {
            System.out.println("Разерность слишком мала, повторите попытку");
            n = input.nextInt();
        }

        char[][] array = new char[n][n];

        System.out.println("Введите посимвольно массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = fill();
            }
        }

        System.out.println("Введённый массив:");
        output(array);

        int count_1 = 0, count_2 = 1;
        check_gorizont(array);
        for (int i = 0; i < array_list.size(); i++) {
            System.out.println("Строчка, удовлетворяющая условию №" + (i + 1) + " :");
            for (int j = 0; j < array_list.get(i).length; j++) {
                System.out.print(array_list.get(i)[j] + " ");
            }
            System.out.println();
            count_1++;
        }

        check_vertical(array);
        for (int i = count_1; i < array_list.size(); i++) {
            System.out.println("Столбец, удовлетворяющая условию №" + count_2 + " :");
            for (int j = 0; j < array_list.get(i).length; j++) {
                System.out.print(array_list.get(i)[j] + " ");
            }
            System.out.println();
            count_1++;
            count_2++;
        }

        check_digit();

        System.out.println();
        count_2 = 1;
        for (int i = count_1; i < array_list.size(); i++) {
            System.out.println("Скорректированные строчки или столбцы №" + count_2 + " :");
            for (int j = 0; j < array_list.get(i).length; j++) {
                System.out.print(array_list.get(i)[j] + " ");
            }
            System.out.println();
            count_2++;
        }
    }


    public static void check_digit() {
        int limit = array_list.size();
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < array_list.get(i).length; j++) {
                String temp_1 = "", temp_2 = "", temp_3 = "", temp_4 = "";
                while (Character.isDigit(array_list.get(i)[j])) {
                    temp_1 += array_list.get(i)[j];
                    j++;
                }
                while (!Character.isDigit(array_list.get(i)[j])) {
                    j++;
                }
                while (Character.isDigit(array_list.get(i)[j])) {
                    temp_2 += array_list.get(i)[j];
                    j++;
                }
                while (!Character.isDigit(array_list.get(i)[j])) {
                    j++;
                }
                while (Character.isDigit(array_list.get(i)[j])) {
                    temp_3 += array_list.get(i)[j];
                    j++;
                }
                while (!Character.isDigit(array_list.get(i)[j])) {
                    j++;
                }
                if (j == array_list.get(i).length - 1) {
                    temp_4 += array_list.get(i)[j];
                } else {
                    while (Character.isDigit(array_list.get(i)[j])) {
                        temp_4 += array_list.get(i)[j];
                        j++;
                    }
                }
                if (Integer.valueOf(temp_4, 10) != Integer.valueOf(temp_1,10) * (Math.exp(Integer.valueOf(temp_2,10) - Math.exp(Integer.valueOf(temp_3,10))))) {
                    double count_1 = Integer.valueOf(temp_1,10) * (Math.exp(Integer.valueOf(temp_2,10)) - Math.exp(Integer.valueOf(temp_3,10)));
                    int count_2 = array_list.get(i).length;
                    String temp_5 = Integer.toString((int) count_1);

                    while (Character.isDigit(array_list.get(i)[count_2 - 1])) {
                        count_2--;
                    }
                    int count_3 = count_2 + temp_5.length();
                    array_list.add(new char[count_3]);
                    for (int k = 0; k < count_2; k++) {
                        array_list.get(array_list.size() - 1)[k] = array_list.get(i)[k];
                    }
                    for (int k = 0; k < temp_5.length(); k++) {
                        array_list.get(array_list.size() - 1)[k + count_2] = temp_5.charAt(k);
                    }
                }
            }
        }
    }
    public static void check_vertical(char[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Character.isDigit(array[0][i])) {
                    while (Character.isDigit(array[j][i]) && j < array.length - 1) {
                        j++;
                    }
                    if (array[j][i] == '*' && j < array.length - 1) {
                        j++;
                        if (array[j][i] == '(' && j < array.length - 1) {
                            j++;
                            if (array[j][i] == 'e' && j < array.length - 1) {
                                j++;
                                if (array[j][i] == '^' && j < array.length - 1) {
                                    j++;
                                    if (Character.isDigit(array[j][i])) {
                                        while (Character.isDigit(array[j][i]) && j < array.length - 1) {
                                            j++;
                                        }
                                        if (array[j][i] == '-' && j < array.length - 1) {
                                            j++;
                                            if (array[j][i] == 'e' && j < array.length - 1) {
                                                j++;
                                                if (array[j][i] == '^' && j < array.length - 1) {
                                                    j++;
                                                    if (Character.isDigit(array[j][i])) {
                                                        while (Character.isDigit(array[j][i])  && j < array.length - 1) {
                                                            j++;
                                                        }
                                                        if (array[j][i] == ')' && j < array.length - 1) {
                                                            j++;
                                                            if (array[j][i] == '=' && j < array.length - 1) {
                                                                j++;
                                                                if (Character.isDigit(array[j][i])) {
                                                                    while (Character.isDigit(array[j][i]) && j < array.length - 1) {
                                                                        j++;
                                                                    }
                                                                    if (j == array.length - 1) {
                                                                        array_list.add(new char[array.length]);
                                                                        for (int k = 0; k < array.length; k++) {
                                                                            array_list.get(array_list.size() - 1)[k] = array[k][i];
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static void check_gorizont(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (Character.isDigit(array[i][0])) {
                    while (Character.isDigit(array[i][j]) && j < array[0].length - 1) {
                        j++;
                    }
                    if (array[i][j] == '*' && j < array.length - 1) {
                        j++;
                        if (array[i][j] == '(' && j < array.length - 1) {
                            j++;
                            if (array[i][j] == 'e' && j < array.length - 1) {
                                j++;
                                if (array[i][j] == '^' && j < array.length - 1) {
                                    j++;
                                    if (Character.isDigit(array[i][j])) {
                                        while (Character.isDigit(array[i][j]) && j < array.length - 1) {
                                            j++;
                                        }
                                        if (array[i][j] == '-' && j < array.length - 1) {
                                            j++;
                                            if (array[i][j] == 'e' && j < array.length - 1) {
                                                j++;
                                                if (array[i][j] == '^' && j < array.length - 1) {
                                                    j++;
                                                    if (Character.isDigit(array[i][j])) {
                                                        while (Character.isDigit(array[i][j]) && j < array.length - 1) {
                                                            j++;
                                                        }
                                                        if (array[i][j] == ')' && j < array.length - 1) {
                                                            j++;
                                                            if (array[i][j] == '=' && j < array.length - 1) {
                                                                j++;
                                                                if (Character.isDigit(array[i][j])) {
                                                                    while (Character.isDigit(array[i][j]) && j < array[0].length - 1) {
                                                                        j++;
                                                                    }
                                                                    if (j == array[0].length - 1) {
                                                                        array_list.add(new char[array.length]);
                                                                        for (int k = 0; k < array[0].length; k++) {
                                                                            array_list.get(array_list.size() - 1)[k] = array[i][k];
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static char fill() {
        char base = ' ';
        String simvol = input.next();
        if (simvol.length() == 1) {
            base = simvol.charAt(0);
        } else {
            while (simvol.length() != 1) {
                System.out.println("Вы допустили ошибку, повторите попытку");
                simvol = input.next();
            }
            base = simvol.charAt(0);
        }
        return base;
    }
    public static void output(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for  (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}