package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num2 = in.nextInt();

        int num1 = num2 - 1;
        int num3 = num2 + 1;

        int sum = num1 + num2 + num3;
        int num4 = sum * sum;

        System.out.println("Последовательность чисел: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);

        in.close();
    }
}
