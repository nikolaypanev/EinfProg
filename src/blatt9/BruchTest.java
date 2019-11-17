package blatt9;

public class BruchTest {

	public static void main(String[] args) {
		
		//Initialisiert ohne Wert
		Bruch br1 = new Bruch();
		Bruch br2 = new Bruch();
		
		br1.einlesen();
		br2.einlesen();
		
		System.out.println("Multiplikation: " + br1.mul(br2));
		System.out.println("Division: " + br1.div(br2));
		System.out.println("Addition: " + br1.add(br2));
		System.out.println("Subtraktion: " + br1.sub(br2));
		System.out.println("Doublewert: " + br1.wert());
		System.out.println("Kehrwert: " + br1.kehrwert());
		System.out.println("Negativ: " + br1.neg());
		System.out.println("Gekuerzt: " + br1.kuerze());
	}

}
