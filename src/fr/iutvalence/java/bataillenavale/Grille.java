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

    /** On affiche les grilles. */
    public String toString() {
    	String resultat = "_ _ _ _ _ _ _ _";
    	for(int numeroDeLigne = 0; numeroDeLigne < Grille.NOMBRE_DE_LIGNES; numeroDeLigne++){
    		resultat += "|";
    		for(int numerDeColonne = 0; numerDeColonne < Grille.NOMBRE_DE_COLONNES; numerDeColonne++)
    		{
    			resultat +="_|";
    		}
    	}
    }
    
    public void tenterPlacerBateau(Bateaux bateau) throws PlacementImpossible {
        /* TODO Utiliser des Collections. */
    	
        // Générer la liste des coordonnées.
        for (int i = 0; i < bateau.taille(); i++)
        {
                int x = bateau.x() + (i * bateau.sens().deltaX());
                int y = bateau.y() + (i * bateau.sens().deltaY());
                System.out.println(x + "," + y);
    			/** On vérifie le dépassement en x et en y */
                
                
                if (!((x <= Grille.NOMBRE_DE_LIGNES) && (y <= Grille.NOMBRE_DE_COLONNES)) && (this.cases[x][y] == Case.VIDE)) {
                    throw new PlacementImpossible();
                }
        }
        /* TODO Ce n'est pas le bon fonctionnement. Vous devez attendre de valider toutes les positions avant de placer les bateaux. */
        for (int i = 0; i < bateau.taille(); i++)
        {
                int x = bateau.x() + (i * bateau.sens().deltaX());
                int y = bateau.y() + (i * bateau.sens().deltaY());
                System.out.println(x + "," + y);
    			/** On vérifie le dépassement en x et en y */
                
                
                this.cases[x][y] = Case.BATEAU_SAIN;

        }

    	/* Valider la position. */
    	/*Position actuelle + (taille-1) soit possible*/
    	/* Placer le bateau dans la grille. */
    }
}
