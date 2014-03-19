/* TODO JavaDoc. */
/* TODO Package. */

/**
 * Grille de bataille navale.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class Grille {
	/** Nombre de ligne d'une grille. */
    private static final int NOMBRE_DE_LIGNES   = 10;
    
    /** Nombre de colonne d'une grille. */
    private static final int NOMBRE_DE_COLONNES = 10;

    /* TODO final ? */
    /** Les cases de la grille. */
    private Case[][] cases;

    public Grille() {
        this.cases = new Case[Grille.NOMBRE_DE_LIGNES][Grille.NOMBRE_DE_COLONNES];
        for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++)
            for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++)
                this.cases[numeroDeLigne][numeroDeColonne] = Case.VIDE;
	}
    
	public void afficherGrilles() {
		/* méthode pour afficher les grilles du joueur. */
	}


    public void tenterPlacerBateau(Bateaux bateau) throws PlacementImpossible {
		// Générer la liste des coordonnées.
    	for (int i = 0; i < bateau.taille(); i++) {
    		for (int j = 0; j < bateau.taille(); j++) {
    			int ix = bateau.x() + i*bateau.sens().deltaX();
    			int jy = bateau.y() + j*bateau.sens().deltaY();
    			System.out.println(ix + "," + jy);
    			/* Vérifier le dépassement en x, en y */
    			if ( ix <= NOMBRE_DE_LIGNES && jy <= NOMBRE_DE_COLONNES || this.cases[ix][jy] == Case.VIDE ) {
    				this.cases[ix][jy] = Case.BATEAU_SAIN;
    			}
    			else {
    				throw new PlacementImpossible();
    			}
    			/* Tout va bien la c'est OK. */
    		}
    	}
    		
    	/* Valider la position. */
    	/*Position actuelle + (taille-1) soit possible*/
    	/* Placer le bateau dans la grille. */
	}
}
