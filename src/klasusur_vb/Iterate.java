package klasusur_vb;

public class Iterate {
	
	public static void main(String[] args) {	
		
	}
	
	public static double cbrt(double a) {
		double xNeu = Math.sqrt(a);
		double xAlt;
		do {
			 xAlt  = xNeu;
			 xNeu = ((2*xAlt ) + (a/(Math.pow(xAlt , 2))))/3.0;
		} while (Math.abs(xNeu - xAlt ) <= Math.pow(10, -15)*Math.abs(xNeu));
		return xNeu;
	}

}
