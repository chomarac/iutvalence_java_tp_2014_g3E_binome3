package fr.iutvalence.java.bataillenavale;

/**
 * Sous-Marin h�ritant de Bateaux.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class SousMarin extends Bateaux {
    public SousMarin(int i, int j, SensBateaux sens) {
        super("Sous-Marin", 3, i, j, sens);
    }
}
