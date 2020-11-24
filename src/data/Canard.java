package data;

public class Canard extends VollailleAVendre {
	protected static int prixAuKilo;
	protected static int poidsAbattage;

	
	public Canard(int pPoids) {
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

}
