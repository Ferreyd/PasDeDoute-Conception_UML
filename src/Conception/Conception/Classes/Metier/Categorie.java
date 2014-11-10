package Conception.Conception.Classes.Metier;


import java.util.ArrayList;

/**
 * @author Nicolas
 * @version 1.0
 * @created 10-nov.-2014 14:23:37
 */
public class Categorie {

	private Categorie categorieMere;
	private int nomCategorie;
	private ArrayList<Produit> produit;
	private ArrayList<Categorie> sousCategorie;

	public Categorie(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param produit
	 */
	public void addProduit(Produit produit){

	}

	/**
	 * 
	 * @param categorie
	 */
	public void addSousCategorie(Categorie categorie){

	}
}//end Categorie