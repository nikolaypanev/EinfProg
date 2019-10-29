package blatt1;

import iotools.*;


public class A5 {
	
	public static void main(String[] args) {
		
		System.out.println("Eingabe h: ");
		double h = IOTools.readDouble();
		System.out.println("Eingabe u: ");
		double u = IOTools.readDouble();
		
		//TODO: fix multiple prints
		Raviolita.blechstueckDiagonal(h, u);
		Raviolita.durchmesserBoden(h, u);
		Raviolita.dosenbodenFlaeche(h, u);
		Raviolita.doseMantelflaeche(h, u);
		Raviolita.doseGesamtflaeche(h, u);
		Raviolita.doseVolumen(h, u);
		
	}

}
