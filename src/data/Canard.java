package data;

public class Canard extends VolailleAVendre {
	protected static int prixAuKilo = 20;
	protected static int poidsAbattage = 1;

		public Canard(int pPoids) {
		super(pPoids);
	}

		
	public static int getPoidsAbattage() {
		return poidsAbattage;
	}

	public static void setPoidsAbattage(int poidsAbattage) {
		Canard.poidsAbattage = poidsAbattage;
	}


	public static int getPrixAuKilo() {
		return prixAuKilo;
	}

	public static void setPrixAuKilo(int prixAuKilo) {
		Canard.prixAuKilo = prixAuKilo;
	}

}
