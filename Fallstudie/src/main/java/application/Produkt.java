package application;



public class Produkt{

	private int marketing;
	private int preis;
	private int qualitaet;
	private int fortschritt;
	private int rohstoffwert;
	
	Produkt(){
		this.marketing = 0;
		this.preis = 0;
		this.qualitaet = 0;
		this.fortschritt = 0;
		this.rohstoffwert = 1;
	}
	
	//Methode berechnet das Rating fuer das Produkt
	
	public int berechneBewertungProdukt() {
		int bewertung = 0;
		berechneQualitaet();
		
		bewertung = bewertung + getMarketing()*3;
		bewertung = bewertung + getQualitaet()*3;
		bewertung = bewertung + getPreis()*4;
		
		
		return bewertung;
	}
	
	//Diese Methode addiert die neuen Marketing-Punktzahlen nach dem Kauf, implementiert ist eine Saettigung bei 100
	
	public void addMarketing(int punktzahl) {
		
		if (getMarketing() + punktzahl > 100) {
			setMarketing(100);
		}else {
			setMarketing(getMarketing() + punktzahl);
		}
	}
	
	//Methode addiert Punkte fuer Fortschritt nach Kauf, implementiert ist eine Saettigung
	
	public void addFortschritt(int punktzahl) {
		
		if (getFortschritt() + punktzahl > 100) {
			setFortschritt(100);
		}else {
			setFortschritt(getFortschritt() + punktzahl);
		}
		
		berechneQualitaet();
	}
	
	//Methode berechnet Qualitaet fuer das Produkt inkl. dem technischen Fortschritt
	
	public void berechneQualitaet() {
		int bewertung = 0;
		
		if (rohstoffwert == 1) {
			bewertung = 10;
		}else if(rohstoffwert == 2) {
			bewertung = 30;
		}else {
			bewertung = 66;
		}
		
		bewertung = bewertung + getFortschritt()/3;
		setQualitaet(bewertung);
		
	}
	
	
	public int getRohstoffwert() {
		return rohstoffwert;
	}

	public void setRohstoffwert(int rohstoffwert) {
		this.rohstoffwert = rohstoffwert;
	}

	public int getFortschritt() {
		return fortschritt;
	}

	public void setFortschritt(int fortschritt) {
		this.fortschritt = fortschritt;
	}


	public int getMarketing() {
		return marketing;
	}

	public void setMarketing(int marketing) {
		this.marketing = marketing;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public int getQualitaet() {
		return qualitaet;
	}

	public void setQualitaet(int qualitaet) {
		this.qualitaet = qualitaet;
	}
	
	
}
