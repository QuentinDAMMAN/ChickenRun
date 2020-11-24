package exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import data.Canard;
import data.Cygne;
import data.Paon;
import data.Poulet;
import data.Volaille;

public class Logique {
	public final static int MAX_VOLLAILLES = 8;
	public final static int MAX_POULETS = 5;
	public final static int MAX_CANARDS = 4;
	public final static int MAX_PAONS = 3;
	public final static int MAX_CYGNES = 2;
	protected static int counterPoulets;
	protected static int counterCanards;
	protected static int counterPaons;
	protected static int counterCygnes;
	static private Map<Integer, Volaille> volailles = new HashMap<>();

	public void ajouterPaon() {
		if (volailles.size() < MAX_VOLLAILLES && counterPaons < MAX_PAONS) {
			Paon vPaon = new Paon();
			volailles.put(vPaon.getId(), vPaon);
			counterPaons++;
			System.out.println("Vous avez ajouté un paon.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter le paon.");
		}
	}

	public void rendrePaon(int pId) {
		if (!volailles.containsKey(pId)) {
			System.out.println("Il n'y a pas de volaille avec cet identifiant.");
		} else if (!(volailles.get(pId) instanceof Paon)) {
			System.out.println("Cet volaille n'est pas un paon.");
		} else {
			volailles.remove(pId);
			counterPaons--;
			System.out.println("Vous avez rendu un paon.");
		}
	}

	public void ajouterCygne() {
		if (volailles.size() < MAX_VOLLAILLES && counterCygnes < MAX_CYGNES) {
			Cygne vCygne = new Cygne();
			volailles.put(vCygne.getId(), vCygne);
			counterCygnes++;
			System.out.println("Vous avez ajouté un cygne.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter le cygne.");
		}
	}

	public void rendreCygne(int pId) {
		if (!volailles.containsKey(pId)) {
			System.out.println("Il n'y a pas de volaille avec cet identifiant.");
		} else if (!(volailles.get(pId) instanceof Cygne)) {
			System.out.println("Cet volaille n'est pas un cygne.");
		} else {
			volailles.remove(pId);
			counterCygnes--;
			System.out.println("Vous avez rendu un cygne.");
		}
	}

	public void ajouterPoulet(int pPoids) {
		if (volailles.size() < MAX_VOLLAILLES && counterPoulets < MAX_POULETS) {
			Poulet vPoulet = new Poulet(pPoids);
			volailles.put(vPoulet.getId(), vPoulet);
			counterPoulets++;
			System.out.println("Vous avez ajouté un poulet.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter le poulet.");
		}
	}

	public void vendrePoulet(int pId) {
		if (!volailles.containsKey(pId)) {
			System.out.println("Il n'y a pas de volaille avec cet identifiant.");
		} else if (!(volailles.get(pId) instanceof Poulet)) {
			System.out.println("Cet volaille n'est pas un poulet.");
		} else {
			volailles.remove(pId);
			counterPoulets--;
			System.out.println("Vous avez vendu un poulet.");
		}
	}

	public void ajouterCanard(int pPoids) {
		if (volailles.size() < MAX_VOLLAILLES && counterCanards < MAX_CANARDS) {
			Canard vCanard = new Canard(pPoids);
			volailles.put(vCanard.getId(), vCanard);
			counterCanards++;
			System.out.println("Vous avez ajouté un canard.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter le canard.");
		}
	}

	public void vendreCanard(int pId) {
		if (!volailles.containsKey(pId)) {
			System.out.println("Il n'y a pas de volaille avec cet identifiant.");
		} else if (!(volailles.get(pId) instanceof Canard)) {
			System.out.println("Cet volaille n'est pas un canard.");
		} else {
			volailles.remove(pId);
			counterCanards--;
			System.out.println("Vous avez vendu un canard.");
		}
	}

	private static void afficherPrixTotal() {
		System.out.println("afffichage salaire du prix total de volailles vendables");

		if (volailles.isEmpty()) {
			System.out.println("il n'y a aucune volaille à vendre");
		} else {
			double total = 0;
			for (Entry<Integer, Volaille> volaille : volailles.entrySet()) {
				if (volaille instanceof Poulet) {
					total += Poulet.getPrixAuKilo();
				} else if (volaille instanceof Canard) {
					total += Canard.getPrixAuKilo();
				}
			}
			System.out.println("total du prix de vente des volailles : " + total);
		}
	}

	private static void afficherVolailles() {
		System.out.println("il y a " + volailles.size() + " volailles :");
		for (Volaille volaille : volailles.values()) {
			System.out.println(" - " + volaille.getId() + " " + volaille.getClass().getName());
		}
	}

	private static void afficherVolaillesParType() {
		// TODO : TT
	}

}
