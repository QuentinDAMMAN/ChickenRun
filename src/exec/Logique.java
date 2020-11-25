package exec;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import data.Canard;
import data.Cygne;
import data.Paon;
import data.Poulet;
import data.Volaille;
import data.VolailleAVendre;
import data.VolailleAccueillie;

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

	public static void ajouterPaon() {
		if (volailles.size() < MAX_VOLLAILLES && counterPaons < MAX_PAONS) {
			Paon vPaon = new Paon();
			volailles.put(vPaon.getId(), vPaon);
			counterPaons++;
			System.out.println("Vous avez ajouté un paon.");
		} else if (volailles.size() >= MAX_VOLLAILLES) {
			System.out.println("Vous ne pouvez pas rajouter de volaille.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter de paon.");
		}
	}

	public static void rendrePaon(int pId) {
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

	public static void ajouterCygne() {
		if (volailles.size() < MAX_VOLLAILLES && counterCygnes < MAX_CYGNES) {
			Cygne vCygne = new Cygne();
			volailles.put(vCygne.getId(), vCygne);
			counterCygnes++;
			System.out.println("Vous avez ajouté un cygne.");
		} else if (volailles.size() >= MAX_VOLLAILLES) {
			System.out.println("Vous ne pouvez pas rajouter de volaille.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter de cygne.");
		}
	}

	public static void rendreCygne(int pId) {
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

	public static void ajouterPoulet(int pPoids) {
		if (volailles.size() < MAX_VOLLAILLES && counterPoulets < MAX_POULETS) {
			Poulet vPoulet = new Poulet(pPoids);
			volailles.put(vPoulet.getId(), vPoulet);
			counterPoulets++;
			System.out.println("Vous avez ajouté un poulet.");
		} else if (volailles.size() >= MAX_VOLLAILLES) {
			System.out.println("Vous ne pouvez pas rajouter de volaille.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter de Poulet.");
		}
	}

	public static void vendrePoulet(int pId) {
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

	public static void ajouterCanard(int pPoids) {
		if (volailles.size() < MAX_VOLLAILLES && counterCanards < MAX_CANARDS) {
			Canard vCanard = new Canard(pPoids);
			volailles.put(vCanard.getId(), vCanard);
			counterCanards++;
			System.out.println("Vous avez ajouté un canard.");
		} else if (volailles.size() >= MAX_VOLLAILLES) {
			System.out.println("Vous ne pouvez pas rajouter de volaille.");
		} else {
			System.out.println("Vous ne pouvez pas rajouter de Canard.");
		}
	}

	public static void vendreCanard(int pId) {
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

	public static void ModifierPouletPrixKilo(int pPrixKilo) {
		Poulet.setPrixAuKilo(pPrixKilo);
		System.out.println("Le prix du poulet au kilo est de " + pPrixKilo + "kg.");
	}

	public static void ModifierCanardPrixKilo(int pPrixKilo) {
		Canard.setPrixAuKilo(pPrixKilo);
		System.out.println("Le prix du canard au kilo est de " + pPrixKilo + "kg.");

	}

	public static void ModifierPouletPoidsAbattage(int pPoidsAbattage) {
		Poulet.setPoidsAbattage(pPoidsAbattage);
		System.out.println("Le poid d'abattage du poulet est de " + pPoidsAbattage + "kg.");

	}

	public static void ModifierCanardPoidsAbattage(int pPoidsAbattage) {
		Canard.setPoidsAbattage(pPoidsAbattage);
		System.out.println("Le poid d'abattage du poulet est de " + pPoidsAbattage + "kg.");

	}

	public static void ModifierPoidsVolaille(int pId, int pPoids) {
		if (!volailles.containsKey(pId)) {
			System.out.println("Cette volaille n'existe pas.");
		} else if (volailles.get(pId) instanceof Poulet) {
			Poulet vPoulet = ((Poulet) volailles.get(pId));
			vPoulet.setPoids(pPoids);
			System.out.println("Le poids du poulet est de " + pPoids + "kg.");
		} else if (volailles.get(pId) instanceof Canard) {
			Canard vCanard = ((Canard) volailles.get(pId));
			vCanard.setPoids(pPoids);
			System.out.println("Le poids du canard est de " + pPoids + "kg.");
		} else {
			System.out.println("Cette volaille n'est ni un poulet, ni un canard.");
		}
	}

	public static void afficherPrixTotal() {
		System.out.println("afffichage salaire du prix total de volailles vendables");

		if (volailles.isEmpty()) {
			System.out.println("il n'y a aucune volaille à  vendre");
		} else {
			double total = 0;
			for (Entry<Integer, Volaille> volaille : volailles.entrySet()) {
				if (volaille.getValue() instanceof Poulet) {
					Poulet vPoulet = ((Poulet) volaille.getValue());
					if (vPoulet.getPoids() >= Poulet.getPoidsAbattage()) {
						total += Poulet.getPrixAuKilo() * vPoulet.getPoids();
					}
				} else if (volaille.getValue() instanceof Canard) {
					Canard vCanard = ((Canard) volaille.getValue());
					if (vCanard.getPoids() >= Canard.getPoidsAbattage()) {
						total += Canard.getPrixAuKilo() * vCanard.getPoids();
					}
				}
			}
			System.out.println("total du prix de vente des volailles : " + total + "€.");
		}
	}

	public static void afficherVolailles() {
		System.out.println("il y a " + volailles.size() + " volailles :");
		for (Volaille volaille : volailles.values()) {
			System.out.println(" - " + volaille.getId() + " " + volaille.getClass().getName());
		}
	}

	public static void afficherNbVolaillesParType() {
		System.out.println("il y a " + volailles.size() + " volailles  au total:");
		System.out.println("\t- " + counterPoulets + " poulet" + (counterPoulets == 1 ? "" : "s"));
		System.out.println("\t- " + counterCanards + " canard" + (counterCanards == 1 ? "" : "s"));
		System.out.println("\t- " + counterPaons + " paon" + (counterPaons == 1 ? "" : "s"));
		System.out.println("\t- " + counterCygnes + " cygne" + (counterCygnes == 1 ? "" : "s"));
	}

	public static void afficherVolaillesParType() {
		if (volailles.isEmpty()) {
			System.out.println("il n'y a aucune volaille à afficher");
			return;
		}
		ArrayList<VolailleAccueillie> volAccueillables = new ArrayList<>();
		ArrayList<VolailleAVendre> volVendables = new ArrayList<>();
		// Remplissage des Treemap
		for (Entry<Integer, Volaille> volaille : volailles.entrySet()) {
			Volaille value = volaille.getValue();
			if (value instanceof VolailleAccueillie) {
				volAccueillables.add((VolailleAccueillie) value);
			} else if (value instanceof VolailleAVendre) {
				volVendables.add((VolailleAVendre) value);
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh-mm-ss");
		System.out.println("Volailles par type :");
		System.out.println("- Accueillables");
		Collections.sort(volAccueillables);
		for (VolailleAccueillie volaille : volAccueillables) {
			VolailleAccueillie value = volaille;
			System.out.println("\t- " + value.getClass().getSimpleName() + " " + sdf.format(value.getDateAdmition()) + ".");
		}
		System.out.println("- Vendables");
		Collections.sort(volVendables);
		for (VolailleAVendre volaille : volVendables) {
			VolailleAVendre value = volaille;
			System.out.println("\t- " + value.getClass().getSimpleName() + " " + value.getPoids() + "kg.");
		}
	}

}