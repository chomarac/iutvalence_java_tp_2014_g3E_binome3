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
	/* Choisir une modélisation : ensemble de case ou vecteur. */
	protected int originX;
	protected int originY;
	protected SensBateaux sens;
	public int getTailleBateau() {
		return tailleBateau;
	}
	public void setTailleBateau(int tailleBateau) {
		this.tailleBateau = tailleBateau;
	}
	public int getOriginX() {
		return originX;
	}
	public void setOriginX(int originX) {
		this.originX = originX;
	}
	public int getOriginY() {
		return originY;
	}
	public void setOriginY(int originY) {
		this.originY = originY;
	}
	public SensBateaux getSens() {
		return sens;
	}
	public void setSens(SensBateaux sens) {
		this.sens = sens;
	}
	
	
}
