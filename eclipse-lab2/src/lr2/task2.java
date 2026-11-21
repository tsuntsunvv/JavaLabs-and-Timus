package lr2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Введите чсило: ");
    	int num = in.nextInt();
    	
    	if (num % 5 == 2 && num % 7 == 1) {
    		System.out.println("Число " + num + " удовлетворяет обоим условиям");
    	} else {
    		System.out.println("Число " + num + " НЕ удовлетворяет обоим условиям");
    	}
    	
        in.close();
    }
}
