package esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayInt {

	public static void main(String[] args) {
		int[] randomInt = new int[5];
		Random r = new Random();
		for (int i = 0; i < randomInt.length; i++) {
			randomInt[i] = r.nextInt(11);
		}
		int quit = 1;
		Scanner scan = new Scanner(System.in);
		while (quit != 0) {
			System.out.println(Arrays.toString(randomInt));
			System.out.println("Scrivi che posizione vuoi modificare");
			int indexSelected = scan.nextInt();
			if (indexSelected > 0) {
				switch (indexSelected) {
				case 1, 2, 3, 4, 5:
					System.out.println("Che valore vuoi inserire?");
					try {
						int indexValue = scan.nextInt();
						if (indexValue < 0 || indexValue > 10) {
							throw new NumberZero("Devi inserire un valore compreso tra 1 e 10");
						} else {
							randomInt[0] = indexValue;
						}
					} catch (NumberZero e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("inserisci valore da  a 5");
					break;
				}
			} else {
				System.out.println("sbagliato");
				quit = 0;
				scan.close();
			}
		}
	}
}
