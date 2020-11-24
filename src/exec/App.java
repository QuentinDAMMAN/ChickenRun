package exec;

import tools.Case;
import tools.Input;
import tools.Interface;
import data.*;

public class App {
	public static void main(String[] args) {
			

//		System.out.println("BIENVENUE !");
//		System.out.println("****\n");
//
//		Input.initManualInput(true);
//
//		int input;
//		while (Case.isContinuing()) {
//			Interface.showMenuPrincipale();
//			input = Input.inputInt();
//			Case.processAction(input);
//		}
		
		Logique.ajouterPaon();
		Logique.ajouterPaon();
		Logique.ajouterPaon();
		Logique.ajouterPaon(); //Test creation/limit Paon
		Logique.ajouterCygne();
		Logique.ajouterCygne();
		Logique.ajouterCygne(); //Test creation/limit Cygne
		Logique.ajouterCanard(3);
		Logique.ajouterCanard(4); //Test creation Canard
		Logique.ajouterPoulet(2); //Test creation Poulet
		Logique.ajouterPoulet(3); //Test limit volailles
		
		Logique.afficherPrixTotal();
		
		Logique.ModifierPouletPrixKilo(20);
		Logique.ModifierCanardPrixKilo(40);
		
		Logique.afficherPrixTotal();

		
		Logique.ModifierPouletPoidsAbattage(3);
		Logique.ModifierCanardPoidsAbattage(4);
		
		Logique.afficherPrixTotal();
		
		Logique.ModifierPoidsVolaille(6, 20);
		Logique.ModifierPoidsVolaille(7, 15);
		
		Logique.afficherPrixTotal();

		Logique.afficherNbVolaillesParType();
		
		Logique.vendreCanard(6);
		Logique.vendrePoulet(4);
		Logique.rendreCygne(10);
		Logique.rendrePaon(2);
		
		Logique.afficherNbVolaillesParType();
		
		Logique.afficherPrixTotal(); //????????????????????????????????????????



		
	}
}
