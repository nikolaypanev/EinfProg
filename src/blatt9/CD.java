package blatt9;

public class CD {
		
		String titel;
		double spieldauer;
		boolean ausleihstatus;
		
		public CD (String titel, double spieldauer, boolean ausleihstatus) {
			this.titel = titel;
			this.spieldauer = spieldauer;
			this.ausleihstatus = ausleihstatus;
		}
		
		public String toString() {
			return titel + " " + spieldauer + " Minuten";
		}


		public String getTitel() {
			return titel;
		}

		public void setTitel(String titel) {
			this.titel = titel;
		}

		public double getSpieldauer() {
			return spieldauer;
		}

		public void setSpieldauer(double spieldauer) {
			this.spieldauer = spieldauer;
		}

		public boolean isAusleihstatus() {
			return ausleihstatus;
		}

		public void setAusleihstatus(boolean ausleihstatus) {
			this.ausleihstatus = ausleihstatus;
		}
		

}
