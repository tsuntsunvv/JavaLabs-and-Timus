package lr2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Ввелите число");
    	int num = in.nextInt();
    	
    	if ( num % 4 == 0 && num >= 10) {
    		System.out.println("Число " + num + " удовлетворяет условиям");
    	} else {
    		System.out.println("Число " + num + " НЕ удовлетворяет условиям");
    	}
        in.close();
    }
}
