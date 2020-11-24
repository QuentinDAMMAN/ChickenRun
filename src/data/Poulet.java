package data;

public class Poulet extends VollailleAVendre {
	protected static int prixAuKilo;
	protected static int poidsAbattage;

	public Poulet(int pPoids) {
		super(pPoids);
	}


	public static void ModifierPrixKilo(int pPrixKilo) {
		prixAuKilo = pPrixKilo;
	}
	
	public static void ModifierPoidsAbattage(int pPoidsAbattage) {
		poidsAbattage = pPoidsAbattage;
	}
	
	public void ModifierPoidsVolaille(int pPoids) {
		this.poids = pPoids;
	}


	public static int getPrixAuKilo() {
		return prixAuKilo;
	}



}
