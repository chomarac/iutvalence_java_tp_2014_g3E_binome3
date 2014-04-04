package fr.iutvalence.java.bataillenavale;

/**
 * Application qui lance le jeu.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Application {
	public static void main(String[] args) {
		/* Coder la demande du nom des joueurs. */
		BatailleNavale partie = new BatailleNavale("Papa","Maman");
		partie.jouer();
	}
}
