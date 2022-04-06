package skaner;
import java.util.*;
// dolary na z³
public class Zadanie2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Napisz z³: ");
		double zl = scan.nextDouble();
		System.out.println(zamienNaDolce(zl));
	}
	private static double zamienNaDolce(double zl) {
		double dolce = zl/3.96;
		return dolce;
	}

}
