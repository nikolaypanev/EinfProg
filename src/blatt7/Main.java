package blatt7;

import java.util.Arrays;

import iotools.IOTools;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Wieviele Personen willst du sortieren? ");
		int count = IOTools.readInt();
		Person[] array = new Person[count];
		int counter = 1;
	
		//create objects
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d. Person:\n ", counter);
			System.out.println("Vorname: ");
			String vorname = IOTools.readString();
			System.out.println("Nachname: ");
			String nachname = IOTools.readString();
			System.out.println("Alter: ");
			int alter = IOTools.readInt();
			System.out.println("Geschlecht (true=m, false=f): ");
			boolean geschlecht = IOTools.readBoolean();
			/*
			if (geschlecht == true) {
				Person.setGeschlecht("Maennlich");
			} else {
				Person.setGeschlecht("Weiblich");
			}
			*/
			array[i] = new Person(vorname, nachname, alter, geschlecht); //move counter 
			counter++;
		}
		
		PersonenSort.bubbleSort(array);
		
		System.out.println(toString(array));
		
		System.out.println("Mittelwert: " + PersonenStatistik.getMed(array));
		System.out.println("Varianz: " +PersonenStatistik.getVar(array));
		System.out.println("Max Alter: " +PersonenStatistik.getMax(array));
		System.out.println("Min Alter: " + PersonenStatistik.getMin(array));
		

	}
	
	public static String toString(Person[] array) {
		return Arrays.toString(array);
	}
}
