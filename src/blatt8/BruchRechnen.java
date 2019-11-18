package blatt8;

import iotools.IOTools;

public class BruchRechnen {
	
	public static void main(String[] args) {
		Bruchzahl bruch = new Bruchzahl(0,0);
		einlesen(bruch);
		bruch.toString();
	}
	
	public static void einlesen(Bruchzahl bruchzahl) {
		System.out.println("Zaehler eingeben: ");
		int a = IOTools.readInt(); //Zaehler
		System.out.println("Nenner eingeben: ");
		int b = IOTools.readInt(); //Nenner
		if (b == 0) {
			System.out.println("Nenner ist 0, bitte erneut eingeben: ");
			b = IOTools.readInt();
		}
		@SuppressWarnings("unused")
		Bruchzahl zahl = new Bruchzahl(a, b);
	}
	
	public void ausgeben(Bruchzahl bruch) {
		System.out.printf("%d/%d");
	}
	
	public double wert(Bruchzahl bruch) {
		return 0;
	}
	
	public Bruchzahl kehrwert(Bruchzahl bruch) {
		int zaehler_new = bruch.getNenner();
		int nenner_new = bruch.getZaehler();
		return new Bruchzahl(zaehler_new, nenner_new);
	}

}
