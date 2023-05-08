package esercizio2;

import java.util.Scanner;

public class PrestazioniAuto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("inserisci km percorsi");
		try {
			int km = scan.nextInt();
			System.out.println("inserisci i litri di carburante consumati");
			int litri = scan.nextInt();
			System.out.println("il consumo di carburante è pari a: " + kmLitro(km, litri) + " km/L");
		} catch (ArithmeticException e) {
			System.out.println("devi innserire valori positivi");
		}
	}

	public static int kmLitro(int km, int litri) {
		return km / litri;
	}
}
