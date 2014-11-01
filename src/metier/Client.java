package metier;


import java.util.ArrayList;

/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:11
 */
public class Client {

	private String adresseFacturation;
	private String adresseLivraison;
	private String nom;
	private int numeroClient;
	private String prenom;
	public ArrayList<Commande> m_Commande;

	public Client(){

	}

	public void finalize() throws Throwable {

	}

    public String getAdresseFacturation()
    {
        return adresseFacturation;
    }

    public void setAdresseFacturation(String adresseFacturation)
    {
        this.adresseFacturation = adresseFacturation;
    }

    public String getAdresseLivraison()
    {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison)
    {
        this.adresseLivraison = adresseLivraison;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public int getNumeroClient()
    {
        return numeroClient;
    }

    public void setNumeroClient(int numeroClient)
    {
        this.numeroClient = numeroClient;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public ArrayList<Commande> getM_Commande()
    {
        return m_Commande;
    }

    public void setM_Commande(ArrayList<Commande> m_Commande)
    {
        this.m_Commande = m_Commande;
    }
}//end Client