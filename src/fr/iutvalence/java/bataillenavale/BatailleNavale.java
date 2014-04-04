package fr.iutvalence.java.bataillenavale;

/**
 * Une partie de bataille navale.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class BatailleNavale {
    /** Premier joueur. */
	private final Joueur joueur1;
    /** Second joueur. */
	private final Joueur joueur2;

    /** Créer une nouvelle partie avec les noms de joueurs spécifiés. */
	public BatailleNavale(String nomJoueur1, String nomJoueur2) {
		joueur1 = new Joueur(nomJoueur1);
		joueur2 = new Joueur(nomJoueur2);
	}

    /** Lancement du jeu */
    public void jouer() {
        /* Demander la place des bateaux du joueur 1. */
        try {
            joueur1.ajouterBateau(new Croiseur(0, 0, SensBateaux.SUD));
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Sortie erreur + redemander placement bateau */
        }
        
        joueur1.afficher();
        
	/*try {
            joueur2.ajouterBateau(new Torpilleur(2, 2, SensBateaux.SUD));
        }
        catch (PlacementImpossible e) {
            /* Sortie erreur + redemander placement bateau */
       /* }*/
    }
}
