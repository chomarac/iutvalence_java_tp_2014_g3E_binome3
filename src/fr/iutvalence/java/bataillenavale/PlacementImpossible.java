package fr.iutvalence.java.bataillenavale;

/**
 * Exception si le placement du bateau est impossible.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class PlacementImpossible extends Exception {
	public PlacementImpossible(){
		System.err.println("Placement du bateau impossible! Placer votre bateau � nouveau.");
	}
}
