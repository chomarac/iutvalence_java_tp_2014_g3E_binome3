package fr.iutvalence.java.bataillenavale;

/**
 * Sens du bateaux.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */

/**On utilise une enumeration pour definir le sens du bateau.*/
public enum SensBateaux {
	
	/** Orientation vers le SUD (bas). */
    SUD(0,1),
    /** Orientation vers l'EST (droite). */
	EST(1,0);

    /** Coordonnee sur l'axe X de l'orientation (SUD ou EST). */
	private final int deltaX;
    /** Coordonnee sur l'axe Y de l'orientation (SUD ou EST). */
    private final int deltaY;

    SensBateaux(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    /**Accesseur en lecture de deltaX.*/
    public int deltaX() {
        return deltaX;
    }

    /**Accesseur en lecture de deltaY.*/
    public int deltaY() {
        return deltaY;
    }

}
