package blatt1;

public class A6 {
	
	public static void main(String[] args) {
		
		int x = 192119201;
		int y = 35675640;
		
		/* Aufgabe 6.3 
		 * Ergebnis: 1783
		 */
		int result = (((x*y*y)*(1682*y*y + 29))/107751) + (((x*x*x)*(3 - 2*x*x))/107751) + (832/107751);
		System.out.println(result);

		
		/* Aufgabe 6.2
		 * Ergebnis mit modulo: -49062
		 * Ergebnis ohne modulo: -12698	
		
		int result = ((1682*x*y*y*y*y + 3*x*x*x + 29*x*x - 2*x*x*x*x*x + 832)/107751); //+ ((1682*x*y*y*y*y + 3*x*x*x + 29*x*x - 2*x*x*x*x*x + 832)%107751) ;
		System.out.println(result);
		*/
		
		
		/* Aufgabe 6.1
		 * Ergebnis: 0.0
		double x1 = Math.pow(10, 20);
		double x2 = 1223;
		double x3 = Math.pow(10, 18);
		double x4 = Math.pow(10, 15);
		double x5 = 3;
		double x6 = -(Math.pow(10, 12));

		double y1 = Math.pow(10, 20);
		double y2 = 2;
		double y3 = -(Math.pow(10, 22));
		double y4 = Math.pow(10, 13);
		double y5 = 2111;
		double y6 = Math.pow(10, 16);

		double result = (x1*y1) + (x2*y2) + (x3*y3) + (x4*y4) + (x5*y5) + (x6*y6);
		System.out.println(result);
		*/
	}

}
