package tools;

public final class Interface {
	private Interface() {
		throw new IllegalStateException("Utility class");
	}

	public static void showMenuPrincipale() {
		
		System.out.println("saisir un numero d'action : ");
		System.out.println("-1 pour ajouter");
		System.out.println("-2 pour modifier");
		System.out.println("-3 pour afficher");
		System.out.println("-4 pour vendre");
		System.out.println("-5 pour rendre");
	}

	public static void showSousMenuAjouter() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 ajouter une volaille marchande");
		System.out.println("-2 ajouter une volaille");
		
	}
	
	public static void showSousMenuAjouterVolailleMarchande() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 ajouter un poulet");
		System.out.println("-2 ajouter un canard");
	}
	
	public static void showSousMenuAjouterVolaille() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 ajouter un paon");
		System.out.println("-2 ajouter un cygne");
	}

	public static void showSousMenuModifier() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 modifier poids abattage");
		System.out.println("-2 modifier prix du jour");
		System.out.println("-3 modifier poids d'une volaille");
	}
	
	public static void showSousMenuAfficher() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 voir le nombre de volailles par type");
		System.out.println("-2 voir le total de prix des volailles abattables");
		System.out.println("-3 voir toutes les volailles");
	}
	
	public static void showSousMenuAfficherVolaille() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 voir le nombre de poulet");
		System.out.println("-2 voir le nombre de canard");
		System.out.println("-3 voir le nombre de paon");
	}
	
	public static void showSousMenuVendre() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 vendre un canard");
		System.out.println("-2 vendre un poulet");
	}
	
	public static void showSousMenuRendre() {
		System.out.println("saisir un numero de sous action : ");
		System.out.println("-1 rendre un paon");
		System.out.println("-2 vendre un signe");
	}
	
	
	
	
	
	

}
