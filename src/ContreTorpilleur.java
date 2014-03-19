/**
 * Bateau contre-torpilleur
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class ContreTorpilleur extends Bateaux {
		public ContreTorpilleur(int i, int j, SensBateaux sens) {
			this.tailleBateau = 3;
			this.typeBateau = "Contre-Torpilleur";
			this.originX = i;
			this.originY = j;
			this.sens = sens;
	}

}
