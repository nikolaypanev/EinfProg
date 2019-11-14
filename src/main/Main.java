package main;

import iotools.IOTools;


@SuppressWarnings("unused")
public class Main {
	 
	public static void main (String[] args) {
		
		
		//n > 2 && n < 10 && n%2=1
				int n = 0;
				System.out.println("Ungerade Zahl zwischen 2 und 10: ");
				n = IOTools.readInt();
				if (n > 2 && n < 10 && n%2==1) {
					int[][] feld = new int [n][n];
				} else {
					System.out.println("falsche Zahl");
				}
				
				int zeile = n/2;
				int spalte = (n/2) + 1;
				
				for (int i = 0; i <= n*n; i++) {
					
				}
		
		/*
		//korrekte Version von A22
		System.out.println("Höhe eingeben: ");
		int hoehe = IOTools.readInt();
		int i,j,k;
		
		for (i = 0; i <= hoehe; i ++) {
			for (j = 0; j < hoehe - i; j++) {
				System.out.print(" ");			
			}
			
			for (k = 0; k < (2*i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//---Aufgabe 22---
		
		//stackoverflow
		/*
		for (int i = 1; i < hoehe; i += 2) {
			for (int k = 0; k < (4 - i/2); k++) {
				System.out.print(" ");
			}
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			System.out.println("");
		}
		
		
		//Aufgabe 22
		System.out.println("Höhe eingeben: ");
		int hoehe = IOTools.readInt();
		for (int i = 1; i < hoehe; i += 2) {
			for (int k = 0; k < (4- i/2); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		//---Aufgabe 22---
		
		/*
		//Aufgabe 21	
		System.out.println("Wieviele Zahlen willst Du sortieren? ");
		int count = IOTools.readInt();
		int[] zahl = new int[count];
		for (int i = 1; i <= zahl.length; i++) {
			System.out.printf("%d Zahl: ", i);
			int input = IOTools.readInt();		
		}
		
		
		public static void bubbleSort(int[] array) {
			for (int j = 0; j < count - 1; j++) {	
				if (zahl[j] > zahl[j + 1]) {		
					int temp = zahl[j];
					zahl[j] = zahl[j + 1];
					zahl[j + 1] = temp;
					//j++;
					System.out.println(zahl[j] + " ");
				}
			}
		}
		
		
		/*
		for (int j = 0; j < count - 1; j++) {
			int temp = zahl[j];
			if (zahl[j] > zahl[j + 1]) {			
				zahl[j] = zahl[j + 1];
				zahl[j + 1] = temp;
				j++;
				System.out.println(zahl[j]);
			}
		}
		
		/*
		for (int k = 0; k < count; k++) {
			System.out.println(zahl[k]);
		}
		
		//---Aufgabe 21---
		
		//Aufgabe12
		/*
		System.out.println("Eingabe Betrag: ");
		double betrag = IOTools.readDouble();
		System.out.println("Eingabe Zinssatz: ");
		double zinssatz = IOTools.readDouble();
		System.out.println("Eingabe Laufzeit: ");
		int laufzeit = IOTools.readInt();
		double wert;
		System.out.println("Anzulegender Betrag in Euro: " + betrag);
		System.out.println("Jahreszins (0.1 für 10 Prozent): " + zinssatz);
		System.out.println("Laufzeit in Jahren: " + laufzeit);
		for (int i = 1; i <= laufzeit; i++) {
			betrag *= 1 + zinssatz;
			System.out.println("Wert nach "+ laufzeit + "Jahren: " + betrag);
		}
		
		/*
		//Aufgabe13
		//System.out.println("Eingabe Anzahl *: ");
		//int anzahl = IOTools.readInt();
		System.out.println("Eingabe Zeilen: ");
		int zeilen = IOTools.readInt();
		for (int i = 1; i <= zeilen; i++) {
			for (int k = 0; k < i; k++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		//---Aufgabe 15---
		int geheimzahl = (int) (99 * Math.random() + 1);
		int zahl;
		System.out.println("Willkommen beim Zahlenraten");
		System.out.println("Ich denke mir eine Zahl zwischen 0 und 100. Rate diese Zahl!\r\n" + "");
		int counter = 1;
		do	{
			zahl = IOTools.readInt();
			if (zahl < geheimzahl) {
				System.out.printf("%d. Versuch: %d. Meine Zahl ist größer!\n", counter, zahl);
			} else if (zahl > geheimzahl) {
				System.out.printf("%d. Versuch: %d. Meine Zahl ist kleiner!\n", counter, zahl);
			} else {
				System.out.printf("%d. Versuch: %d. Du hast die Zahl beim %d. Versuch erraten\n", counter, zahl, counter);
			}
			counter++;
		} while (geheimzahl != zahl);
		//---Aufgabe 15---
		
		/*
		//---Aufgabe 11---
		System.out.println("Eingabe: ");
		int number = IOTools.readInt();
		for (int i = 1; i <= 10; i++) {
			int result = i*number;
			System.out.println(result);
		}
		//---Aufgabe 11---
		
		
		//---Aufgabe 14---
		/*
		System.out.println("Eingabe: ");
		int n = IOTools.readInt();
		int length = String.valueOf(n).length();
		for (int i = length; i > 0; i--) {
			int digit = n % 10;
			String number = null;
			switch (digit) {
				case 0: number = "null"; break;
				case 1: number = "eins"; break;
				case 2: number = "zwei"; break;
				case 3: number = "drei"; break;
				case 4: number = "vier"; break;
				case 5: number = "fuenf"; break;
				case 6: number = "sechs"; break;
				case 7: number = "sieben"; break;
				case 8: number = "acht"; break;
				case 9: number = "neun"; break;
				default: System.out.println("Invalid number!");
			}
		 	n /= 10; hier werden die restliche Ziffern ermittelt
			System.out.println(number);
		}
		
		/*
		System.out.println("Test number length via string: ");
		int i = IOTools.readInt();
		int length = String.valueOf(i).length();
		System.out.println(length);
				
		/*
		System.out.println("Tag: ");
		int t = IOTools.readInt();
		System.out.println("Monat");
		int m = IOTools.readInt();
		System.out.println("Jahr");
		int j = IOTools.readInt();
		
		Aufgabe10.berechneWochentag(t,m,j);
		*/
		
		//---Aufgabe 9---
		/* 
		int n = IOTools.readInt();
		int i = 3;
		
		for (;i < 2*n ;i++) {
			System.out.println(3.14/(2*i - 1));

		}
		
		
		/*
		do {
			if (i < 2*n) {
				i++;
			System.out.println(3.14/(2*i - 1));
			}	
		} while (i < 2*n);
		
		/*
		while (i < 2*n) {
				i++;
				System.out.println(3.14/(2*i - 1));
		}
		*/
		//---Aufgabe 9---
		
		
		/* Value test for double max
		double x = 1180591620717411300000.0;
		double y = Double.MAX_VALUE;
		
		if (x > y) {
			System.out.println("larger than double max");
		} else {
			System.out.println("smaller than double max");
		}
		
		/*
		double x = 192119201;
		double y = 35675640;
		
		/*Aufgabe 6.3 Ergebnis: -1.1805916207174113E21
		double result = ((x*y*y)*(1682*y*y + 29))/107751 + (((x*x*x)*(3 - (2*x*x)))/107751) + (832/107751);
		System.out.println(result);
		
		/* Aufgabe 6.2 Ergebnis: 7.180560037061026E20
		double result = ((1682*x*y*y*y*y) + (3*x*x*x) + (29*x*y*y) - (2*x*x*x*x*x) + 832)/107751;
		System.out.println(result);
		
		/* Aufgabe 6.1, Ergebnis: 2.000000000002E40
		double x1 = Math.pow(10, 20);
		double x2 = 1223;
		double x3 = Math.pow(10, 18);
		double x4 = Math.pow(10, 15);
		double x5 = 3;
		double x6 = Math.pow(-10, 12);
		double y1 = Math.pow(10, 20);
		double y2 = 2;
		double y3 = Math.pow(-10, 22);
		double y4 = Math.pow(10, 13);
		double y5 = 2111;
		double y6 = Math.pow(10, 16);
		
		double result = (x1*y1) + (x2*y2) + (x3*y3) + (x4*y4) + (x5*y5) + (x6*y6);
		System.out.println(result);
		
		/* Test Aufgabe 5
		System.out.println("Eingabe u: ");
		int u = IOTools.readInt();
		System.out.println("Eingabe h: ");
		int h = IOTools.readInt();
		Raviolita.blechstueckDiagonal(u,h);
		Raviolita.durchmesserBoden(u, h);
		Raviolita.dosenbodenFlaeche(u, h);
		Raviolita.doseMantelflaeche(u, h);
		Raviolita.doseGesamtflaeche(u, h);
		Raviolita.doseVolumen(u, h);
		
		
		
		/* Aufgabe 4
		System.out.println("Eingabe Sekunden: ");
		int sec = IOTools.readInt();     //158036521;
		int years = sec/31536000; //-> Jahren. 31536000 Sekunden entsprechen ein Jahr
		int rest = sec%31536000; // -> restliche Sekunden
		int days = rest/86400; // Tagen. 86400 Sekunden entsprechen ein Tag
		rest %= 86400; // restliche Sekunden
		int hours = rest/3600; // Stunden
		rest %= 3600;
		int minutes = rest/60;
		rest %= 60;
		System.out.printf("%d Sekunden entsprechen: \n%d Jahren, \n%d Tagen, \n%d Stunden, \n%d Minuten und \n%d Sekunden", sec, years, days, hours, minutes, rest);
		 
		/* Aufgabe 3 (mit IOTools)
		System.out.println("Vorname :");
		String vorname = IOTools.readLine();
		System.out.println("Nachname: ");
		String nachname = IOTools.readLine();
		System.out.println("Alter: ");
		int alter = IOTools.readInt();
		int alterInJahren = alter*365;
		System.out.println("Hallo " + vorname + " " + nachname + ". Du bist " + alterInJahren + " Tage alt.");
		
		/* Aufgabe 3 (mit Scanner)
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vorname: ");
		String vorname = input.nextLine();
		System.out.println("Nachname: ");
		String nachname = input.nextLine();
		System.out.println("Alter: ");
		int alter = input.nextInt();
		int alterInJahren = alter*365;
		System.out.println("Hallo " + vorname + " " + nachname + ". Du bist " + alterInJahren + " Tage alt.");
		
		input.close();
		*/
	}
	

}
