package Conception.Conception.Classes.Vue;

import Conception.Conception.Classes.Controleur.SessionPasserCommande;
import Conception.Conception.Classes.Controleur.TypeEcran;
import Conception.Conception.Classes.Metier.Produit;

import javax.swing.*;

/**
 * @author Nicolas
 * @version 1.0
 * @created 10-nov.-2014 10:36:14
 */
public class EcranGenerique extends JFrame{

	private SessionPasserCommande spc;

	public EcranGenerique(){

	}

	public void finalize() throws Throwable {

	}
	public static void main(String[] args){

	}

	public boolean connexionValide(){
		return false;
	}

	public TypeEcran ecranListeProduit(){
		return null;
	}

	public TypeEcran ecranPanier(){
		return null;
	}

	/**
	 * 
	 * @param produit
	 */
	public TypeEcran ecranProduit(Produit produit){
		return null;
	}

	/**
	 * 
	 * @param message
	 */
	public TypeEcran envoieEcranPerso(String message){
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
	 * @param motCle
	 */
	public String rechercher(String motCle){
		return "";
	}

	public EcranGenerique reponseConnexion(){
		return null;
	}
}//end EcranGenerique