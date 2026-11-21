package lr2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Ввелите число");
    	int num = in.nextInt();
    	
    	if (num >= 5 && num <= 10) {
    		System.out.println("Число " + num + " попадает в диапазон от 5 до 10");
    	} else {
    		System.out.println("Число " + num + " НЕ попадает в диапазон от 5 до 10");
    	}
       in.close(); 
    }
}
