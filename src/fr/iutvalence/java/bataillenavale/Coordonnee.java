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
	
	public Coordonnee(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	public int getX(){
		return x;
	}
	
	
	public int getY(){
		return y;
	}
	

}
