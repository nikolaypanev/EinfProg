package blatt9;

import iotools.IOTools;

public class Punkt {
	
	private double x;
	private double y;
	
	public Punkt (double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public String toString() {
		return getX() + ";" + getY();
	}
	
	public void read(double a, double b) {
		System.out.println("X eingeben: ");
		double x = IOTools.readDouble();
		setX(x);
		System.out.println("Y eingeben: ");
		double y = IOTools.readDouble();
		setY(y);
	}
	

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	

}
