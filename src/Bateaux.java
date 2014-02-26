/* TODO Javadoc ! */
/* TODO Nous avions parlé d'un abstract ? */
public class Bateaux {
    /* TODO Pourquoi nomBateau et pas simplement "nom" ? Dans la classe Bateaux on s'attend à voir des bateaux… */
    /* TODO Est-ce "nom" ou "type" ? */
	/** Noms du bateau. */
	public String nomBateau ;
	/** Taille du bateau (dépend du type de bateau). */
	public int tailleBateau ;

	/**
	 * TODO Nous avions parlé d'une classe abstraite.
	 * @param nom Ce sera le nom attribu� aux bateaux (il faudrait trouver une solution afin que le nom du bateau soit choisi parmi une liste pr�d�fini
	 * @param taille Ce sera la taille du bateau construit, il faudrait que la taille se fasse en fonction du nom du bateau
	 */
	public void Bateau(String nom, int taille) {
		this.nomBateau = nom ;
		this.tailleBateau = taille ;
	}
}
