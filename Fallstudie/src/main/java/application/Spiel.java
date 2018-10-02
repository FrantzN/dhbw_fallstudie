package application;

import java.util.ArrayList;

public class Spiel {

	Spieler spieler1, spieler2, spieler3, spieler4, spieler5, spieler6, spieler7, spieler8;
	private int runde;
	private int letzte;

	Spiel(int runden) {
		this.runde = 1;
		this.letzte = runden;
	}

	// Je nach Auswahl Dropdown Menues werden hier die Spieler Objekte angelegt und
	// in die ArrayList eingefuegt.
	public void erzeugeSpieler(String[] namen, ArrayList<Spieler> spielerList) {
		int anzahl = 5;
		switch (anzahl) {
		case 3:
			spieler1 = new Spieler(namen[0], 1);
			spieler2 = new Spieler(namen[1], 2);
			spieler3 = new Spieler(namen[2], 3);

			spielerList.add(spieler1);
			spielerList.add(spieler2);
			spielerList.add(spieler3);
			break;
		case 4:
			spieler1 = new Spieler(namen[0], 1);
			spieler2 = new Spieler(namen[1], 2);
			spieler3 = new Spieler(namen[2], 3);
			spieler4 = new Spieler(namen[3], 4);

			spielerList.add(spieler1);
			spielerList.add(spieler2);
			spielerList.add(spieler3);
			spielerList.add(spieler4);
			break;
		case 5:
			spieler1 = new Spieler(namen[0], 1);
			spieler2 = new Spieler(namen[1], 2);
			spieler3 = new Spieler(namen[2], 3);
			spieler4 = new Spieler(namen[3], 4);
			spieler5 = new Spieler(namen[4], 5);

			spielerList.add(spieler1);
			spielerList.add(spieler2);
			spielerList.add(spieler3);
			spielerList.add(spieler4);
			spielerList.add(spieler5);
			break;
		case 6:
			spieler1 = new Spieler(namen[0], 1);
			spieler2 = new Spieler(namen[1], 2);
			spieler3 = new Spieler(namen[2], 3);
			spieler4 = new Spieler(namen[3], 4);
			spieler5 = new Spieler(namen[4], 5);
			spieler6 = new Spieler(namen[5], 6);

			spielerList.add(spieler1);
			spielerList.add(spieler2);
			spielerList.add(spieler3);
			spielerList.add(spieler4);
			spielerList.add(spieler5);
			spielerList.add(spieler6);
			break;
		case 7:
			spieler1 = new Spieler(namen[0], 1);
			spieler2 = new Spieler(namen[1], 2);
			spieler3 = new Spieler(namen[2], 3);
			spieler4 = new Spieler(namen[3], 4);
			spieler5 = new Spieler(namen[4], 5);
			spieler6 = new Spieler(namen[5], 6);
			spieler7 = new Spieler(namen[6], 7);

			spielerList.add(spieler1);
			spielerList.add(spieler2);
			spielerList.add(spieler3);
			spielerList.add(spieler4);
			spielerList.add(spieler5);
			spielerList.add(spieler6);
			spielerList.add(spieler7);
			break;
		case 8:
			spieler1 = new Spieler(namen[0], 1);
			spieler2 = new Spieler(namen[1], 2);
			spieler3 = new Spieler(namen[2], 3);
			spieler4 = new Spieler(namen[3], 4);
			spieler5 = new Spieler(namen[4], 5);
			spieler6 = new Spieler(namen[5], 6);
			spieler7 = new Spieler(namen[6], 7);
			spieler8 = new Spieler(namen[7], 8);

			spielerList.add(spieler1);
			spielerList.add(spieler2);
			spielerList.add(spieler3);
			spielerList.add(spieler4);
			spielerList.add(spieler5);
			spielerList.add(spieler6);
			spielerList.add(spieler7);
			spielerList.add(spieler8);
			break;
		}
	}

	public int bestimmeNachfrage() {
		int nachfrage = 100000;
		double faktor = 0;

		do {
			faktor = Math.random() * 2 + 1;
		} while (faktor < 0.8 || faktor > 1.2);
		nachfrage = (int) Math.round(nachfrage * faktor);

		return nachfrage;
	}

	public void beendeRunde(ArrayList<Spieler> spielerList) {
		this.runde++;
		double gesamt = 0;

		for (int i = 0; i < spielerList.size(); i++) {
			spielerList.get(i).berechneGesamtrating();
			gesamt += spielerList.get(i).getGesamtrating();
		}

		// Bestimmen der gesamten Nachfrage und Aufteilen der Nachfrage auf die Spieler
		for (int i = 0; i < spielerList.size(); i++) {
			spielerList.get(i).berechneProduktivitaet();
			double prozent = spielerList.get(i).berechneProzent(gesamt);			
			int prod = spielerList.get(i).getProduktivitaet();
			int nachfrage = bestimmeNachfrage();

			int anteil = (int) prozent * nachfrage;
			if (anteil > prod) {
				spielerList.get(i).setVerkauf(prod);
			}
			else {
				spielerList.get(i).setVerkauf(anteil);
			}
			
			spielerList.get(i).berechneUmsatz();
			spielerList.get(i).berechneLKosten();
			spielerList.get(i).berechneGewinn();
			
		}

	}

	public void startRunde(Spieler spieler) {

	}
}
