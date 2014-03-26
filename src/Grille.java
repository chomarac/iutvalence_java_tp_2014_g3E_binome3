/* TODO Package. */

/**
 * Grille de bataille navale.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Grille {
    /** Nombre de ligne d'une grille. */
    private static final int NOMBRE_DE_LIGNES = 10;
    /** Nombre de colonne d'une grille. */
    private static final int NOMBRE_DE_COLONNES = 10;
    /** Les cases de la grille. */
    private final Case[][] cases;

    public Grille() {
        this.cases = new Case[Grille.NOMBRE_DE_LIGNES][Grille.NOMBRE_DE_COLONNES];
        for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++) {
                this.cases[numeroDeLigne][numeroDeColonne] = Case.VIDE;
            }
        }
    }

    /** On affiche les grilles. */
    public void afficher() {
    }
    
}
