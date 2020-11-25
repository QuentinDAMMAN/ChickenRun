package tools;

public final class Interface {
	private Interface() {
		throw new IllegalStateException("Utility class");
	}

	public static void showMenuPrincipale() {
		System.out.println(
				"saisir un numero d'action :\n-0 pour quitter\n-1 pour ajouter\n-2 pour modifier\n-3 pour afficher\n-4 pour vendre\n-5 pour rendre");
	}

	public static void showSousMenuAjouter() {
		sousMenu();
//		retour();
		System.out.println("-1 ajouter une volaille marchande\n-2 ajouter une volaille");
	}

	public static void showSousMenuAjouterVolailleMarchande() {
		sousMenu();
//		retour();
		System.out.println("-1 ajouter un poulet\n-2 ajouter un canard");
	}

	public static void showSousMenuAjouterVolaille() {
		sousMenu();
//		retour();
		System.out.println("-1 ajouter un paon\n-2 ajouter un cygne");
	}

	public static void showSousMenuModifier() {
		sousMenu();
//		retour();
		System.out.println(
				"-1 modifier poids abattage\n-2 modifier le prix du jour canard\n-3 modifier poids d'une volaille marchande");
	}

	public static void showSousMenuModifierVolailleMarchande() {
		sousMenu();
//		retour();
		System.out.println("-1 modifier le poids d'un poulet\n-2 modifier le poids d'un canard");
	}

	public static void showSousMenuModifierPrixDuJour() {
		sousMenu();
//		retour();
		System.out.println("-1 modifier le prix d'un poulet\n-2 modifier le prix d'un canard");
	}

	public static void showSousMenuAfficher() {
		sousMenu();
//		retour();
		System.out.println(
				"-1 voir le nombre de volailles par type\n-2 voir le total du prix des volailles abattables\n-3 voir toutes les volailles");
	}

	public static void showSousMenuVendre() {
		sousMenu();
//		retour();
		System.out.println("-1 vendre un poulet\n-2 vendre un canard");
	}

	public static void showSousMenuRendre() {
		sousMenu();
//		retour();
		System.out.println("-1 rendre un paon\n-2 vendre un signe");
	}

	private static void sousMenu() {
		System.out.println("saisir un numero de sous action : ");
	}

//	private static void retour() {
//		System.out.println("-0 pour revenir en arrière");
//	}
}
