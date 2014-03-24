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
    /** TODO. */
	private final Grille maGrille;
    /** TODO. */
    private final Grille saGrille;

    /** TODO. */
    public Joueur(String nom) {
        nomJoueur = nom;
        maGrille = new Grille();
        saGrille = new Grille();
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    /** TODO. */
    public void ajouterBateau(Bateaux bateau) throws PlacementImpossible {
        maGrille.tenterPlacerBateau(bateau);
	}
}
