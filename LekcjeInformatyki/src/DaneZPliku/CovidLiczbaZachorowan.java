package DaneZPliku;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CovidLiczbaZachorowan {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scStr = new Scanner(System.in);
		System.out.println("Podaj w jakim wojew�dztwie chcesz sie dowiedzie� ile przypadk�w.");
		System.out.println("0 - ca�y Kraj; 1 - dolno�l�skie itp");
		int woj = scStr.nextInt();
		
		
		
		File plik = new File("dane.csv");
		Scanner scFil = new Scanner(plik);
		String linia = "";
		String[] s;
		int i = -1;
		
		while(scFil.hasNextLine()) 
			 
		{
			linia = scFil.nextLine();
			s = linia.split(";");
			if (i == woj) {
				System.out.print(s[0] + " ");
				System.out.println(s[1]);
			}
			i++;
		}
		
		scFil.close();
		scStr.close();
	}
}
