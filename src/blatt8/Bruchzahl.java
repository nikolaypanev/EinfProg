package blatt8;

public class Bruchzahl {
	
	private int zaehler;
	private int nenner;
	
	public Bruchzahl(int zaehler, int nenner) {
		this.setZaehler(zaehler);
		this.setNenner(nenner);
	}
	
	public String toString() {
		return zaehler + "/" + nenner;
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
	
}
