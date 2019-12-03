package blatt15;


public class Function {
	
	@SuppressWarnings("unused")
	private String fn;
	@SuppressWarnings("unused")
	private double wert;
	
	public static double sinus(double arg) throws NumberFormatException {
		if (arg == Double.NaN) {
			throw new IllegalArgumentException("Value cannot be zero!");
		} else {
			return Math.sin(arg);
		}
	}
	
	public static double cosinus(double arg) throws NumberFormatException {
		if (arg == Double.NaN) {
			throw new IllegalArgumentException("Invalid input!");
		} else {
			return Math.cos(arg);
		}
	}
	
	public static double tangens(double arg) throws NumberFormatException {
		if (arg == Double.NaN) {
			throw new IllegalArgumentException("Invalid input!");
		} else {
			return Math.tan(arg);
		}
	}

}
