package blatt1;


public class Raviolita {


	
	public static double blechstueckDiagonal(double u, double h) {
		double diagonal = Math.sqrt((u*u) + (h*h));
		System.out.println("Diagonal: " + diagonal);
		return diagonal;
	}
	
	public static double durchmesserBoden (double u, double h) {
		double durchmesser = (u/Math.PI) + (u%Math.PI);
		System.out.println("Bodendurchmesser: " + durchmesser);
		return durchmesser;
	}
	
	public static double dosenbodenFlaeche (double u, double h) {
		
		double dosenboden = Math.PI*(Math.pow((durchmesserBoden(u, h)/2) + (durchmesserBoden(u, h)%2) , 2));
		System.out.println("Fläche der Dosenboden: " + dosenboden);
		return dosenboden;
	}
	
	public static double doseMantelflaeche (double u, double h) {
		double mantel = u*h;
		System.out.println("Fläche der Dosenmantel: " + mantel);
		return mantel;
	}
	
	public static double doseGesamtflaeche (double u, double h) {
		double gesamtflaeche = 2*dosenbodenFlaeche(u, h) + doseMantelflaeche(u, h);
		System.out.println("Gesamtfläche der Dose: " + gesamtflaeche);
		return gesamtflaeche;
	}
	
	public static double doseVolumen (double u, double h) {
		double volumen = dosenbodenFlaeche(u, h) * h;
		System.out.println("Volumen der Dose: " + volumen);
		return volumen;
	}
}


