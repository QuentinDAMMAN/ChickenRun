package exec;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import data.Canard;
import data.Poulet;
import data.Volaille;

public class App {
	static Map<Integer, Volaille> volailles = new HashMap<>();

	public static void main(String[] args) {

	}
//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
//	System.out.println(sdf.format(vPaon.getDateAdmi()));

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
