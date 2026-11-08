package lr1;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int birth = in.nextInt();

        int currentYear = Year.now().getValue();;

        int age = currentYear - birth;

        System.out.println("Привет. Ваш возраст: " + age);

        in.close();
    }
}
