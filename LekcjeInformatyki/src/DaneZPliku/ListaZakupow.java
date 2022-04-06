package DaneZPliku;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ListaZakupow {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		
		File plik = new File("produkty.txt");
		Scanner scFil = new Scanner(plik);
		
		double cena = 0;
		String linia = "";
		String[] s;

		
		while(scFil.hasNextLine()) 
			 
		{
			linia = scFil.nextLine();
			s = linia.split(" ");
			
			System.out.println(s[0] + " " + s[1] + " " + s[2]);
			
			cena += (Integer.parseInt(s[1]) * Integer.parseInt(s[2])/100.);
		}
		System.out.println(cena);
		scFil.close();
	}
}
