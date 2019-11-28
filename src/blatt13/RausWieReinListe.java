package blatt13;

@SuppressWarnings("unused")
public class RausWieReinListe implements WarteListe {

	private Patient liste[] = new Patient[1000];
	
	private int added;
	private int next;
	
	public RausWieReinListe() {
	
	}
	
	@Override
	public void rein(Patient p) {	
		for (int i = 0; i < liste.length; i++) {
			if (liste[i] == null) { //add patient if index is empty
				liste[i] = p; 
			}
		}
		added++; 
	}

	@Override
	public Patient raus() {
		
		return null;
	}

}
