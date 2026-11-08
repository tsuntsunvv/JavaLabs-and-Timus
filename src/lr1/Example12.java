package lr1;

import java.time.Year;
import java.util.Scanner;
import java.time.Year;

public class Example12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();;

        int birth = currentYear - age;

        System.out.println("Привет. Ваш год рождения: " + birth);

        in.close();
    }
}
