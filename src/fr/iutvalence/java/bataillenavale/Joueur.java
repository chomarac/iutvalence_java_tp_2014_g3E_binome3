package fr.iutvalence.java.bataillenavale;



import java.util.LinkedHashSet;
import java.util.Set;

import fr.iutvalence.java.bataillenavale.Bateaux;
import fr.iutvalence.java.bataillenavale.Grille;
import fr.iutvalence.java.bataillenavale.PlacementImpossible;

/**
 * Un joueur et ses grilles.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Joueur {
	/** Nom du joueur. */
	private final String nomJoueur ;
    /** Grille de la flotte du joueur et les endroits où il  été touché. */
	private final Grille maGrille;
    /** Grille représentant les endroits touchés chez l'adversaire. */
    private final Grille saGrille;
    /** Bateaux du joueur. */
    private Set<Bateaux> bateaux;
    
    /** Création d'un nouveau joueur et de ses grilles. */
    public Joueur(String nom) {
        nomJoueur = nom;
        maGrille = new Grille();
        saGrille = new Grille();
        bateaux = new LinkedHashSet<Bateaux>();
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    /** On ajoute un bateau et on soulève une exception si ca ne marche pas. */
    public void ajouterBateau(Bateaux bateau) throws PlacementImpossible {
    	
        maGrille.tenterPlacerBateau(bateau);
        bateaux.add(bateau);
        bateau.stockerCoordonneesBateau();
	}
    
    

	public void afficher() {
		System.out.println("Joueur : " + nomJoueur);
		System.out.println("Grille personnelle : \n" + maGrille.toString());
		System.out.println("Reflet de la grille de l'adversaire : \n" + saGrille.toString());
	}
	
	
	
	
	public void attaquerBateau() {
		
	}
}
