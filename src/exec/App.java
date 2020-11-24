package exec;

import tools.Case;
import tools.Input;
import tools.Interface;

public class App {
	public static void main(String[] args) {

		System.out.println("BIENVENUS !");
		System.out.println("****\n");

		Input.initManualInput(true);

		int input;
		while (Case.isContinuing()) {
			Interface.showMenuPrincipale();
			input = Input.inputInt();
			Case.processAction(input);
		}
	}
}
