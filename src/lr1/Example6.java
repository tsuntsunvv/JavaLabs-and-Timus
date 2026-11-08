package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите свою фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите свое имя: ");
        String name = in.nextLine();

        System.out.println("Введите свое отчество: ");
        String patrinymic = in.nextLine();

        System.out.println("Привет, "+ surname + " " + name + " " + patrinymic);

        in.close();
    }
}
