/* TODO JavaDoc. */
/* TODO Package. */

/**
 * TODO
 *
 * @author TODO
 * @version TODO
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

    /* TODO Pensez au polymorphisme ! */
	public void ajouterBateau(Croiseur croiseur) throws PlacementImpossible {
		maGrille.tenterPlacerBateau(croiseur);	
	}

    /* TODO Mauvais nom de méthode !!! */
	public void afficherGrilles() {
		/* m�thode pour afficher les grilles du joueur. */
	}
}
