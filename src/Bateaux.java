/* TODO JavaDoc. */
/* TODO Package. */

/**
 * Concept abstrait d'un bateau.
 * 
 * @author TODO
 * @version TODO
 */
public abstract class Bateaux {
	/** Type du bateau. */
	protected String typeBateau;
	/** Taille du bateau (depend du type de bateau). */
	protected int tailleBateau;
    protected int originX;
    protected int         originY;
    /* TODO Créer la case SensBateaux. */
    protected SensBateaux sens;

    public int getTailleBateau() {
        return tailleBateau;
    }

    public int getOriginX() {
        return originX;
    }

    public int getOriginY() {
        return originY;
	}

	public SensBateaux getSens() {
		return sens;
	}

    /* TODO Créer un constructeur avec la taille, l'origine et le sens. */
}
