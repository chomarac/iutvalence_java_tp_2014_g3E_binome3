/* TODO JavaDoc. */
/* TODO Package. */

/**
 * Concept abstrait d'un bateau.
 * 
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public abstract class Bateaux {
	/** Type du bateau. */
	protected String typeBateau;
	/** Taille du bateau (depend du type de bateau). */
	protected int tailleBateau;
    protected int originX;
    protected int originY;
    protected SensBateaux sens;

    public int taille() {
        return tailleBateau;
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
