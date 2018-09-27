
package application;

public class Image{

	private int sozial;
	private int abedingungen;

	Image() {
		this.sozial = 0;
		this.abedingungen = 0;
	}
	
	//Methode berechnet das Rating fuer Image
	
	public int berechneBewertungImage() { 
		int bewertung = 0;
		
		bewertung = bewertung + getSozial()*8;
		bewertung = bewertung + getAbedingungen()*2;
		
		return bewertung;
	
	}
	//Methode um in Soziales zu investieren
	private void sozialInvest(int invest) {
		int s = getSozial();
		if (invest <= 0) {
			System.out.println("Zu kleines Invest"); // Hier zu Screenausgabe aendern
		} else if (invest > 0 && invest <= 10000) {
			setSozial(s + 50);
		} else if (invest > 10000 && invest <= 100000) {
			setSozial(s + 120);
		} else if (invest > 100000) {
			setSozial(s + 250);
		}
		//Saettigung
		if (getSozial() > 800) {
			setSozial(800);
		}
		
	} 
	//Methode um in Arbeitsbedingungen zu investieren
	private void abedingungenInvest(int invest) {
		int a = getAbedingungen();
		if (invest <= 0) {
			System.out.println("Zu kleines Invest"); // Auch Screenausgabe
		} else if (invest > 0 && invest <= 10000) {
			setAbedingungen(a + 20);
		} else if (invest > 10000 && invest <= 100000) {
			setAbedingungen(a + 40);
		} else if (invest > 100000) {
			setAbedingungen(a + 100);
		}
		//Saettigung
		if (getAbedingungen() >200) {
			setAbedingungen(200);
		}
	}

	public int getSozial() {
		return sozial;
	}

	public void setSozial(int sozial) {
		this.sozial = sozial;
	}

	public int getAbedingungen() {
		return abedingungen;
	}

	public void setAbedingungen(int abedingungen) {
		this.abedingungen = abedingungen;
	}
}
