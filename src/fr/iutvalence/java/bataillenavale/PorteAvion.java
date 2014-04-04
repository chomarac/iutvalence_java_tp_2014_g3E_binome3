package fr.iutvalence.java.bataillenavale;

/**
 * Bateau porte-avion.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0
 */
public class PorteAvion extends Bateaux {
    public PorteAvion(int i, int j, SensBateaux sens) {
        super("Porte-Avion", 5, i, j, sens);
    }
}
