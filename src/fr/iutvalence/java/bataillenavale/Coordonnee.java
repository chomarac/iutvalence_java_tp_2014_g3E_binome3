package fr.iutvalence.java.bataillenavale;


/**
 * Les coordonnees des bateaux.
 *
 * @author CHOMARAT ANDRE
 * @version 1.0.0
 */
public class Coordonnee {
	
	private int x ;
	private int y ;
	
	/**Creation de coordonnees.*/
	public Coordonnee(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	/**Accesseur en lecture de la coordonnee X.*/
	public int getX(){
		return x;
	}
	
	/**Accesseur en lecture de la coordonnee Y.*/
	public int getY(){
		return y;
	}
	

}
