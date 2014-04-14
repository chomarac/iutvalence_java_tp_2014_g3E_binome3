package fr.iutvalence.java.bataillenavale;

import java.util.Scanner;

/**
 * Une partie de bataille navale.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class BatailleNavale {
	
    /** Premier joueur. */
	private final Joueur joueur1;
	
    /** Second joueur. */
	private final Joueur joueur2;

    /** Créer une nouvelle partie avec les noms de joueurs spécifiés. */
	public BatailleNavale(String nomJoueur1, String nomJoueur2) {
		joueur1 = new Joueur(nomJoueur1);
		joueur2 = new Joueur(nomJoueur2);
	}

    /** Lancement du jeu */
    public void jouer() {
    	
        /** On demande la place des bateaux du joueur 1. */
    	/**Pour le Torpilleur*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Torpilleur (taille 2) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Torpilleur :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;

            joueur1.ajouterBateau(new Torpilleur(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        /**Pour le Contre-Torpilleur*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Contre-Torpilleur (taille 3) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Contre-Torpilleur :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;

            joueur1.ajouterBateau(new ContreTorpilleur(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        /**Pour le Croiseur*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Croiseur (taille 4) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Croiseur :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;
        		
            joueur1.ajouterBateau(new Croiseur(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        /**Pour le Porte-avion*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Porte-Avions (taille 5) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Porte-Avions :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;

            joueur1.ajouterBateau(new PorteAvion(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        
        joueur1.afficher();
        
        
        
        /** On demande la place des bateaux du joueur 2. */
    	/**Pour le Torpilleur*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Torpilleur (taille 2) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Torpilleur :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;

            joueur2.ajouterBateau(new Torpilleur(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        /**Pour le Contre-Torpilleur*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Contre-Torpilleur (taille 3) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Contre-Torpilleur :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;

            joueur2.ajouterBateau(new ContreTorpilleur(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        /**Pour le Croiseur*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Croiseur (taille 4) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Croiseur :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;
        		
            joueur2.ajouterBateau(new Croiseur(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        /**Pour le Porte-avion*/
        try {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Entrer la coordonnee X de l'origine du Porte-Avions (taille 5) :");
        	int origineX = sc.nextInt();
        	System.out.println("Entrer la coordonnee Y de l'origine du Porte-Avions :");
        	int origineY = sc.nextInt();
        	System.out.println("Entrer le sens du bateau (SUD ou EST) :");
        	String sensBateau;
        	do {
        		sensBateau = sc.nextLine();
        	}
        	while (sensBateau == null || sensBateau.isEmpty());
        	SensBateaux sens;
        	if (sensBateau.equals("SUD")) {
        		sens = SensBateaux.SUD;
        	}
        	else 
        		sens = SensBateaux.EST;

            joueur2.ajouterBateau(new PorteAvion(origineY, origineX,sens));
        	
        	
        }
        catch (PlacementImpossible e) {
        	System.err.println("Placement du bateau impossible! Placer votre bateau à nouveau.");
        	
            /* Redemander placement bateau */
        }
        
        joueur2.afficher();
        
    }
}
