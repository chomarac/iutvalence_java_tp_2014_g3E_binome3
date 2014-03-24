/* TODO Package. */

/**
 * Sens du bateaux.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public enum SensBateaux {
	/** TODO. */
    SUD(0,1),
    /** TODO. */
	EST(1,0);

    /** TODO. */
	private final int deltaX;
    /** TODO. */
    private final int deltaY;

    SensBateaux(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int deltaX() {
        return deltaX;
    }

    public int deltaY() {
        return deltaY;
    }

}
