package exec;

import data.*;
import java.util.HashMap;

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
	protected HashMap<Integer, Volaille> volailles = new HashMap<>();

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

	public void rendrePoulet(int pId) {
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

	public void rendreCanard(int pId) {
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
	
	
}
