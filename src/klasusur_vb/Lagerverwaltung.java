package klasusur_vb;

//Klausurvorbereitung 11.5
public class Lagerverwaltung {
	
	public static double inventurWert(Lager lg) {
		double s = 0;
		for (int i = 0; i < lg.anzahl.length; i++) { //Lager Anzahl
			s += lg.anzahl[i]*lg.preis[i];
		}
		return s;
	}
	
	public static void neuzugang(Lager lg, int[] neu) {
		for(int i = 0; i < lg.anzahl.length; i++) {
			lg.anzahl[i] += neu[i];
		}
	}
	
}
