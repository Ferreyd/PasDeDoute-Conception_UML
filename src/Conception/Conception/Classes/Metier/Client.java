package Conception.Conception.Classes.Metier;


/**
 * @author Nicolas
 * @version 1.0
 * @created 10-nov.-2014 14:23:37
 */
public class Client {

	private String adresseFacturation;
	private String adresseLivraison;
	private String motDePasse;
	private String nom;
	private int numeroClient;
	private String prenom;
	private String pseudo;
	public Commande m_Commande;

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

	public String getMotDePasse()
	{
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse)
	{
		this.motDePasse = motDePasse;
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

	public String getPseudo()
	{
		return pseudo;
	}

	public void setPseudo(String pseudo)
	{
		this.pseudo = pseudo;
	}

	public Commande getM_Commande()
	{
		return m_Commande;
	}

	public void setM_Commande(Commande m_Commande)
	{
		this.m_Commande = m_Commande;
	}

	/**
	 * 
	 * @param pseudo
	 * @param motDePasse
	 */
	public static Client rechercherClientParPseudo(String pseudo, String motDePasse){
		return null;
	}
}//end Client