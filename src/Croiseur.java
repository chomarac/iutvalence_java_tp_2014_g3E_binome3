/**
 * Bateau croiseur
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class Croiseur extends Bateaux {
	public Croiseur(int i, int j, SensBateaux sens) {
		this.tailleBateau = 4;
		this.typeBateau = "Croiseur";
		this.originX = i;
		this.originY = j;
		this.sens = sens;
	}
}
