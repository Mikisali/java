package skaner;
import java.util.*;
// objeto�� prostopad�o�cianu
public class Zadanie3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Napisz d�ugo�� kraw�dzi a: ");
		double a = scan.nextDouble();
		System.out.println("Napisz d�ugo�� kraw�dzi b: ");
		double b = scan.nextDouble();
		System.out.println("Napisz d�ugo�� kraw�dzi c: ");
		double c = scan.nextDouble();
		System.out.println(obliczObjetosc(a,b,c));
	}
	private static double obliczObjetosc(double a,double b,double c) {
		double V = a * b *c;
		return V;
	}
}
