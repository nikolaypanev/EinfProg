package blatt11;

public class DameFigur extends Spielfigur { 
	
	@SuppressWarnings("unused")
	private final String name = "Dame";
	
	public DameFigur(char x, int y, String f) {
		super(x, y, f);
	}
	
	//direction of movement + number of cells to move in that direction
	public void ziehe (char richtung, int anzahl) {
		if (richtung == '-') {
			ziehe(anzahl, 0); 
		} else if (richtung == '|') {
			ziehe(0, anzahl);
		} else if (richtung == '\\') {
				ziehe(anzahl, -anzahl);
		} else if (richtung == '/') {
			ziehe(anzahl, anzahl);
		} else {
			System.out.println("Eingabe inkorrekt");
		}
	}
	
	public boolean trifft(DameFigur dame) {
		return (dame.getXpos() == getXpos()) && (dame.getYpos() == getYpos()); //if-clause not needed, output will be a true/false value
	}
	
	@Override
	public String toString() {
		return getFarbe() + "...e Dame auf dem Feld " + getXpos() + " " + getYpos();
	}
	

}
