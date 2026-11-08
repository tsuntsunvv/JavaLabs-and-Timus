package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        int summ = num1 + num2;
        int diff = num1 - num2;

        System.out.println("Сумма двух чисел равна: " + summ);
        System.out.println("Разность двух чисел равна: " + diff);

        in.close();
    }
}
