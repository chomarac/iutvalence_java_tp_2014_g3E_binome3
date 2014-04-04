package fr.iutvalence.java.bataillenavale;

/**
 * Concept abstrait d'un bateau.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public abstract class Bateaux {
    /** Type. */
    protected String type;
    /** Taille (depend du type). */
    protected int taille;
    /** Origine du bateau sur l'axe X. */
    protected int originX;
    /** Origine du bateau sur l'axe Y. */
    protected int originY;
    /** Sens du bateau (EST ou SUD). */
    protected SensBateaux sens;

    protected Bateaux(final String typeBateau, final int tailleBateau, final int origX, final int origY, final SensBateaux sens) {
        this.type = typeBateau;
        this.taille = tailleBateau;
        this.originX = origX;
        this.originY = origY;
        this.sens = sens;
    }

    public int taille() {
        return taille;
    }

    public int x() {
        return originX;
    }

    public int y() {
        return originY;
    }

    public SensBateaux sens() {
        return sens;
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
                
                /*
                if (((ix <= Grille.NOMBRE_DE_LIGNES) && (jy <= Grille.NOMBRE_DE_COLONNES)) && (this.cases[ix][jy] == Case.VIDE)) {
                    /* TODO Ce n'est pas le bon fonctionnement. Vous devez attendre de valider toutes les positions avant de placer les bateaux. */
                   /* this.cases[ix][jy] = Case.BATEAU_SAIN;
                }
                else {
                    throw new PlacementImpossible();
                }*/
        }
        

    	/* Valider la position. */
    	/*Position actuelle + (taille-1) soit possible*/
    	/* Placer le bateau dans la grille. */
    }
}
