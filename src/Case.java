
public class Case {

	/**
	 * La case est represente par un booleen : Vide ou touchee
	 */
	public boolean EtatCase;
	
	/**
	 * La case est vide
	 */
	public final static boolean Vide = false;
	

	/**
	 * La case est touchee
	 */
	public final static boolean Touchee = true;

	/**
	 * @param etatCase
	 */
	public Case(boolean etatCase) {

		EtatCase = etatCase;
	
	}
	
	
}
