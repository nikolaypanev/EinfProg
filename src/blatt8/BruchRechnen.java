package blatt8;

import iotools.IOTools;

public class BruchRechnen {
	
	public void einlesen(Bruchzahl bruchzahl) {
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
	
	public void ausgeben(Bruchzahl bruchzahl) {
		System.out.printf("%d/%d");
	}
	
	public double wert(Bruchzahl bruchzahl) {
		return 0;
	}

}
