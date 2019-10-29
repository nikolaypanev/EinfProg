package blatt3;

import iotools.IOTools;

public class A14 {
	
	public static void main(String[] args) {
		
		System.out.println("Eingabe Zahl: ");
		int n = IOTools.readInt();
		int length = String.valueOf(n).length();
		
		for (int i = length; i > 0; i--) {
			int digit = n%10;
			String number = null;
			switch (digit) {
				case 0: number = "null"; break;
				case 1: number = "eins"; break;
				case 2: number = "zwei"; break;
				case 3: number = "drei"; break;
				case 4: number = "vier"; break;
				case 5:	number = "fuenf"; break;
				case 6: number = "sechs"; break;
				case 7: number = "sieben"; break;
				case 8: number = "acht"; break;
				case 9: number = "neun"; break;
				default: System.out.println("Invalid number!");
			}
			n /= 10;
			System.out.println(number);
		}
	}

}
