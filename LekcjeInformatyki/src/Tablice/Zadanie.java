package Tablice;

public class Zadanie {
	public static void main(String[] args) 
	
	{
		
		int[] numbers = new int[1_000_000];
		
		int i = 0;
		
		while (i < 1_000_000){
			numbers[i] = i;
			i++;
		}
		
		WypiszTablice(numbers);
		
	}
	private static void WypiszTablice(int[] tablica){
		for (var element : tablica){
			System.out.println(element);
		}
	}
}
