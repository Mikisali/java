package Tablice;

import java.util.Random;

public class Zadanie1 {
	public static void main(String[] args) {
		
		Random r = new Random();
		int orly = 0;
		for (int i = 0; i <1000_000; i++) {
			orly += (r.nextInt(2) == 0) ? 1:0;	
			
			
		}
		System.out.println("Or³y: " + orly);
		System.out.println("Reszki: " + (1000000 - orly));
	}


}
