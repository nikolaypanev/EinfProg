package blatt5;

import java.util.Arrays;

import iotools.IOTools;


public class A21 {

	public static void main(String[] args) {

		System.out.print("Wieviele Zahlen willst du sortieren? ");
		int count = IOTools.readInt();
		int[] zahl = new int[count];


		for (int k = 0; k < count; k++) {
			zahl[k] = IOTools.readInt();
			System.out.printf("%d. Zahl: %d\n", k+1, zahl[k]);
		}
		
		for (int i = 0; i < count - 1; i++) {
			for (int j = 0; j < count - 1 - i; j++) {
				if (zahl[j] > zahl[j + 1]) {
					int temp = zahl[j];
					zahl[j] = zahl[j + 1];
					zahl[j + 1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(zahl) + " ");
	}
}
