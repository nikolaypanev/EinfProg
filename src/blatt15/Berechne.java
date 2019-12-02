package blatt15;

public class Berechne {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		String fn = args[0]; //to lowercase
		String val = args[1]; //must be a double number
		
	}
	
	//must be in range (1;-1)
	public double sinus(double arg) {
		return Math.asin(arg);
	}
	
	//must be in range (1;-1)
	public double cosinus(double arg) {
		return Math.cos(arg);
	}
	
	//no specified range
	public double tangens(double arg) {
		return Math.tan(arg);
	}

	public void eingabe() {
		
	}
	
}
