package blatt13;


public class RausWieReinListe implements WarteListe {

	private Patient liste[] = new Patient[1000];
	
	private int current;
	private int next;
	
	public RausWieReinListe() {
		 
	}
	
	@Override
	public void rein(Patient p) {	
		liste[current] = p;
		liste[current] = liste[next]; //move to next index
	}

	@Override
	public Patient raus() {
		liste[current] = null; // delete value on index
		return liste[current];
	}

}
