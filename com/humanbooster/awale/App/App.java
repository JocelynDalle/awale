package com.humanbooster.awale.App;
import java.util.Scanner;

import com.humanbooster.awale.business.Player;

/**.
 * classe principale contenant le main
 * @author Jocelyn
 *
 */
public final class App {
	/**
	 * . valeur de départ dans les cases
	 */
	private static final int START_PAWN_VALUE = 4;
	/**
	 * . score à atteindre
	 */
	private static final int GOAL_SCORE = 6;

	/**
	 * . main lançant le jeu
	 * 
	 * @param args
	 *            nécéssaire au main mais inutile ici
	 */

	public static void main(final String[] args) {

		int spv = START_PAWN_VALUE;
		int[] tabStart1 = { spv, spv, spv, spv, spv, spv };
		int[] tabStart2 = { spv, spv, spv, spv, spv, spv };
		Scanner sc = new Scanner(System.in);
		Display dsp = new Display();
		Game gm = new Game();

		dsp.printTitle();
		System.out.println("");
		dsp.printRules();
		System.out.println("\n\n");

		System.out.println("Saisir le nom du joueur 1");
		String p1name = sc.nextLine();
		System.out.println("Saisir le nom du joueur 2");

		String p2name = sc.nextLine();
		Player p1 = new Player(p1name, tabStart1, 0, true);
		Player p2 = new Player(p2name, tabStart2, 0, false);
		boolean stay = true;

		while (stay) {

			gm.switchTurn(p1);
			gm.switchTurn(p2);

			if (p1.isTurn()) {

				dsp.printGame(p2, p1);
			} else {
				dsp.printGame(p1, p2);
			}

			if (p1.isTurn()) {

				gm.playTurn(p1, p2);
			} else {
				gm.playTurn(p2, p1);

			}

			if (p1.getScore() == GOAL_SCORE || p2.getScore() == GOAL_SCORE) {
				stay = false;
			}

		}
		if (p1.isTurn()) {

			dsp.printGame(p2, p1);
			dsp.printWin(p1);
		} else {
			dsp.printGame(p1, p2);
			dsp.printWin(p1);
		}

	}

	/**
	 * . constructeur par défaut
	 */
	private App() {
		super();
		// TODO Auto-generated constructor stub
	}

}
