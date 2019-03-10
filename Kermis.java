package games;

import java.util.Scanner;

public class Kermis {
	public static void main(String[] args) {
		System.out.println("Welkom bij de Kermis. Kies nummer 1,2,3,4,5,6");
		Attracties kermis = new Attracties();
		kermis.draaien("", 0, 0);

		botsauto bots = new botsauto();
		spin achtpoot = new spin();
		spiegelpaleis spiegel = new spiegelpaleis();
		spookhuis spook = new spookhuis();
		hawaii hawaai = new hawaii();
		ladderklimmen ladder = new ladderklimmen();
	}
}

class Attracties {
	static void draaien(String naam, double prijs, double oppervlakte) {
		OmzetBerekenen omzet = new OmzetBerekenen();
		Kaartjes kaarten = new Kaartjes();
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 100; i++) {

			String ingegevene = input.nextLine();

			switch (ingegevene) {
			case "1":
				botsauto.draaien("Botscarz", 5.0, 8.0);
				omzet.TotaleOmzet += botsauto.prijs;
				kaarten.TotaleKaartjes += 1;

				System.out.println("Omzet is " + (omzet.omzetBots += botsauto.prijs));
				System.out.println("Kaartverkoop is " + (kaarten.KaartjesBots += 1));
				break;

			case "2":
				spin.draaien("achtpoot", 6.0, 4.0);
				omzet.TotaleOmzet += spin.prijs;
				kaarten.TotaleKaartjes += 1;

				System.out.println("Omzet is " + (omzet.omzetSpin += spin.prijs));
				System.out.println("Kaartverkoop is " + (kaarten.KaartjesSpin += 1));
				break;

			case "3":
				spiegelpaleis.draaien("dubbelzien", 3, 5.0);
				omzet.TotaleOmzet += spiegelpaleis.prijs;
				kaarten.TotaleKaartjes += 1;
				System.out.println("Omzet is " + (omzet.omzetSpiegel += spin.prijs));
				System.out.println("Kaartverkoop is " + (kaarten.KaartjesSpiegel += 1));
				break;

			case "4":
				spookhuis.draaien("spjook", 5, 20.8);
				omzet.TotaleOmzet += spookhuis.prijs;
				kaarten.TotaleKaartjes += 1;
				System.out.println("Omzet is " + (omzet.omzetSpook += spin.prijs));
				System.out.println("Kaartverkoop is " + (kaarten.KaartjesSpook += 1));
				break;

			case "5":
				hawaii.draaien("haiwai", 4, 21.8);
				omzet.TotaleOmzet += hawaii.prijs;
				kaarten.TotaleKaartjes += 1;
				System.out.println("Omzet is " + (omzet.omzetHaiwai += spin.prijs));
				System.out.println("Kaartverkoop is " + (kaarten.KaartjesHaiwai += 1));
				break;

			case "6":
				ladderklimmen.draaien("ladderklimming", 2, 5);
				omzet.TotaleOmzet += ladderklimmen.prijs;
				kaarten.TotaleKaartjes += 1;
				System.out.println("Omzet is " + (omzet.omzetLadder += spin.prijs));
				System.out.println("Kaartverkoop is " + (kaarten.KaartjesLadder += 1));
				break;

			case "o":
				System.out.println("Totale omzet van de kermis is " + omzet.TotaleOmzet);

				break;

			case "k":
				System.out.println("Totale kaartverkoop van alle attracties is " + kaarten.TotaleKaartjes);
				break;

			default:
				break;
			}
		}
	}
}

class botsauto {

	static double prijs = 5;

	static void draaien(String naam, double prijs, double oppervlakte) {
		System.out.println("Draaien " + naam + "   Prijs " + prijs + "   Oppervlakte " + oppervlakte);
	}
}

class spin {
	static double prijs = 4;

	static void draaien(String naam, double prijs, double oppervlakte) {
		System.out.println("Draaien " + naam + "   Prijs " + prijs + "   Oppervlakte " + oppervlakte);
	}
}

class spiegelpaleis {
	static double prijs = 7;

	static void draaien(String naam, double prijs, double oppervlakte) {
		System.out.println("Draaien " + naam + "   Prijs " + prijs + "   Oppervlakte " + oppervlakte);
	}
}

class spookhuis {
	static double prijs = 2;

	static void draaien(String naam, double prijs, double oppervlakte) {
		System.out.println("Draaien " + naam + "   Prijs " + prijs + "   Oppervlakte " + oppervlakte);
	}
}

class hawaii {
	static double prijs = 9;

	static void draaien(String naam, double prijs, double oppervlakte) {
		System.out.println("Draaien " + naam + "   Prijs " + prijs + "   Oppervlakte " + oppervlakte);
	}
}

class ladderklimmen extends Attracties {
	static double prijs = 3;

	static void draaien(String naam, double prijs, double oppervlakte) {
		System.out.println("Draaien " + naam + "   Prijs " + prijs + "   Oppervlakte " + oppervlakte);
	}
}

class OmzetBerekenen {
	double TotaleOmzet;
	double omzetBots = 0;
	double omzetSpin = 0;
	double omzetSpiegel = 0;
	double omzetSpook = 0;
	double omzetHaiwai = 0;
	double omzetLadder = 0;
}

class Kaartjes {
	int TotaleKaartjes;
	int KaartjesBots = 0;
	int KaartjesSpin = 0;
	int KaartjesSpiegel = 0;
	int KaartjesSpook = 0;
	int KaartjesHaiwai = 0;
	int KaartjesLadder = 0;
	int keuringSpin = 0;
}
