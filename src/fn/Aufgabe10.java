package fn;

public class Aufgabe10 {
	
	public static int berechneWochentag(int t, int m, int j) {
			if (m <= 2) {
				m += 10;
				j--;
			} else {
				m -= 2;
			}
			int c = j/100;
			int y = j%100;
			
			int h = ((((26*m) - 2)/10) + t + y + (y/4) + c/(4-2*c)) % 7;
			
			if (h < 0) {
				h += 7;
			}
			
			String day = null;
			
			switch (h) {
				case 0: day = "Sonntag"; break;
				case 1: day = "Montag"; break;
				case 2: day = "Dienstag"; break;
				case 3: day = "Mittwoch"; break;
				case 4: day = "Donnerstag"; break;
				case 5: day = "Freitag"; break;
				case 6: day = "Samstag"; break;
				default: System.out.println("Wrong input!");
			}
 		
		System.out.printf("der %d.%d.%d ist ein %s" , t,m,j,day);	
		return h;
	}

}
