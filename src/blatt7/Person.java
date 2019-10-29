package blatt7;

public class Person {
	
	//private int lfdnr;
	private String vorname;
	private String nachname;
	private int alter;
	private boolean geschlecht;

	public Person(String vorname, String nachname, int alter, boolean geschlecht) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setAlter(alter);
		this.setGeschlecht(geschlecht);
	}
	
	/*
	public int getLfdnr() {
		return lfdnr;
	}

	public void setLfdnr(int lfdnr) {
		this.lfdnr = lfdnr;
	}
	*/
	
	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public boolean getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(boolean geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	
	@Override
	public String toString() {
		return vorname + " " + nachname;
	}
	
}
