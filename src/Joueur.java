/* TODO Package. */

/**
 * Un joueur et ses grilles.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Joueur {
	/** Nom du joueur. */
	private final String nomJoueur ;
    /** Grille de la flotte du joueur et les endroits où il  été touché. */
	private final Grille maGrille;
    /** Grille représentant les endroits touchés chez l'adversaire. */
    private final Grille saGrille;

    /** Création d'un nouveau joueur et de ses grilles. */
    public Joueur(String nom) {
        nomJoueur = nom;
        maGrille = new Grille();
        saGrille = new Grille();
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    /** On ajoute un bateau et on soulève une exception si ca ne marche pas. */
    public void ajouterBateau(Bateaux bateau) throws PlacementImpossible {
        Bateaux.tenterPlacerBateau(bateau);
	}
}
