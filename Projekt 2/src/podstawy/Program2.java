package podstawy;

import java.util.*;

public class Program2 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Napisz 1-wszy bok tr�jk�ta: ");
		double a = scan.nextDouble();
		System.out.println("Napisz 2-gi bok tr�jk�ta: ");
		double b = scan.nextDouble();
		System.out.println("Napisz 3-ci bok tr�jk�ta: ");
		double c = scan.nextDouble();
		
		System.out.println(poleTrojkata(a,b,c));
		
	}private static double poleTrojkata(double a, double b, double c) {
		double p = (a + b + c)/2;
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}
	}
