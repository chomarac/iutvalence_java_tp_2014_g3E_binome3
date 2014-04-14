package fr.iutvalence.java.bataillenavale;

import java.util.HashSet;
import java.util.Set;

/**
 * Concept abstrait d'un bateau.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public abstract class Bateaux {
	
    /** Type. */
    protected String type;
    
    /** Taille (depend du type). */
    protected int taille;
    
    /** Origine du bateau sur l'axe X. */
    protected int originX;
    
    /** Origine du bateau sur l'axe Y. */
    protected int originY;
    
    /** Sens du bateau (EST ou SUD). */
    protected SensBateaux sens;

    protected Set<Coordonnee> coordonnees;
    
    protected Bateaux(final String typeBateau, final int tailleBateau, final int origX, final int origY, final SensBateaux sens) {
        this.type = typeBateau;
        this.taille = tailleBateau;
        this.originX = origX;
        this.originY = origY;
        this.sens = sens;
        this.coordonnees = new HashSet();
    }

    /**Retourne la taille du bateau.*/
    public int taille() {
        return taille;
    }

    /**Retourne l'origine X du bateau.*/
    public int x() {
        return originX;
    }

    /**Retourne l'origine Y du bateau.*/
    public int y() {
        return originY;
    }

    /**Retourne le sens du bateau.*/
    public SensBateaux sens() {
        return sens;
    }

    /**Calcule les coordonnées du bateau 
     * en fonction de son origine, de sa longueur et de son orientation 
     * puis les stocke dans une collection.*/
    public void stockerCoordonneesBateau(){
    	for (int i = 0; i < taille(); i++)
        {
                int x = x() + (i * sens().deltaX());
                int y = y() + (i * sens().deltaY());
                coordonnees.add(new Coordonnee(x, y));
        }
    }
}