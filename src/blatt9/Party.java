package blatt9;

import iotools.IOTools;

public class Party {
	
	public static void main(String[] args) {
		
		System.out.println("CD Anzahl eingeben: ");
		int anzahl = IOTools.readInt();
		CD[] cds = new CD[anzahl];
		
		einlesen(cds);
		sortieren(cds);
		vorhandeneAusgaben(cds);
		
	}
	
	public static void einlesen(CD[] cdf) {
		for (int i = 0; i < cdf.length; i++) {
			System.out.println("Titel: ");
			String titel = IOTools.readLine();
			System.out.println("Spieldauer: ");
			double spieldauer = IOTools.readDouble();
			System.out.println("Ausleihstatus: ");
			boolean ausgeliehen = IOTools.readBoolean();
			cdf[i] = new CD(titel, spieldauer, ausgeliehen);
		}
		
	}
	
	public static void sortieren(CD[] cdf) {
		for (int i = 0; i < cdf.length; i++) {
			for (int j = 0; j < cdf.length - 1; j++) {
				CD cd1 = cdf[j];
				CD cd2 = cdf[j + 1];
				
				if (cd1.spieldauer > cd2.spieldauer) {
					cdf[j + 1] = cd1;
					cdf[j] = cd2;
				}
			}
		}
		
	}
	
	public static void vorhandeneAusgaben(CD[] cdf) {
		for (int i = 0; i < cdf.length; i++) {
			if (cdf[i].ausleihstatus == true) {
				continue;
			} else {
				System.out.println(cdf[i]);
			}
		}
	}

}
