package Conception.Conception.Classes.Metier;


/**
 * @author Nicolas
 * @version 1.0
 * @created 10-nov.-2014 14:23:37
 */
public class Produit {

	private String description;
	private String libelle;
	private int prix;
	private int prixDuJour;
	private String reference;
	public Categorie m_Categorie;
	public LigneDeCommande m_LigneDeCommande;

	public Produit(){

	}

	public void finalize() throws Throwable {

	}
}//end Produit