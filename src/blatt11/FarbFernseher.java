package blatt11;

public class FarbFernseher extends Fernseher {

	private int color;
	
	public FarbFernseher(String ra, int vo, int pr, int farbe) {
		super(ra, vo, pr);
		farbe = Math.max(0,Math.min(vo,50)); //int value between 0 and 50
	}
	
	//overrides Fernseher.change()
	public void change(String einstell, int wert) {
		if (einstell.equals("color")) {
			color += wert;
		} else {
			super.change(einstell, wert);
		}
	}
	
	//true only when, object attribute < parameter & farbe is in range
	public boolean istAngenehmerAls (FarbFernseher fernseher) {
		if (getVolume() < fernseher.getVolume() && color < 40 && color > fernseher.color) {
			return true;
		} else {
			return false;
		}
	}
	
	//overrides Fernseher.toString()
	public String toString() {
		return super.toString() + "farbe=" + color;
	}
	
}
