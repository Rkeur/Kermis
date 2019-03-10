package games;
import java.util.Random;

import java.util.Scanner;
public class blackjack {
	public static void main(String[] args) {
		

	String[] deck = {"Harten 1",	"Harten 2",	"Harten 3",	"Harten 4", "Harten 5",	"Harten 6",	"Harten 7",	"Harten 8",	"Harten 9",	"Harten 10",
			"Ruiten 1",	"Ruiten 2",	"Ruiten 3",	"Ruiten 4",	"Ruiten 5",	"Ruiten 6",	"Ruiten 7",	"Ruiten 8",	"Ruiten 9",	"Ruiten 10",
			"Klaver 1",	"Klaver 2",	"Klaver 3",	"Klaver 4",	"Klaver 5",	"Klaver 6",	"Klaver 7",	"Klaver 8",	"Klaver 9",	"Klaver 10",
			"Schoppen 1","Schoppen 2","Schoppen 3",	"Schoppen 4","Schoppen 5","Schoppen 6","Schoppen 7","Schoppen 8",	"Schoppen 9",	"Schoppen 10",
			"Harten Aas","Harten Boer",	"Harten Vrouw",	"Harten Heer",						
			"Ruiten Aas",	"Ruiten Boer",	"Ruiten Vrouw",	"Ruiten Heer",						
			"Klaver Aas",	"Klaver Boer",	"Klaver Vrouw",	"Klaver Heer",						
			"Schoppen Aas",	"Schoppen Boer",	"Schoppen Vrouw",	"Schoppen Heer",};
	int punten = 0;
	
	for (int counter = 0; counter < deck.length; counter++) {
	Random random = new Random();
	int index = random.nextInt(deck.length);
	
	String temp = deck[counter];
	deck[counter] = deck [index];
	deck[index] = temp;
	}
	
	for (int counter2 = 0; counter2  <deck.length; counter2++) {
		System.out.println(deck[counter2]);
		
	}{
		System.out.println();
		System.out.println("Voer k in om een kaart te vragen. Als je het spel wilt stoppen, voer q in. Voer p in om te passen");
		
	for (int counter4 = 0; counter4  <deck.length; counter4++) {
		
		Scanner input = new Scanner (System.in);
		String ingegevene = input.nextLine();

	
		
	switch(ingegevene) {	
			
			case "p":
			System.out.println("Je hebt gepast. je hebt " + punten + " punten");
			break;
			
			
			case "k": 
				System.out.println(deck[counter4]);
				if(deck[counter4] == "Harten 1"){
					punten += 1;
				System.out.println("Je hebt op dit moment " + punten + " punten");
				
				}else if ((deck[counter4] == "Harten 2")){
					punten += 2;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					
				}else if ((deck[counter4] == "Harten 3")){
					punten += 3;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 4")){
					punten += 4;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 5")){
					punten += 5;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 6")){
					punten += 6;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 7")){
					punten += 7;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 8")){
					punten += 8;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 9")){
					punten += 9;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten 10")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten Aas")){
					punten += +11;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten Boer")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten Vrouw")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				}else if ((deck[counter4] == "Harten Heer")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
				} {if(deck[counter4] == "Ruiten 1"){
					punten += 1;
					System.out.println("Je hebt op dit moment " + punten + " punten");

					}else if ((deck[counter4] == "Ruiten 2")){
					punten += 2;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 3")){
					punten += 3;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 4")){
					punten += 4;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 5")){
					punten += 5;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 6")){
					punten += 6;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 7")){
					punten += 7;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 8")){
					punten += 8;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 9")){
					punten += 9;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten 10")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten Aas")){
					punten += 11;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten Boer")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten Vrouw")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Ruiten Heer")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					} 
				} {if(deck[counter4] == "Klaver 1"){
					punten += 1;
					System.out.println("Je hebt op dit moment " + punten + " punten");

					}else if ((deck[counter4] == "Klaver 2")){
					punten += 2;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 3")){
					punten += 3;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 4")){
					punten += 4;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 5")){
					punten += 5;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 6")){
					punten += 6;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 7")){
					punten += 7;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 8")){
					punten += 8;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 9")){
					punten += 9;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver 10")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver Aas")){
					punten += 11;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver Boer")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver Vrouw")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Klaver Heer")){
					punten += 10;
					System.out.println("Je hebt op dit moment " + punten + " punten");
					} } {if(deck[counter4] == "Schoppen 1"){
						punten += 1;
						System.out.println("Je hebt op dit moment " + punten + " punten");
					}else if ((deck[counter4] == "Schoppen 2")){
						punten += 2;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 3")){
						punten += 3;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 4")){
						punten += 4;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 5")){
						punten += 5;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 6")){
						punten += 6;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 7")){
						punten += 7;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 8")){
						punten += 8;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 9")){
						punten += 9;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen 10")){
						punten += 10;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen Aas")){
						punten += 11;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen Boer")){
						punten += 10;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen Vrouw")){
						punten += 10;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}else if ((deck[counter4] == "Schoppen Heer")){
						punten += 10;
						System.out.println("Je hebt op dit moment " + punten + " punten");
						}}
			
			default:
				System.out.println("");
				break;}

	if (ingegevene.equals("q")) {
		System.out.println("Het spel is gestopt. je had " + punten + " punten");
		break; }
	if (punten > 21) {
		System.out.println("Je hebt verloren. Het spel is gestopt" );
		break;
				}
	
			}
		}
	}
}

	
	
	
	


	


