package skaner;
import java.util.*;
// objetoœæ prostopad³oœcianu
public class Zadanie3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Napisz d³ugoœæ krawêdzi a: ");
		double a = scan.nextDouble();
		System.out.println("Napisz d³ugoœæ krawêdzi b: ");
		double b = scan.nextDouble();
		System.out.println("Napisz d³ugoœæ krawêdzi c: ");
		double c = scan.nextDouble();
		System.out.println(obliczObjetosc(a,b,c));
	}
	private static double obliczObjetosc(double a,double b,double c) {
		double V = a * b *c;
		return V;
	}
}
