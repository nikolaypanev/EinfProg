package blatt9;

import iotools.IOTools;

public class Strecke {
	
	private Punkt p;
	private Punkt q;
	
	public Strecke(Punkt p, Punkt q) {
		this.setP(p);
		this.setQ(q);
	}
	
	public static void read() {
		double p = IOTools.readDouble();
		System.out.println("X-Koordinate der Punkt P: " + p);
		double q = IOTools.readDouble();
		System.out.println("Y-Koordinate der Punkt Q:" + q);
	}
	
	@Override
	public String toString() {
		return p.toString() + "_" + q.toString();
	}
	
	public double getLaenge() {
		double laenge = Math.sqrt(Math.pow((p.getX() - q.getX()), 2) + Math.pow((p.getY() - p.getY()), 2));
		return laenge;
	}

	public Punkt getP() {
		return p;
	}

	public void setP(Punkt p) {
		this.p = p;
	}

	public Punkt getQ() {
		return q;
	}

	public void setQ(Punkt q) {
		this.q = q;
	}

}
