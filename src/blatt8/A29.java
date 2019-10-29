package blatt8;

import iotools.IOTools;

public class A29 {

	public static void main(String[] args) {


	}
	
	public void readWerte(double[] array) {
		for (int i = 0; i < array.length; i++) {
			int pos = 0;	
			array[pos] = IOTools.readDouble();			
		}
	}
	
	public double mittelwert(double[] array) {
		double mittelwert = 0;
		
		return mittelwert;
	}
	
	public double varianz(double[] array) {
		double varianz = 0;
		
		return varianz;
	}
	
	public void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Element on position %d: %d", i, array[i]);
		}
	}
	
	
}
