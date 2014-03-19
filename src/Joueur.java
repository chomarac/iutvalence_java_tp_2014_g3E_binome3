/* TODO JavaDoc. */
/* TODO Package. */

/**
 * Un joueur et ses grilles.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class Joueur {
	/** Nom du joueur. */
	private final String nomJoueur ;
	private final Grille maGrille;
	private final Grille saGrille;

	public Joueur(String nom){
		nomJoueur = nom;
		maGrille = new Grille();
		saGrille = new Grille();
	}
		
	public String getNomJoueur() {
		return nomJoueur;
	}

	public void ajouterBateau(Bateaux bateau) throws PlacementImpossible {
		maGrille.tenterPlacerBateau(bateau);
	}
	
}