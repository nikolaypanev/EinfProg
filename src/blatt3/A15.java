package blatt3;

import iotools.IOTools;

public class A15 {
	
	public static void main(String[] args) {
		
		int geheimzahl = (int)(99 * Math.random() + 1);
		int zahl;
		
		System.out.println("Willkommen bei Zahlenraten!");
		System.out.println("Ich denke mir eine Zahl zwischen 0 und 100. Rate diese Zahl\r\n ");
		int counter = 1;
		
		do {
			zahl = IOTools.readInt();
			if ( zahl < geheimzahl) {
				System.out.printf("%d. Versuch: %d. \nMeine Zahl ist größer! ", counter, zahl);
			} else if ( zahl > geheimzahl) {
				System.out.printf("%d. Versuch: %d. \nMeine Zahl ist kleiner! ", counter, zahl);
			} else {
				System.out.printf("%d. Versuch: %d. \nDu hast die Zahl beim %d Versuch erraten!", counter, zahl, counter);
			}
			counter++;
		} while (zahl != geheimzahl);
		
	}

}
