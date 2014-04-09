package fr.iutvalence.java.bataillenavale;

/**
 * Sens du bateaux.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public enum SensBateaux {
	/** Orientation vers le SUD (bas). */
    SUD(1,0),
    /** Orientation vers l'EST (droite). */
	EST(0,1);

    /** Coordonnée sur l'axe X de l'orientation (SUD ou EST). */
	private final int deltaX;
    /** Coordonnée sur l'axe Y de l'orientation (SUD ou EST). */
    private final int deltaY;

    SensBateaux(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int deltaX() {
        return deltaX;
    }

    public int deltaY() {
        return deltaY;
    }

}
