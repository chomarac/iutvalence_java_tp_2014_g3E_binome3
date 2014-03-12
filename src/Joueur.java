/* TODO Javadoc ! */
/**
 * @author chomarac
 *
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

	public void ajouterBateau(Croiseur croiseur) throws PlacementImpossible {
		maGrille.tenterPlacerBateau(croiseur);	
	}

	public void afficherGrilles() {
		/* méthode pour afficher les grilles du joueur. */
		
		
	}
}
