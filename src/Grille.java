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

    /** TODO. */
    public void afficher() {
    }


    /* TODO La génération des positions devrait être faite dans la classe Bateaux. */
    public void tenterPlacerBateau(Bateaux bateau) throws PlacementImpossible {
        /* TODO Utiliser des Collections. */
        // Générer la liste des coordonnées.
        for (int i = 0; i < bateau.taille(); i++) {
            for (int j = 0; j < bateau.taille(); j++) {
                int ix = bateau.x() + (i * bateau.sens().deltaX());
                int jy = bateau.y() + (j * bateau.sens().deltaY());
                System.out.println(ix + "," + jy);
    			/* Vérifier le dépassement en x, en y */
                if (((ix <= Grille.NOMBRE_DE_LIGNES) && (jy <= Grille.NOMBRE_DE_COLONNES)) || (this.cases[ix][jy] == Case.VIDE)) {
                    /* TODO Ce n'est pas le bon fonctionnement. Vous devez attendre de valider toutes les positions avant de placer les bateaux. */
                    this.cases[ix][jy] = Case.BATEAU_SAIN;
                }
                else {
                    throw new PlacementImpossible();
                }
            }
        }
    		
    	/* Valider la position. */
    	/*Position actuelle + (taille-1) soit possible*/
    	/* Placer le bateau dans la grille. */
    }
}
