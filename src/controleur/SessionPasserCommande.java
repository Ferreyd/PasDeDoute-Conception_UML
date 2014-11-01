package controleur;

import metier.Client;
import metier.Commande;
import metier.LigneDeCommande;
import metier.Produit;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:14
 */
public class SessionPasserCommande {

	public SessionPasserCommande(){

	}

	public void finalize() throws Throwable {

	}


    /**
     * Creer une commande a partir d'un produit
     * @param produit Le produit a ajouter dans une commande
     * @return une Commande
     */
    private Commande creerCommande(ArrayList<Produit> produit)
    {

        return new Commande(new Date(),"ok",produit.get(0).getPrixDuJour(), new Random().nextInt(), new LigneDeCommande(produit.get(0).getPrixDuJour(), 1),produit);
    }

    /**
     * Creer une commande à partir d'une liste de produit
     * @param produits Une liste de produits
     * @return une Commande
     */
    private Commande creerCommandes(ArrayList<Produit> produits)
    {
        int montant = 0;
        for(int i = 0; i < produits.size(); i++)
        {
            montant += produits.get(i).getPrixDuJour();
        }
        return new Commande(new Date(),"ok",montant, new Random().nextInt(), new LigneDeCommande(montant, produits.size()),produits);
    }


    /**
     * Permet de passer une commande en fonction d'une liste de produit et l'affecte à un client
     * @param client le client
     * @param produits la liste de produit
     * @return true si la commande est passe, false si la commande n est pas passe
     */
    public boolean passerCommande(Client client, ArrayList<Produit> produits)
    {
        if(produits.size() == 1)
        {
            client.getM_Commande().add(this.creerCommande(produits));
            return true;
        }
        else if(produits.size() > 1)
        {
            client.getM_Commande().add(this.creerCommandes(produits));
            return true;
        }
        else
        {
            return false;
        }
    }
}//end SessionPasserCommande