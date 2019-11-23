package blatt13;

public class Kontostand extends Zahl {

	private double wert;
	
	public Kontostand(double wert) {
		this.wert = wert;
	}

	@Override
	public Zahl neg() {
		return new Kontostand(wert*(-1));
	}

	@Override
	public Zahl add(Zahl zahl) {
		//return new Kontostand(zahl.add(wert)); zahl and wert are different data types
		return null;
	}
	
	public String toString() {
		return "Kontostand: " + wert;
	}
	
	//liefert true zurück, wenn Objekt- und Parameter-Werte gleich sind
	public boolean equals(Kontostand konto) {
		if (wert == konto.wert) {
			return true;
		} else {
			return false;
		}
	}
	
}
