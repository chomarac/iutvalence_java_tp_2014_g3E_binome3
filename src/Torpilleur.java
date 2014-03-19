/**
 * Bateau torpilleur
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class Torpilleur extends Bateaux {


		public Torpilleur(int i, int j, SensBateaux sens) {
			this.tailleBateau = 2;
			this.typeBateau = "Torpilleur";
			this.originX = i;
			this.originY = j;
			this.sens = sens;
	}

}
