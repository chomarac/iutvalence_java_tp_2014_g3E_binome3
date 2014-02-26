/* TODO Javadoc ! */
/**
 * @author chomarac et andré
 *
 */
public class Grille {

	/**
	 * Nombre de lignes de 1 à 10
	 */
	private final static int Nombre_de_lignes = 10;
	

	/**
	 * Nombre de colonnes de A a J
	 */
	private final static int Nombre_de_colonnes = 10;
	
	/**
	 * Les cases de la grille
	 */
	private Case[][] cases ;
	
	/**
	 * On fait une première grille
	 */
	public Grille() {
		this.cases = new Case[Nombre_de_lignes][Nombre_de_colonnes];
		
		for (int numeroDeLigne = 0; numeroDeLigne < Nombre_de_lignes; numeroDeLigne++)
			for (int numeroDeColonne = 0; numeroDeColonne < Nombre_de_colonnes; numeroDeColonne++)
					this.cases[numeroDeLigne][numeroDeLigne] = new Case (Case.Vide);
	}
	
}
