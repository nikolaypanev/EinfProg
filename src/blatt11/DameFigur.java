package blatt11;

public class DameFigur extends Spielfigur { 
	
	@SuppressWarnings("unused")
	private final String name = "Dame";
	
	public DameFigur(char x, int y, String f) {
		super(x, y, f);
	}

	public void ziehe (char richtung, int anzahl) {
		if (richtung == '-') {
			ziehe(anzahl, 0); 
		} else if (richtung == '|') {
			ziehe(0, anzahl);
		} else if (richtung == '\\') {
			//TODO: add left diagonal
		} else if (richtung == '/') {
			//TODO: add right diagonal
		} else {
			System.out.println("Eingabe inkorrekt");
		}
	}
	
	public boolean trifft(DameFigur dame) {
		if (dame.getXpos() == getXpos() && dame.getYpos() == getYpos()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "...e Dame auf dem Feld " + getXpos() + " " + getYpos();
	}
	

}
