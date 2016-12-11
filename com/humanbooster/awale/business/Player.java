package com.humanbooster.awale.business;

import java.util.Arrays;

/**
 * . Classe métier Player
 * 
 * @author Jocelyn
 *
 */
public class Player {
	/**
	 * . nom du joueur
	 */
	private String name;
	/**
	 * . nombre de pion dans les cases
	 */
	private int[] pawnSpot;
	/**
	 * . score du joueur
	 */
	private int score;
	/**
	 * . tour actif / passif
	 */
	private boolean isTurn;
	/**
	 * . nombre de pions max sur 1 Digit (pour l'affichage)
	 */
	private static final int MAX_PAWN_DIGIT = 10;

	/**
	 * . constructeur avec paramètres
	 * 
	 * @param nameCons
	 *            voir javadoc
	 * @param pawnSpotCons
	 *            voir javadoc
	 * @param scoreCons
	 *            voir javadoc
	 * @param isTurnCons
	 *            voir javadoc
	 */
	public Player(final String nameCons, final int[] pawnSpotCons, final int scoreCons, final boolean isTurnCons) {
		super();
		this.name = nameCons;
		this.pawnSpot = pawnSpotCons;
		this.score = scoreCons;
		this.isTurn = isTurnCons;
	}

	/**
	 * . getter isTurn
	 * 
	 * @return isTurn
	 */
	public boolean isTurn() {
		return isTurn;
	}

	/**
	 * . setter iSturn
	 * 
	 * @param isTurnVal
	 *            value à modifier
	 */
	public void setTurn(final boolean isTurnVal) {
		this.isTurn = isTurnVal;
	}

	/**
	 * . getter isTurn
	 * 
	 * @return isTurn
	 */
	public int getScore() {
		return score;
	}

	/**
	 * . setter score
	 * 
	 * @param scoreVal
	 *            value à modifier
	 */
	public void setScore(final int scoreVal) {
		this.score = scoreVal;
	}

	/**
	 * . getter isTurn
	 * 
	 * @return isTurn
	 */
	public String getName() {
		return name;
	}

	/**
	 * . setter name
	 * 
	 * @param nameVal
	 *            value à modifier
	 */
	public void setName(final String nameVal) {
		this.name = nameVal;
	}

	/**
	 * . getter isTurn
	 * 
	 * @return isTurn
	 */
	public int[] getPawnSpot() {
		return pawnSpot;
	}

	/**
	 * . setter pawnSpot
	 * 
	 * @param pawnSpotVal
	 *            value à modifier
	 */
	public void setPawnSpot(final int[] pawnSpotVal) {
		this.pawnSpot = pawnSpotVal;
	}

	@Override
	public final String toString() {
		return "Player [name=" + name + ", pawnSpot=" + Arrays.toString(pawnSpot) + ", score=" + score + "]";
	}

	/**
	 * . affichage du jeu pour le joueur actif
	 */
	public void printPlay() {
		System.out.print("||  P L A Y  || ");
		for (int i : pawnSpot) {
			if (i >= MAX_PAWN_DIGIT) {
				System.out.print(i + "| ");
			} else {
				System.out.print(i + " | ");
			}
		}
		System.out.print("    " + score + " pts " + name);
	}

	/**
	 * . affichage du jeu pour le joueur passif
	 */
	public void printPlayReverse() {
		System.out.print("|| A W A L E || ");
		for (int i = pawnSpot.length - 1; i >= 0; i--) {
			if (pawnSpot[i] >= MAX_PAWN_DIGIT) {
				System.out.print(pawnSpot[i] + "| ");
			} else {
				System.out.print(pawnSpot[i] + " | ");
			}
		}
		System.out.print("    " + score + " pts " + name);
	}

}
