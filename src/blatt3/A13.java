package blatt3;

import iotools.IOTools;

public class A13 {
	
	public static void main(String[] args) {
		
		System.out.println("Anzahl der Zeilen: ");
		int zeilen = IOTools.readInt();
		
		for (int i = 1; i <= zeilen; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
