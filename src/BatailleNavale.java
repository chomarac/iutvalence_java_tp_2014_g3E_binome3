/* TODO JavaDoc. */
/* TODO Package. */

/**
 * Le fil conducteur du jeu.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class BatailleNavale {
	private final Joueur joueur1;
	private final Joueur joueur2;
	
	public BatailleNavale(String nomJoueur1, String nomJoueur2) {
		joueur1 = new Joueur(nomJoueur1);
		joueur2 = new Joueur(nomJoueur2);
	}

    public void jouer() {
        /* Demander la place des bateaux du joueur 1. */
        try {
            joueur1.ajouterBateau(new Croiseur(0, 0, SensBateaux.EST));
        }
        catch (PlacementImpossible e) {

        }
        
        /* afficherGrilles(); */
        try {
            joueur2.ajouterBateau(new Torpilleur(2, 2, SensBateaux.SUD));
        }
        catch (PlacementImpossible e) {
            e.printStackTrace();
        }
    }
}
