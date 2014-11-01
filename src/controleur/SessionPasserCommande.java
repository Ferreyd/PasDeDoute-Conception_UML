package controleur;

import metier.Client;
import metier.Commande;
import metier.Produit;

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
     * Methode qui permet de passer une commande d'un produit
     * @param client Le client souhaitant passer une commande
     * @param commande La commande que le client passe
     * @return true si la commande a été ajouté, false sinon
     */
    public boolean passerCommande(Client client, Commande commande)
    {
        if(client.getM_Commande().add(commande))
        {
            return true;
        }else
        {
            return false;
        }
    }
}//end SessionPasserCommande