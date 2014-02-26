/* TODO JavaDoc. */
public class Case {
	/** La case est represente par un booleen : vide ou touchee. */
	public boolean EtatCase;
    /* TODO Attention, en Java, par convention, on fait "static final". */
    /* TODO Attention, en Java, par convention, on mets les noms de constantes en majuscule. */
	/** La case est vide. */
	public final static boolean Vide = false;
	/** La case est touchee. */
	public final static boolean Touchee = true;

	public Case(boolean etatCase) {
		EtatCase = etatCase;
	}
}
