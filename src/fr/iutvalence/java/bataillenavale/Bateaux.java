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
}
