package com.humanbooster.awale.App;
import java.util.Scanner;

import com.humanbooster.awale.business.Player;

/**
 * . Classe contenant les méthodes de règles du jeu
 * 
 * @author Jocelyn
 *
 */
public class Game {

	/**
	 * . Valeur minimale du tableau de jeu
	 */
	private static final int MIN_SIZE_BOARD = 1;
	/**
	 * . Valeur maximale du tableau de jeu
	 */
	private static final int MAX_SIZE_BOARD = 6;
	/**
	 * . Nombre de pions à avoir pour gagner un point
	 */
	private static final int PAWN_WIN_NUMBER = 4;

	/**
	 * . méthode pour gérer le changement de tour
	 * 
	 * @param pl Player dont le tour change
	 */
	public void switchTurn(final Player pl) {
		if (pl.isTurn()) {
			pl.setTurn(false);
		} else {
			pl.setTurn(true);
		}
	}

	/**
	 * . méthode gérant un jour de jeu
	 * 
	 * @param pActive joueur actif (dont c'est le tour)
	 * @param pPassive joueur passif (dont ce n'est pas le tour)
	 */
	public void playTurn(final Player pActive, final Player pPassive) {
		Scanner sc = new Scanner(System.in);
		Display dsp = new Display();

		int spot = 0;
		while (spot < MIN_SIZE_BOARD || spot > MAX_SIZE_BOARD) {
			dsp.playTurn(pActive);
			spot = sc.nextInt();
		}
		spot--;
		int[] tabPawnAct = pActive.getPawnSpot();
		int[] tabPawnPas = pPassive.getPawnSpot();

		int pawns = tabPawnAct[spot];
		tabPawnAct[spot] = 0;

		for (int i = spot + 1; i < tabPawnAct.length && pawns > 0; i++) {
			tabPawnAct[i]++;
			pawns--;
			if (pawns == 0 && tabPawnAct[i] == PAWN_WIN_NUMBER) {
				tabPawnAct[i] = 0;
				pActive.setScore(pActive.getScore() + 1);
				dsp.scoreUp(pActive);
			}
		}

		for (int i = 0; i < tabPawnPas.length && pawns > 0; i++) {
			tabPawnPas[i]++;
			pawns--;
			if (pawns == 0 && tabPawnPas[i] == PAWN_WIN_NUMBER) {
				tabPawnPas[i] = 0;
				pActive.setScore(pActive.getScore() + 1);
				dsp.scoreUp(pActive);

			}
		}

		for (int i = 0; i < tabPawnAct.length && pawns > 0; i++) {
			tabPawnAct[i]++;
			pawns--;
			if (pawns == 0 && tabPawnAct[i] == PAWN_WIN_NUMBER) {
				tabPawnAct[i] = 0;
				pActive.setScore(pActive.getScore() + 1);
			}
		}

		for (int i = 0; i < tabPawnPas.length && pawns > 0; i++) {
			tabPawnPas[i]++;
			pawns--;
			if (pawns == 0 && tabPawnPas[i] == PAWN_WIN_NUMBER) {
				tabPawnPas[i] = 0;
				pActive.setScore(pActive.getScore() + 1);
			}
		}
	}

}
