/* TODO Javadoc ! */
public class Bateaux {
	
	
	
	/**
	 * nomBateau sert � identifier les noms des bateaux sur le plateau du jeu
	 */
	public String nomBateau ;
	
	/**
	 * tailleBateau servira � d�finir la taille des bateaux en fonction de leur nom
	 */
	public int tailleBateau ;

	/**
	 * 
	 * @param nom Ce sera le nom attribu� aux bateaux (il faudrait trouver une solution afin que le nom du bateau soit choisi parmi une liste pr�d�fini
	 * @param taille Ce sera la taille du bateau construit, il faudrait que la taille se fasse en fonction du nom du bateau
	 */
	public void Bateau( String nom , int taille ) {
		this.nomBateau = nom ;
		this.tailleBateau = taille ;
	}
}
