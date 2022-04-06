package skaner;

import java.util.Scanner;
import java.util.*;

public class Kalkulator {
	private static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write number1 (numbers like 2.5 write 2,5)");
		float number1 = scan.nextFloat();
		System.out.println("Write number2");
		float number2 = scan.nextFloat();
		System.out.println("Write number of operation "
				+ "(1 - addition; 2 - substraction; "
				+ "3 - multiplication; 4 - division");
		int numberOfOperation = scan.nextInt();
		if (numberOfOperation == 1) {
			System.out.println(addition(number1,number2)); 
		}else if (numberOfOperation == 2) {
			System.out.println(substraction(number1,number2));
		}else if (numberOfOperation == 3) {
			System.out.println(multiplication(number1,number2));
		}else if (numberOfOperation == 4) {
			System.out.println(division(number1,number2));
		}else {
			System.out.println("Not funny :(");
		}
		
	}
	private static float addition(float number1, float number2) {
		return number1 + number2;
	}
	private static float substraction(float number1, float number2) {
		return number1 - number2;
	}
	private static float multiplication(float number1, float number2) {
		return number1*number2;
	}
	private static float division(float number1, float number2) {
		return number1/number2;
	}
	
	
	
}
