package blatt9;

public class CD {
		
		private String titel;
		private double spieldauer;
		private boolean ausleihstatus;
		
		public CD (String titel, double spieldauer, boolean ausleihstatus) {
			this.setTitel(titel);
			this.setSpieldauer(spieldauer);
			this.setAusleihstatus(ausleihstatus);
		}
		
		public String toString() {
			return getTitel() + " " + getSpieldauer() + " Minuten";
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
