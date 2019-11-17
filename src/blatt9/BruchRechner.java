package blatt9;

import iotools.IOTools;

public class BruchRechner {
	
	public static void main(String[] args) {
		
		Bruch br1 = new Bruch();
		Bruch br2 = new Bruch();
		
		char input = ' ';
		
		while (input != 'x') {
			System.out.println("Bruch 1: " + br1);
			System.out.println("Bruch 2: " + br2);
			
			System.out.println("Aktionen: ");
			System.out.println(" x: Beenden\n 1: Bruch 1 eingeben\n 2: Bruch 2 eingeben\n b: Brueche kuerzen\n *,/,+,-: Grundrechenarten\n n: Bruch 1 negativ\n "
					+ "k: Kehrwert von Bruch 1\n d: Double-Wert von Bruch 1\n");
			
			System.out.println("Eingabe: ");
			input = IOTools.readChar();
			
			switch (input) {
			case '1': br1.einlesen(); 
				break; 
			case '2': br2.einlesen(); 
				break;			
			case 'b': System.out.println("Brueche kuerzen");
				br1 = br1.kuerze();
				br2 = br2.kuerze(); 
				break;
			case '*': System.out.println("Multiplikation: " + br1.mul(br2)); 
				break;			
			case '/': System.out.println("Division: " + br1.div(br2)); 
				break;
			case '+': System.out.println("Addition: " + br1.add(br2)); 
				break;	
			case '-': System.out.println("Subtraktion: " + br1.sub(br2)); 
				break;
			case 'n': System.out.println("Bruch 1 negativ: " + br1.neg()); 
				break;
			case 'k': System.out.println("Kehrwert von Bruch 1: " + br1.kehrwert()); 
				break;		
			case 'd': System.out.println("Double-Wert von Bruch 1: " + br1.wert()); 
				break;	
			case 'x': System.out.println("Programm wird beendet...");
				break;
			default: System.out.println("Eingabe unbekannt. Bitte erneut eingeben...\n ");
			}
		}
		
	}

}
