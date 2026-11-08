package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Текущий день недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Название месяца: ");
        String month = in.nextLine();

        System.out.println("Номер дня: ");
        String date = in.nextLine();

        System.out.println("Сегодня " + dayOfWeek+ " " + date + " " + month);

        in.close();
    }
}
