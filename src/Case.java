/* TODO JavaDoc. */
public class Case {
	/** La case est represente par un booleen : vide ou touchee. */
	public boolean EtatCase;
	
	/** La case est vide. */
	public static final boolean VIDE = false;
	/** La case est touchee. */
	public static final boolean TOUCHEE = true;

	public Case(boolean etatCase) {
		EtatCase = etatCase;
	}
}
