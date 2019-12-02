package blatt15;

public class Berechne {

	public static void main(String[] args) throws InvalidInputException, NoSuchFunctionException {
		try { 
			//Function f = new Function(args[0], args[1]);

		} 
		catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Korrekter Programmaufruf: java <Funktion> <Argument>");
		}
		catch(IllegalArgumentException iae) {
			//illegal argument message
		}
	}

}
