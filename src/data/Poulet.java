package data;

public class Poulet extends VolailleAVendre {
	private static int prixAuKilo = 10;
	protected static int poidsAbattage = 1;

	public Poulet(int pPoids) {
		super(pPoids);
	}

	
	public static int getPoidsAbattage() {
		return poidsAbattage;
	}

	public static void setPoidsAbattage(int poidsAbattage) {
		Poulet.poidsAbattage = poidsAbattage;
	}

	
	public static int getPrixAuKilo() {
		return prixAuKilo;
	}

	public static void setPrixAuKilo(int prixAuKilo) {
		Poulet.prixAuKilo = prixAuKilo;
	}

}
