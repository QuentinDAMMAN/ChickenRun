package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class Input {

	private static boolean isInputFromCmd;
	private static Scanner sc;

	private Input() {
		throw new IllegalStateException("Utility class");
	}

	public static void initManualInput(boolean pIsInputFromCmd) {
		Case.setContinuing(true);
		isInputFromCmd = pIsInputFromCmd;
		if (isInputFromCmd) {
			sc = new Scanner(System.in);
		} else {
			try {
				sc = new Scanner(new File("fichier-scenario.txt"));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}


	public static int inputInt() {
		System.out.print("\t>");
		int vInput = sc.nextInt();

		// Display input in test Mode
		if (!Input.isInputFromCmd) {
			System.out.println(vInput);
		}

		sc.nextLine();
		return vInput;
	}


}
