package Conception.Conception.Classes.Controleur;

import Conception.Conception.Classes.Metier.Client;
import Conception.Conception.Classes.Metier.Produit;

import java.util.ArrayList;

/**
 * @author Nicolas
 * @version 1.0
 * @created 10-nov.-2014 10:36:14
 */
public class SessionPasserCommande {

	public SessionPasserCommande(){

	}

	public void finalize() throws Throwable {

	}
	public TypeEcran traiterConnexion(){
		return TypeEcran.ACCEUIL;
	}

	/**
	 * 
	 * @param client
	 * @param produit
	 */
	public void ajouterProduitPanier(Client client, Produit produit){

	}

	/**
	 * 
	 * @param produits
	 */
	public ArrayList<Produit> ajoutPanier(ArrayList<Produit> produits){
		return null;
	}

	/**
	 * 
	 * @param pseudo
	 * @param motDePasse
	 */
	public void identification(String pseudo, String motDePasse){

	}

	/**
	 * 
	 * @param produit
	 */
	public Produit rechercherProduit(Produit produit){
		return null;
	}

	/**
	 * 
	 * @param produit
	 */
	public Produit selectionProduit(Produit produit){
		return null;
	}

	/**
	 * 
	 * @param pseudo
	 * @param motDePasse
	 */
	public void traiterIdentification(String pseudo, String motDePasse){


	}

	public boolean validationConnexion(){
		return false;
	}
}//end SessionPasserCommande