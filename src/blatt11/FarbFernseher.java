package blatt11;

public class FarbFernseher extends Fernseher {

	private int farbe;
	
	public FarbFernseher(String ra, int vo, int pr, int farbe) {
		super(ra, vo, pr);
		this.farbe = farbe;
	}
	
	public void change(String einstell, int wert) {
		
	}
	
	public boolean istAngenehmerAls (FarbFernseher fernseher) {
		if (getVolume() < fernseher.getVolume() && farbe < 40 && farbe > fernseher.farbe) {
			return true;
		} else {
			return false;
		}
	}
	
}
