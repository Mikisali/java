package Tablice;
import java.util.Scanner;
public class Zadanie2 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj liczbe z jakiej utworzê silnie: ");
		int num = sc.nextInt();
		long[] numbers = new long[num];
		int i = 0;
		int j = 1;
		while (num > i){
			numbers[i] = j;
			i++;
			j++;
		}
		System.out.println(zrobSilnie(numbers));
		
	}
	private static long zrobSilnie(long[] tablica) {
		long x = 1;
		for (var element : tablica){
			x *= element;
		}
		return x;
	}
}
