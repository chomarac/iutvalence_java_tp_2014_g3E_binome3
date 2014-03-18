/* TODO JavaDoc. */
/* TODO Package. */

/**
 * Grille de bataille navale.
 *
 * @author TODO
 * @version TODO
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
                this.cases[numeroDeLigne][numeroDeColonne] = new Case (Case.VIDE);
	}
    
    public void tenterPlacerBateau(Bateaux bateau) throws PlacementImpossible {
		/* Valider la position. */
    	/*Position actuelle + (taille-1) soit possible*/
    	/* Placer le bateau dans la grille. */
	}
}
