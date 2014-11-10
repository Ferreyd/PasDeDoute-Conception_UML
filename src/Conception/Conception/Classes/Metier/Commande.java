package Conception.Conception.Classes.Metier;


import java.util.Date;

/**
 * @author Nicolas
 * @version 1.0
 * @created 10-nov.-2014 14:23:37
 */
public class Commande {

	private Date dateCommande;
	private String etat;
	private int montant;
	private int numeroCommande;
	public LigneDeCommande m_LigneDeCommande;

	public Commande(){

	}

	public void finalize() throws Throwable {

	}
}//end Commande