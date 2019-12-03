package blatt15;

public class Berechne {

	public static void main(String[] args) throws NoSuchFunctionException {
		try { 
			String fn = args[0]; 
			double wert = Double.parseDouble(args[1]);
		
			if (fn.contentEquals("sin")) {
				System.out.println("Ergebnis: " + Math.sin(wert));
			} else if (fn.contentEquals("cos")) {
				System.out.println("Ergebnis: " + Math.cos(wert));
			} else if (fn.contentEquals("tan")) {
				System.out.println("Ergebnis: " + Math.tan(wert));
			} else {
				throw new NoSuchFunctionException(fn);
			}
		} 
		catch(NumberFormatException iae) {
			System.out.println(args[1] + " ist kein double-Wert!");
		}
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Falscher Aufruf! Korrekter Programmaufruf: java <Funktion> <Argument>");
		}
		catch(NoSuchFunctionException nsfe) {
			System.out.println(args[0].toUpperCase() + " ist keine erlaubte Funktion!");
		}
	}

}
