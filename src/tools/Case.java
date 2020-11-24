package tools;

import data.*;
import exec.*;

public class Case {

	private static boolean isContinuing;

	private Case() {
		throw new IllegalStateException("Utility class");
	}

	public static void processAction(int input) {
		System.out.println();

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

					break;
				case 2:
//				ajouter un canard

					break;
				default:
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

					break;
				case 2:
//				ajouter un cygne

					break;
				default:
					break;
				}
				break;
			default:
				break;
			}
			break;

		case 2:
//			modifier
			Interface.showSousMenuModifier();
			input = Input.inputInt();
			switch (input) {
			case 1:
//			modifier poids abattage
				break;
			case 2:
//			modifier prix du jour
				break;
			case 3:
//				modifier poids d'une volaille
				break;
			default:
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
				Interface.showSousMenuAfficherVolaille();
				switch (input) {
				case 1:
//					voir le nombre de poulet
					break;
				case 2:
//					voir le nombre de canard
					break;
				case 3:
//					voir le nombre de paon
					break;
				default:
					break;
				}
				break;
			case 2:
//			voir le total de prix des volailles abattables
				break;
			case 3:
//			voir toutes les volailles
				break;
			default:
				break;
			}
			break;

		case 4:
//			vendre
			Interface.showSousMenuVendre();
			input = Input.inputInt();
			switch (input) {
			case 1:
//				vendre un canard
				break;
			case 2:
//				vendre un poulet
				break;
			default:
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
				break;
			case 2:
				break;
//			rendre un signe
			default:
				break;
			}
			break;
		default:
			break;
		}
	}

	private static void exitProgram() {
		System.out.println("See you soon !");
		setContinuing(false);

	}

	public static boolean isContinuing() {
		return isContinuing;
	}

	public static void setContinuing(boolean isContinuing) {
		Case.isContinuing = isContinuing;
	}

}
