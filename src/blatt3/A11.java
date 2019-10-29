package blatt3;

import iotools.*;

public class A11 {
	
	public static void main(String[] args) {
		
		System.out.println("Eingabe Zahl: ");
		int number = IOTools.readInt();
		for (int i = 1; i <= 10; i++) {
			int result = i*number;
			System.out.print(result + " ");
		}
		
	}

}
