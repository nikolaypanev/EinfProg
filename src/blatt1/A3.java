package blatt1;

import iotools.*;

public class A3 {
	
	public static void main(String[] args) {
		
		System.out.println("Name: ");
		String vorname = IOTools.readLine();
		System.out.println("Nachname: ");
		String nachname = IOTools.readLine();
		System.out.println("Alter in Jahren: ");
		int alter = IOTools.readInt();
		alter *= 365;
		
		System.out.printf("Hallo %s %s. Du bist %d Tagen alt", vorname, nachname, alter);
		
	}

}
