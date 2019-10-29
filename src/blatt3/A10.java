package blatt3;

import iotools.*;

public class A10 {
	
	public static void main(String[] args) {
		
		System.out.println("Eingabe Tag: ");
		int t = IOTools.readInt();
		System.out.println("Eingabe Monat: ");
		int m = IOTools.readInt();
		System.out.println("Eingabe Jahr: ");
		int j = IOTools.readInt();
		
		int h;
		
		if ( m <= 2) {
			m += 10;
			j--;
		} else {
			m -= 2;
		}
		
		int c = j/100;
		int y = j%100;
		
		h = (((26*m - 2)/10) + t + y + (y/4) + (c/4) - 2*c)%7;
		
		String day = null;
		
		switch (h) {
			
			case 0: day = "Sonntag"; break;
			case 1: day =  "Montag"; break;
			case 2: day = "Dienstag"; break;
			case 3: day = "Mittwoch"; break;
			case 4: day = "Donnerstag"; break;
			case 5: day = "Freitag"; break;
			case 6: day = "Samstag"; break;
			default: System.out.println("Invalid input!");
		}
		
		System.out.printf("Der %d.%d.%d ist ein %s", t, m, j, day);
	}

}
