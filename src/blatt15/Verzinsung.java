package blatt15;

import iotools.IOTools;

public class Verzinsung {
	
	public static void main(String[] args) {
		
		System.out.println("Drei Geldanlage-Beträge eingeben: ");
		double zinssatz = 0.053;
		double betrag1 = IOTools.readDouble();
		double betrag2 = IOTools.readDouble();
		double betrag3 = IOTools.readDouble();
		double[] werte = {betrag1, betrag2, betrag3};
		
		try {
			verzinsen(werte, zinssatz);
		} catch (AmountException e) {
			System.out.println("Verzinsung abgebrochen");
			e.printStackTrace();
		}
		
	}
	
	public static void verzinsen(double[] v, double z) throws AmountException {
		for (int i = 0; i < v.length; i++) {
			if (v[i] > 1000000) {
				throw new AmountException("Der " + (i + 1) + ". Geldanlage-Betrag ist zu hoch!");
			}
			v[i] *= (1 + z);				
			System.out.println("Alle Beträge mit 5.3 Prozent verzinst!");
			System.out.println("Geldanlage-Beträge jetzt: ");
			for (int k = 0; k < v.length; k++) {
				System.out.println(v[k]);
		}
		}
	}

}
