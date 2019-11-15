package blatt11;

import iotools.IOTools;

public class DSpiel {
	
	public static void main(String[] args) {
		
		System.out.println("Positionieren Sie die Beute: ");
		System.out.println("Spalte A bis H Ihrer Figur: ");
		char xpos_beute = IOTools.readChar();
		System.out.println("Zeile 1 bis 8 Ihrer Figur: ");
		int ypos_beute = IOTools.readInt();
		System.out.println("Farbe Ihrer Figur: ");
		String farbe_beute = IOTools.readLine();
		DameFigur beute = new DameFigur(xpos_beute, ypos_beute, farbe_beute);
		
		System.out.println("Der Bildschirm wird geloescht");
		Bildschirm.loeschen();
		
		System.out.println("Positionieren Sie den Jäger");
		System.out.println("Spalte A bis H Ihrer Figur: ");
		char xpos_jaeger = IOTools.readChar();
		System.out.println("Zeile 1 bis 8 Ihrer Figur: "); 
		int ypos_jaeger = IOTools.readInt();
		System.out.println("Farbe Ihrer Figur: ");
		String farbe_jaeger = IOTools.readLine();
		DameFigur jaeger = new DameFigur(xpos_jaeger, ypos_jaeger, farbe_jaeger);
		
		if (jaeger.trifft(beute)) {
			System.out.println("Beute getroffen!");
		} else {
			System.out.println("Die Beute-Figur steht woanders!");
			for (int i = 0; i < 10; i++) {
				System.out.println("Eingabe neue Position: ");
				char xpos_new = IOTools.readChar();
				int ypos_new = IOTools.readInt();
				jaeger.ziehe(xpos_new, ypos_new);
				if (jaeger.trifft(beute)) {
					System.out.println("Beute getroffen!");
				}
			}
		}
		
	}

}
