package com.humanbooster.awale.App;

import com.humanbooster.awale.business.Player;

/**
 * . Classe contenant les différents messages à afficher
 * 
 * @author Jocelyn
 *
 */
public class Display {
	/**
	 * . métode affichant le plateau de jeu en fonction du joueur actif (en bas)
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
	 * . méthode affichant le header et les crédits
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
	 * . méthode affichant les règles du jeu
	 */
	public void printRules() {
		System.out.println(
				"l'Awale est un jeu africain datant de XXXX,"
		+ " chaque joueur possède 6 cases contenant 4 graines");
		System.out.println("Quand un joueur choisit une de ses cases,"
		+ " il doit vider le contenu de celle-ci dans"
				+ " les cases suivantes");
		System.out.println("en mettant à chaque fois une graine dans une"
				+ " case dans le sens inverse des aiguilles d'une montre");
		System.out.println("Si la dernière graine placée devient la 4e"
				+ " d'une case, vous videz cette case et marquez un point");
		System.out.println("Le premier joueur à remporter"
				+ " 6 points gagne la partie.");

	}

	/**
	 * . méthode affichant le texte invitant le joueur actif à jouer
	 * 
	 * @param pl
	 *            joueur actif
	 */
	public void playTurn(final Player pl) {
		System.out.println("C'est à " + pl.getName() + " de jouer (1>=<6)");
	}

	/**
	 * . méthode indiquant au joueur actif qu'il a marqué un point
	 * 
	 * @param pl
	 *            joueur actif
	 */
	public void scoreUp(final Player pl) {
		System.out.println("\n" + pl.getName() + " marque 1 point !\n");
	}

	/**
	 * . méthode indiquant au joueur qu'il a remporté la partie
	 * 
	 * @param pl
	 *            joueur actif
	 */
	public void printWin(final Player pl) {
		System.out.println("Bravo " + pl.getName() + " tu as gagné une banane !");
	}
}
