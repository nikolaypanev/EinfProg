package blatt1;

import iotools.*;

public class A4 {

	public static void main(String[] args) {
		
		/*
		 * Tested with 158036521 seconds.
		 * TODO: testing with other values
		*/
		
		System.out.println("Enter seconds: ");
		int sec = IOTools.readInt();
		
		int years = sec/31536000; //years
		int rest = sec%31536000; //rest
		int days = rest/86400; // days
		rest %= 86400;
		int hours = rest/3600;
		rest %= 3600;
		int minutes = rest/60;
		rest %= 60;
		System.out.printf("%d Sekunden entsprechen: \n%d Jahren, \n%d Tagen, \n%d Stunden, \n%d Minuten und \n%d Sekunden", sec, years, days, hours, minutes, rest);

		
	}

}
