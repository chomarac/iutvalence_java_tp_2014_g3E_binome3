/* TODO Javadoc ! Je vous mets un exemple. */

/**
 * Grille de bataille navale.
 */
public class Grille {
    /* TODO Attention, en Java, par convention, on fait "static final". */
    /* TODO Attention, en Java, par convention, on mets les noms de constantes en majuscule. */
	/** Nombre de ligne d'une grille. */
    private final static int Nombre_de_lignes   = 10;
    /** Nombre de colonne d'une grille. */
    private final static int Nombre_de_colonnes = 10;
    /** Les cases de la grille. */
    private Case[][] cases;

    /**
     * On fait une premi�re grille
     */
    public Grille() {
        this.cases = new Case[Nombre_de_lignes][Nombre_de_colonnes];

        for (int numeroDeLigne = 0; numeroDeLigne < Nombre_de_lignes; numeroDeLigne++)
            for (int numeroDeColonne = 0; numeroDeColonne < Nombre_de_colonnes; numeroDeColonne++)
                /* XXX Erreur ! C'est numeroDeColonne ! */
                this.cases[numeroDeLigne][numeroDeLigne] = new Case (Case.Vide);
	}
	
}
