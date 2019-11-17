package blatt9;

import iotools.IOTools;

public class Bruch {
	
	int zaehler;
	int nenner;
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	//leerer Konstruktor
	public Bruch() {
		
	}
	
	//GGT nach Euclid
	public static int ggt(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return ggt(b, a % b);
		}
	}
	
	public String toString() {
		return zaehler + "/" + nenner;
	}
	
	public void einlesen() {
		zaehler = IOTools.readInt("Zaehler eingeben: ");
		do {
			nenner = IOTools.readInt("Nenner eingeben: ");
			if (nenner == 0) {
				System.out.println("Nenner muss ungleich 0 sein. Bitte erneut eingeben: ");
			}
		} while (nenner == 0);
	}
	
	public Bruch kuerze() {
		return new Bruch(zaehler/ggt(zaehler,nenner), nenner/ggt(zaehler,nenner));
	}
	
	public Bruch kehrwert() {
		return new Bruch(nenner, zaehler);
	}
	
	//Negativer Wert
	public Bruch neg() {
		return new Bruch(zaehler*(-1), nenner);
	}
	
	//Bruch als double-Wert
	public double wert() {
		return (double)zaehler/nenner;
	}
	
	//Multiplikation des Parameters mit dem aktuellen Bruch
	public Bruch mul(Bruch br) {
		return new Bruch(br.zaehler*zaehler, br.nenner*nenner).kuerze();
	}
	
	//Division des Parameters mit dem aktuellen Bruch
	public Bruch div(Bruch br) {
		return mul(br.kehrwert());
	}
	
	//Addition des Parameters mit dem aktuellen Bruch
	public Bruch add(Bruch br) {
		return new Bruch(zaehler*br.nenner + br.zaehler*nenner, nenner*br.nenner).kuerze();
	}
	
	//Subtraktion des Parameters mit dem aktuellen Bruch
	public Bruch sub(Bruch br) {
		return add(br.neg());
	}
	
}
