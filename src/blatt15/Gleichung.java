package blatt15;

public class Gleichung {

	private double a;
	private double b;
	private double c;
	
	public Gleichung(String a, String b, String c) {
		this.a = Double.parseDouble(a);
		this.b = Double.parseDouble(b);
		this.c = Double.parseDouble(c);
	}

	public Loesung berechneLoesung() throws UnloesbarException {
		if (a == 0) {
			throw new NichtquadratischException("a = 0 nicht zulaessig");
		}
		double d = (b*b) - (4*a*c);
		if (d < 0) {
			throw new UnloesbarException("b*b-4*a*c = \" + d + \" < 0");
		}
		double w = Math.sqrt(d);
		double x1 = (-b + w)/(2*a);
		double x2 = (-b - w)/(2*a);
		return new Loesung(x1, x2);
	}

}
