package application;

public class Spieler {

	private String name;
	private int id; // Brauchen wir eine ID?
	private double kasse;
	private double gesamtrating;
	private Image image;
	private Inventar inventar;
	private Produkt product;

	// Letzte Runde
	private int verkauf;
	private double gewinn;
	private double umsatz;
	private double kosten;

	Spieler(String name, int id) {
		this.name = name;
		this.id = id;
		this.kasse = 100000;
		this.gesamtrating = 0;
		this.image = new Image();
		this.inventar = new Inventar();
		this.product = new Produkt();

		this.verkauf = 0;
		this.gewinn = 0;
		this.umsatz = 0;
		this.kosten = 0;
	}
	
	public double berechneProzent(double gesamt) {
		return this.gesamtrating/gesamt;
	}
  
	// Methode berechnet das Gesamtrating des Spielers aus den Werten von Image und
	// Produkt mit der Gewichtung 1:3
	public void berechneGesamtrating() {
		double bewertung = 0;

		bewertung = bewertung + image.berechneBewertungImage();
		bewertung = bewertung + product.berechneBewertungProdukt() * 3;

		setGesamtrating(bewertung);
	}

	public void berechneVerkauf() {
		int v = 0;

		// Hier muss mit Nachfrage gerechnet werden

		setVerkauf(v);
	}

	// Methode berechnet die laufenden Kosten
	public void berechneLKosten() {
		double kosten = 0;
		int[] maschinen = this.inventar.getMaschinen();
		int[] personal = this.inventar.getPersonal();

		kosten = maschinen[0] * 1000 + maschinen[1] * 1500 + maschinen[2] * 2000 + personal[0] * 2000
				+ personal[1] * 3000 + personal[2] * 4000;

		setKosten(kosten);
	}

	public void berechneUmsatz() {
		int v = getVerkauf();
		double p = product.getPreis();
		setUmsatz(v * p);
	}

	public void berechneGewinn() {
		double g = getUmsatz() - getKosten();
		double kasse = this.getKasse();
		setKasse(kasse + gewinn);
		setGewinn(g);
	}

	public int getVerkauf() {
		return verkauf;
	}

	public void setVerkauf(int verkauf) {
		this.verkauf = verkauf;
	}

	public double getGewinn() {
		return gewinn;
	}

	public void setGewinn(double gewinn) {
		this.gewinn = gewinn;
	}

	public double getUmsatz() {
		return umsatz;
	}

	public void setUmsatz(double umsatz) {
		this.umsatz = umsatz;
	}

	public double getKosten() {
		return kosten;
	}

	public void setKosten(double kosten) {
		this.kosten = kosten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKasse() {
		return kasse;
	}

	public void setKasse(double kasse) {
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

	public double getGesamtrating() {
		return gesamtrating;
	}

	public void setGesamtrating(double gesamtrating) {
		this.gesamtrating = gesamtrating;
	}

	public Produkt getProduct() {
		return product;
	}

	public void setProduct(Produkt product) {
		this.product = product;
	}

}
