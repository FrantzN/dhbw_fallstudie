package application;

public class Inventar{

	/*
	 * Das Inventar besteht aus Maschinen, Personal und Rohstoffen, die aus je 3
	 * verschiedenen Qualitaetstypen bestehen. Daher wird ein Array zur Speicherung
	 * der Daten benutzt, welches die Laenge 3 hat. Position 0 steht so fuer Typ 1,
	 * Position 1 steht fuer Typ 2 und Position 2 steht fuer Typ 3.
	 */
	private int[] maschinen;
	private int[] personal;

	Inventar() {
		this.maschinen = new int[3];
		this.personal = new int[3];
	}

	private void kaufMaschine1(int anzahl) {
		int maschine1 = getMaschinen()[0];
		this.maschinen[0] = maschine1 + anzahl;
	}

	private void kaufMachine2(int anzahl) {
		int maschine2 = getMaschinen()[1];
		this.maschinen[1] = maschine2 + anzahl;
	}

	private void kaufMachine3(int anzahl) {
		int maschine3 = getMaschinen()[2];
		this.maschinen[2] = maschine3 + anzahl;
	}

	private void einstellenPersonal1(int anzahl) {
		int personal1 = getPersonal()[0];
		this.personal[0] = personal1 + anzahl;
	}

	private void einstellenPersonal2(int anzahl) {
		int personal2 = getPersonal()[1];
		this.personal[1] = personal2 + anzahl;
	}

	private void einstellenPersonal3(int anzahl) {
		int personal3 = getPersonal()[2];
		this.personal[2] = personal3 + anzahl;
	}

	public int[] getMaschinen() {
		return maschinen;
	}

	public void setMaschinen(int[] maschinen) {
		this.maschinen = maschinen;
	}

	public int[] getPersonal() {
		return personal;
	}

	public void setPersonal(int[] personal) {
		this.personal = personal;
	}

}
