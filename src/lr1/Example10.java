package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш год рождения: ");
        int birth = in.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - birth;

        System.out.println("Ваш возраст: " + age);

        in.close();
    }
}
