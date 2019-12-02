package blatt15;

public class Function {
	
	@SuppressWarnings("unused")
	private String fn;
	@SuppressWarnings("unused")
	private double wert;
	
	
	public Function(String a, String b) {
		this.wert = Double.parseDouble(a);
	}
	
	public double sinus(double arg) throws IllegalArgumentException {
		if (arg == Double.NaN) {
			throw new IllegalArgumentException("Value cannot be zero!");
		} else {
			return Math.sin(arg);
		}
	}
	
	public double cosinus(double arg) throws IllegalArgumentException {
		if (arg == Double.NaN) {
			throw new IllegalArgumentException("Invalid input!");
		} else {
			return Math.cos(arg);
		}
	}
	
	public double tangens(double arg) throws IllegalArgumentException {
		if (arg == Double.NaN) {
			throw new IllegalArgumentException("Invalid input!");
		} else {
			return Math.tan(arg);
		}
	}


}
