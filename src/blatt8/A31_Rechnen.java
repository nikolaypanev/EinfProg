package blatt8;

import iotools.IOTools;

public class A31_Rechnen {

	public static void main(String[] args) {
		
		System.out.println("Zahl 1. eingeben: ");
		int a = IOTools.readInt();
		System.out.println("Zahl 2. eingeben: ");
		int b = IOTools.readInt();
		System.out.printf("Der ggT von %d und %d ist: %d", a, b, ggt(a,b));
		
	}
	
	public static int ggt(int a, int b) {
		if (a == 0) {
			return b;
		} else if (b == a) {
			return a;
		}
		int x = Math.abs(a);
		int y = Math.abs(b);
		
		while ( x != y) {
			if ( x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}
		return x;
	}
	
}
