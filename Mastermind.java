package games;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	public static void main(String[] args) {
		System.out.println(
				"Welkom bij mastermind! raad de code, je hebt 10 pogingen. Wil je het spel stoppen, voer q in");

		Computer computer = new Computer();
		computer.RandomCode();
		computer.Spelen();

	}
}

class Computer {
	int aantal = 0;
	static char randomLetters;
	static char randomLetters2;
	static char randomLetters3;
	static char randomLetters4;

	void RandomCode() {
		while (aantal <= 0) {
			aantal++;

			Random random = new Random();
			String alphabet = "abcdef";
			{
				alphabet.charAt(random.nextInt(alphabet.length()));
				randomLetters = alphabet.charAt(random.nextInt(alphabet.length()));
				System.out.print("****");

				Random random2 = new Random();
				String alphabet2 = "abcdef";
				{
					alphabet2.charAt(random2.nextInt(alphabet2.length()));
					randomLetters2 = alphabet2.charAt(random2.nextInt(alphabet2.length()));

					Random random3 = new Random();
					String alphabet3 = "abcdef";
					{
						alphabet3.charAt(random3.nextInt(alphabet3.length()));
						randomLetters3 = alphabet3.charAt(random3.nextInt(alphabet3.length()));

						Random random4 = new Random();
						String alphabet4 = "abcdef";
						{
							alphabet4.charAt(random4.nextInt(alphabet4.length()));
							randomLetters4 = alphabet4.charAt(random4.nextInt(alphabet4.length()));

						}
					}
				}
			}
		}
	}

	void Spelen() {
		for (int i = 0; i < 10; i++) {

			Scanner scanner = new Scanner(System.in);

			String c = scanner.next();

			char char1 = c.charAt(0);
			char char2 = c.charAt(1);
			char char3 = c.charAt(2);
			char char4 = c.charAt(3);
			int goed = 0;
			if(char1 == randomLetters){
				goed +=1;
			}
			else{
			goed +=0;
			}
			if(char2 == randomLetters2){
				goed +=1;
			}
			else{
			goed +=0;
			}
			if(char3 == randomLetters3){
				goed +=1;
			}
			else{
			goed +=0;
			}
			if(char4 == randomLetters4){
				goed +=1;
			}
			else{
			goed +=0;
			}
			System.out.println(goed + " zit erin");
			if (char1 == randomLetters && char2 == randomLetters2 && char3 == randomLetters3
					&& char4 == randomLetters4) {
				System.out.println("Gefeliciteerd! je hebt gewonnen!");
				break;
			} else {
				System.out.println("Helaas is het je niet gelukt");
			}
		}
	}
}