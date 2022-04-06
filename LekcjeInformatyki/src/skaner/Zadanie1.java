package skaner;
import java.util.*;
//zamiana metrów na stopy
public class Zadanie1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Napisz dlugosc w metrach: ");
		double metry = scan.nextDouble();
		System.out.println(zamienNaStopy(metry));
	}
	private static double zamienNaStopy(double metry) {
		double stopy = 0.3048000 * metry;
		return stopy;
	}

}
