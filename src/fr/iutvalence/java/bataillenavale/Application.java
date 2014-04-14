package fr.iutvalence.java.bataillenavale;

import java.util.Scanner;

/**
 * Application qui lance le jeu.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Application {
	public static void main(String[] args) {
		
		/**On recupere le nom des joueurs*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le nom du joueur 1 :");
		String nomJoueur1 = sc.nextLine();
		System.out.println("Veuillez saisir le nom du joueur 2 :");
		String nomJoueur2 = sc.nextLine();
		
		/**On cree la partie de bataille navale*/
		BatailleNavale partie = new BatailleNavale(nomJoueur1,nomJoueur2);
		
		/**On lance la partie*/
		partie.jouer();
	}
}
