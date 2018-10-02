package application;

public class Spieler {

	private String name;
	private int id; // Brauchen wir eine ID?
	private int kasse;
	private int gesamtrating;
	private Image image;
	private Inventar inventar;
	private Produkt product;
	private int produktivitaet;

	// Letzte Runde
	private int verkauf;
	private int gewinn;
	private int umsatz;
	private int kosten;

	Spieler(String name, int id) {
		this.name = name;
		this.id = id;
		this.kasse = 100000;
		this.gesamtrating = 0;
		this.image = new Image();
		this.inventar = new Inventar();
		this.product = new Produkt();
		this.produktivitaet = 0;

		this.verkauf = 0;
		this.gewinn = 0;
		this.umsatz = 0;
		this.kosten = 0;
	}

	public void berechneProduktivitaet() {
		int[] maschAnzahl = inventar.getMaschinen();
		int p = maschAnzahl[0] * 10 + maschAnzahl[1] * 20 + maschAnzahl[2] * 30;
		
		setProduktivitaet(p);
	}
	
	public double berechneProzent(double gesamt) {
		return this.gesamtrating / gesamt;
	}

	// Methode berechnet das Gesamtrating des Spielers aus den Werten von Image und
	// Produkt mit der Gewichtung 1:3
	public void berechneGesamtrating() {
		int bewertung = 0;

		bewertung = bewertung + image.berechneBewertungImage();
		bewertung = bewertung + product.berechneBewertungProdukt() * 3;

		setGesamtrating(bewertung);
	}



	// Methode berechnet die laufenden Kosten
	public void berechneLKosten() {
		int kosten = 0;
		int[] maschinen = this.inventar.getMaschinen();
		int[] personal = this.inventar.getPersonal();

		kosten = maschinen[0] * 1000 + maschinen[1] * 1500 + maschinen[2] * 2000 + personal[0] * 2000
				+ personal[1] * 3000 + personal[2] * 4000;

		setKosten(kosten);
	}

	public void berechneUmsatz() {
		int v = getVerkauf();
		int p = product.getPreis();
		setUmsatz(v * p);
	}

	public void berechneGewinn() {
		int g = getUmsatz() - getKosten();
		int kasse = this.getKasse();
		setKasse(kasse + gewinn);
		setGewinn(g);
	}
	
	public int getProduktivitaet() {
		return produktivitaet;
	}
	
	public void setProduktivitaet(int produktivitaet) {
		this.produktivitaet = produktivitaet;
	}

	public int getVerkauf() {
		return verkauf;
	}

	public void setVerkauf(int verkauf) {
		this.verkauf = verkauf;
	}

	public int getGewinn() {
		return gewinn;
	}

	public void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}

	public int getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(int umsatz) {
		this.umsatz = umsatz;
	}

	public int getKosten() {
		return kosten;
	}

	public void setKosten(int kosten) {
		this.kosten = kosten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKasse() {
		return kasse;
	}

	public void setKasse(int kasse) {
		this.kasse = kasse;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Inventar getInventar() {
		return inventar;
	}

	public void setInventar(Inventar inventar) {
		this.inventar = inventar;
	}

	public int getGesamtrating() {
		return gesamtrating;
	}

	public void setGesamtrating(int gesamtrating) {
		this.gesamtrating = gesamtrating;
	}

	public Produkt getProduct() {
		return product;
	}

	public void setProduct(Produkt product) {
		this.product = product;
	}

}
