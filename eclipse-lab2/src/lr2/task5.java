package lr2;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Ввелите число");
    	int num = in.nextInt();
    	
    	int thous = Math.abs(num / 1000) % 10;
    	
    	System.out.println("Колличество тысяч: " + thous);
    	
    	in.close();
        
    }
}
