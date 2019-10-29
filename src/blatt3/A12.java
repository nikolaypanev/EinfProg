package blatt3;

import iotools.IOTools;

public class A12 {
	
	public static void main(String[] args) {
		
		System.out.println("Eingabe Betrag: ");
		double betrag = IOTools.readDouble();
		System.out.println("Eingabe Zinssatz: ");
		double zinssatz = IOTools.readDouble();
		System.out.println("Eingabe Laufzeit" );
		int laufzeit = IOTools.readInt();
		
		System.out.println("Aunzulegender Betrag in Euro: " + betrag);
		System.out.println("Jahreszins (z.B. 0.1 = 10 Prozent): " + zinssatz);
		System.out.println("Laufzeit (in Jahren): " + laufzeit);
		
		for (int i = 1; i <= laufzeit; i++) {
			betrag *= (1 + zinssatz);
			System.out.printf("Wert nach %d Jahren: %f\n", i, betrag);
		}
		
	}

}
