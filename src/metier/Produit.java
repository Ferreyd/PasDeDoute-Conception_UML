package metier;


/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:13
 */
public class Produit {

	private String description;
	private String libelle;
	private int prixDuJour;
	private String reference;
	public Categorie m_Categorie;
	public LigneDeCommande m_LigneDeCommande;

	public Produit(){

	}

    public Produit(String description, String libelle, int prixDuJour, String reference)
    {
        this.description = description;
        this.libelle = libelle;
        this.prixDuJour = prixDuJour;
        this.reference = reference;
    }

    public void finalize() throws Throwable {

	}

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String libelle)
    {
        this.libelle = libelle;
    }

    public int getPrixDuJour()
    {
        return prixDuJour;
    }

    public void setPrixDuJour(int prixDuJour)
    {
        this.prixDuJour = prixDuJour;
    }

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public Categorie getM_Categorie()
    {
        return m_Categorie;
    }

    public void setM_Categorie(Categorie m_Categorie)
    {
        this.m_Categorie = m_Categorie;
    }

    public LigneDeCommande getM_LigneDeCommande()
    {
        return m_LigneDeCommande;
    }

    public void setM_LigneDeCommande(LigneDeCommande m_LigneDeCommande)
    {
        this.m_LigneDeCommande = m_LigneDeCommande;
    }


}//end Produit