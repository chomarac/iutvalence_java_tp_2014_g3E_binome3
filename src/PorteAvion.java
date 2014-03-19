/**
 * Bateau porte-avion
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class PorteAvion extends Bateaux {
	public PorteAvion(int i, int j, SensBateaux sens) {
		this.tailleBateau = 5;
		this.typeBateau = "Porte-Avion";
		this.originX = i;
		this.originY = j;
		this.sens = sens;
	}
}
