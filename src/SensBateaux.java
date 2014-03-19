/**
 * Sens du bateaux.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public enum SensBateaux {
	SUD(0,1),
	EST(1,0);
	
	private final int deltaX;
	private final int deltaY;
	
	private SensBateaux(int deltaX, int deltaY) {
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
