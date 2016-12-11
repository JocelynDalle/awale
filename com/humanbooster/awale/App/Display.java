package com.humanbooster.awale.App;

import com.humanbooster.awale.business.Player;

/**
 * . Classe contenant les diff�rents messages � afficher
 * 
 * @author Jocelyn
 *
 */
public class Display {
	/**
	 * . m�tode affichant le plateau de jeu en fonction du joueur actif (en bas)
	 * 
	 * @param p1
	 *            joueur 1 ou actif
	 * @param p2
	 *            joueur 2 ou passif
	 */
	public void printGame(final Player p1, final Player p2) {
		System.out.println("\n================<===<"
				+ "===<===<===<===<============");
		p1.printPlayReverse();
		System.out.println("\n======================"
				+ "===========================");
		p2.printPlay();
		System.out.println("\n================>===>"
				+ "===>===>===>===>============");
		System.out.println("=============== 1 = 2 = 3 = 4 = 5 = 6 ===========");

	}

	/**
	 * . m�thode affichant le header et les cr�dits
	 */
	public void printTitle() {
		System.out.println("----------------------------"
				+ "-------------------------------------");
		System.out.println("-------------   AWALE v1.0.1"
				+ " @Jocelyn Dalle      ----------------");
		System.out.println("----------------------------"
				+ "-------------------------------------");

	}

	/**
	 * . m�thode affichant les r�gles du jeu
	 */
	public void printRules() {
		System.out.println(
				"l'Awale est un jeu africain datant de XXXX,"
		+ " chaque joueur poss�de 6 cases contenant 4 graines");
		System.out.println("Quand un joueur choisit une de ses cases,"
		+ " il doit vider le contenu de celle-ci dans"
				+ " les cases suivantes");
		System.out.println("en mettant � chaque fois une graine dans une"
				+ " case dans le sens inverse des aiguilles d'une montre");
		System.out.println("Si la derni�re graine plac�e devient la 4e"
				+ " d'une case, vous videz cette case et marquez un point");
		System.out.println("Le premier joueur � remporter"
				+ " 6 points gagne la partie.");

	}

	/**
	 * . m�thode affichant le texte invitant le joueur actif � jouer
	 * 
	 * @param pl
	 *            joueur actif
	 */
	public void playTurn(final Player pl) {
		System.out.println("C'est � " + pl.getName() + " de jouer (1>=<6)");
	}

	/**
	 * . m�thode indiquant au joueur actif qu'il a marqu� un point
	 * 
	 * @param pl
	 *            joueur actif
	 */
	public void scoreUp(final Player pl) {
		System.out.println("\n" + pl.getName() + " marque 1 point !\n");
	}

	/**
	 * . m�thode indiquant au joueur qu'il a remport� la partie
	 * 
	 * @param pl
	 *            joueur actif
	 */
	public void printWin(final Player pl) {
		System.out.println("Bravo " + pl.getName() + " tu as gagn� une banane !");
	}
}
