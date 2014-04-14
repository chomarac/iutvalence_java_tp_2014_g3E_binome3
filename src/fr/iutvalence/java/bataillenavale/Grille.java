package fr.iutvalence.java.bataillenavale;

/**
 * Grille de bataille navale.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Grille {
	
    /** Nombre de ligne d'une grille. */
    public static final int NOMBRE_DE_LIGNES = 10;
    
    /** Nombre de colonne d'une grille. */
    public static final int NOMBRE_DE_COLONNES = 10;
    
    /** Les cases de la grille. */
    private final Case[][] cases;

	public Case[][] getCases() {
		return cases;
	}

	public Grille() {
        this.cases = new Case[Grille.NOMBRE_DE_LIGNES][Grille.NOMBRE_DE_COLONNES];
        for (int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++) {
            for (int numeroDeColonne = 0; numeroDeColonne < Grille.NOMBRE_DE_COLONNES; numeroDeColonne++) {
                this.cases[numeroDeLigne][numeroDeColonne] = Case.VIDE;
            }
        }
    }

    /** Methode pour modeliser les grilles. */
    public String toString() {
    	String resultat = " 0 1 2 3 4 5 6 7 8 9\n _ _ _ _ _ _ _ _ _ _\n";
    	for(int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++){
    		resultat += "|";
    		for(int numerDeColonne = 0; numerDeColonne < Grille.NOMBRE_DE_COLONNES; numerDeColonne++){
    			resultat += cases[numeroDeLigne][numerDeColonne] + "|";
    		}
    		resultat += numeroDeLigne + "\n";
    	}
    	return resultat;
    }
    
    /**Methode pour placer un bateau.*/
    public void tenterPlacerBateau(Bateaux bateau) throws PlacementImpossible {
 	
    	/**On valide les positions possibles.*/
        for (int i = 0; i < bateau.taille(); i++)
        {
                int x = bateau.x() + (i * bateau.sens().deltaX());
                int y = bateau.y() + (i * bateau.sens().deltaY());
                if (!((x <= Grille.NOMBRE_DE_LIGNES) && (y <= Grille.NOMBRE_DE_COLONNES)) && (this.cases[x][y] == Case.VIDE)) {
                    throw new PlacementImpossible();
                }
        }
        /**On pose le bateau.*/
        poserBateau(bateau);

    }
    
    /**Methode pour poser un bateau :
     * on parcours chaque case ou l'on veut que le bateau sois
     * pour les passer de "VIDE" a "BATEAU_SAIN".*/
    private void poserBateau(Bateaux bateau) {
        for (int i = 0; i < bateau.taille(); i++)
        {
                int x = bateau.x() + (i * bateau.sens().deltaX());
                int y = bateau.y() + (i * bateau.sens().deltaY());
                this.cases[x][y] = Case.BATEAU_SAIN;
        }
    }
}
