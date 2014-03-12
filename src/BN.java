/* TODO Javadoc ! */
public class BN {
	private final Joueur joueur1;
	private final Joueur joueur2;
	
	public BN(String nomJoueur1, String nomJoueur2) {
		joueur1 = new Joueur("Papa");
		joueur2 = new Joueur("Maman");
		System.out.println(joueur1.getNomJoueur());
		System.out.println(joueur2.getNomJoueur());
	}

	public void jouer() {
		/* Demander la place des bateaux du joueur 1. */
		try {
			joueur1.ajouterBateau(new Croiseur(0,0,SensBateaux.EST));
		} catch (PlacementImpossible e) {
				
		}
		joueur1.afficherGrilles();
		try {
			joueur2.ajouterBateau(new Croiseur(2, 2, SensBateaux.SUD));
		} catch (PlacementImpossible e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
