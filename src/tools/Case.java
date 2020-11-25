package tools;

import exec.Logique;

public class Case {

	private static boolean isContinuing;

	private Case() {
		throw new IllegalStateException("Utility class");
	}

	public static void processAction(int input) {

		switch (input) {
		case 0:
			exitProgram();
			break;

		case 1:
//		ajouter
			Interface.showSousMenuAjouter();
			input = Input.inputInt();
			switch (input) {
			case 1:
//			ajouter une volaille marchande
				Interface.showSousMenuAjouterVolailleMarchande();
				input = Input.inputInt();
				switch (input) {
				case 1:
//				ajouter un poulet
					System.out.println("Veillez saisir un poids :");
					input = Input.inputInt();
					Logique.ajouterPoulet(input);
					break;
				case 2:
//				ajouter un canard
					System.out.println("Veillez saisir un poids :");
					input = Input.inputInt();
					Logique.ajouterCanard(input);
					break;
				default:
					erreurChiffre();
					break;
				}
				break;
			case 2:
//			ajouter une volaille
				Interface.showSousMenuAjouterVolaille();
				input = Input.inputInt();
				switch (input) {
				case 1:
//				ajouter un paon
					Logique.ajouterPaon();
					break;
				case 2:
//				ajouter un cygne
					Logique.ajouterCygne();
					break;
				default:
					erreurChiffre();
					break;
				}
				break;
			default:
				erreurChiffre();
				break;
			}
			break;

		case 2:
//			modifier
			Interface.showSousMenuModifier();
			input = Input.inputInt();
			switch (input) {
			case 1:
//				modifier LE POIDS D'attage
				Interface.showSousMenuModifierAbttage();
				input = Input.inputInt();
				switch (input) {
				case 1:
//					modifier le poids poulet
					System.out.println("Veillez saisir un poids :");
					input = Input.inputInt();
					Logique.ModifierPouletPoidsAbattage(input);
					break;

				case 2:
//					mofifier poids cnard
//						modifier prix du jour canard
					System.out.println("Veillez saisir un poids :");
					input = Input.inputInt();
					Logique.ModifierCanardPoidsAbattage(input);
					break;

				default:
					erreurChiffre();
					break;
				}
				break;

			case 2:
//			modifier prix du jour poulet
				Interface.showSousMenuModifierPrixDuJour();
				input = Input.inputInt();
				switch (input) {
				case 1:
//				modifier le prix poulet
					System.out.println("Veillez saisir le prix du poulet au kg :");
					input = Input.inputInt();
					Logique.ModifierPouletPrixKilo(input);
					break;

				case 2:
//				mofifier prix cnard
//					modifier prix du jour canard
					System.out.println("Veillez saisir le prix du canard au kg:");
					input = Input.inputInt();
					Logique.ModifierCanardPrixKilo(input);
					break;

				default:
					erreurChiffre();
					break;
				}

			case 3:

//				modifier poids d'une volaille marchande
				System.out.println("Veillez saisir un id :");
				input = Input.inputInt();
				System.out.println("Veillez saisir un poids :");
				int poids = Input.inputInt();
				Logique.ModifierPoidsVolaille(input, poids);

				break;
			default:
				erreurChiffre();
				break;
			}
			break;

		case 3:
//			Afficher
			Interface.showSousMenuAfficher();
			input = Input.inputInt();
			switch (input) {
			case 1:
//			voir le nombre de volailles par type
				Logique.afficherNbVolaillesParType();
				break;
			case 2:
//			voir le total de prix des volailles abattables
				Logique.afficherPrixTotal();
				break;
			case 3:
//			voir toutes les volailles
				Logique.afficherVolailles();
				break;
			default:
				erreurChiffre();
				break;
			}
			break;

		case 4:
//			vendre
			Interface.showSousMenuVendre();
			input = Input.inputInt();
			switch (input) {
			case 1:
//				vendre un poulet
				System.out.println("Veillez saisir un id :");
				input = Input.inputInt();
				Logique.vendrePoulet(input);
				break;
			case 2:
//				vendre un canard
				System.out.println("Veillez saisir un id :");
				input = Input.inputInt();
				Logique.vendreCanard(input);
				break;
			default:
				erreurChiffre();
				break;
			}
			break;

		case 5:
//			rendre
			Interface.showSousMenuRendre();
			input = Input.inputInt();
			switch (input) {
			case 1:
//			rendre un paon
				System.out.println("Veillez saisir un id :");
				input = Input.inputInt();
				Logique.rendrePaon(input);
				break;
			case 2:
//			rendre un signe
				System.out.println("Veillez saisir un id :");
				input = Input.inputInt();
				Logique.rendreCygne(input);
				break;

			default:
				erreurChiffre();
				break;
			}
			break;
		default:
			erreurChiffre();
			break;
		}
	}

	private static void exitProgram() {
		System.out.println("See you soon !");
		setContinuing(false);

	}

	private static void erreurChiffre() {
		System.out.println("numero non reconnu");

	}

	public static boolean isContinuing() {
		return isContinuing;
	}

	public static void setContinuing(boolean isContinuing) {
		Case.isContinuing = isContinuing;
	}

}
