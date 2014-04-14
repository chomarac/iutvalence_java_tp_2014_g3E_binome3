package fr.iutvalence.java.bataillenavale;

/**
 * Modelisation des cases de la grille.
 *
 * @author CHOMARAT ANDRE
 * @version 2.0.0
 */

/**On utilise une enumeration pour les cases.*/
public enum Case {
	VIDE ("_"),
	TIR_MANQUE("X"),
	BATEAU_SAIN("#"),
	BATEAU_TOUCHE("*");
	
	private final String repr;
	
	Case(String repr) {
		this.repr = repr;
	}
	
	@Override
	public String toString() {
		return this.repr;
	}
}
