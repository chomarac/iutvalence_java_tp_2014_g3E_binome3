/* TODO Package. */

/**
 * Concept abstrait d'un bateau.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public abstract class Bateaux {
    /** Type. */
    protected String      type;
    /** Taille (depend du type). */
    protected int         taille;
    /** TODO. */
    protected int         originX;
    /** TODO. */
    protected int         originY;
    /** TODO. */
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
