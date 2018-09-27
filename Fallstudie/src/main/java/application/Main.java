package application;


import java.net.InetSocketAddress;

public class Main {

	public static void main(String[] args) {
		String host = "localhost";
		int port = 8887;
		
		GameServer s = new GameServer(new InetSocketAddress(host, port));
		s.run();
	}

	/*
	 * Initialisiere, Einstellung werden vorgenommen
	 * 
	 * Runde 1 beginnt, alle Spieler machen ihre Eingaben
	 * 
	 * Alle Werte werden berechnet
	 * 
	 * Runde 2
	 * 
	 * ...
	 * 
	 * Letzte Runde
	 * 
	 * 
	 * Werte werden berechnet Abschluss und Auswertung
	 */

  /*
  
	private static Spiel spiel;
	private static ArrayList<Spieler> spielerList = new ArrayList<Spieler>();
	private static int runden = 0;

	// Array mit Namen. Werden beim Initialisieren des Projekts eingegeben.
	private static String[] spielernamen = { "Spieler1", "Spieler2", "Spieler3", "Spieler4", "Spieler5", "Spieler6",
			"Spieler7", "Spieler8" };

	public static void main(String[] args) {
		launch(args);

		// Spiel + Spieler Objekte werden erzeugt
		spiel = new Spiel(runden);
		spiel.erzeugeSpieler(spielernamen, spielerList);
    
    */

		/*
		 * Berechnungen (ALLES PRO SPIELER) --> Funktion Nachfrage, Funktion Kosten,
		 * Funktion Umsatz/Gewinn/Verkauf
		 */

		/*
		 * Funktion Nachfrage
		 * 
		 * Schluessel wird berechnet/geholt Daraus wird Marktanteil ermittelt Daraus wird
		 * die Verkaufszahlen ermittelt
		 */

		/*
		 * Funktion Kosten
		 * 
		 * Aufteilung: Laufende Kosten & einmalige Kosten
		 * 
		 * Waehrend der Runde werden die Kosten fuer die Invests im Warenkorb addiert.
		 * Hier werden auch die dabei entstehenden zusaetzlichen laufenden Kosten
		 * angezeigt
		 * 
		 * 
		 * Gesamtkosten werden berechnet.
		 */

		/*
		 * Funktion Umsatz
		 * 
		 * Die Verkaufszahlen und die Kosten werden abgerufen. Daraus wird der Gewinn
		 * und der Umsatz berechnet und der Gewinn wird der Kasse zugefuehrt.
		 */
	
}
