package metier;


import java.util.ArrayList;

/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:11
 */
public class Categorie {

	private Categorie categorieMere;
	private int nomCategorie;
	private ArrayList<Produit> produit;
	private ArrayList<Categorie> sousCategorie;
	public Categorie m_Categorie;

	public Categorie(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param produit
	 */
	public void addProduit(Produit produit){
        this.produit.add(produit);
	}

	/**
	 * 
	 * @param categorie
	 */
	public void addSousCategorie(Categorie categorie){
        this.sousCategorie.add(categorie);
	}

    public Categorie getCategorieMere()
    {
        return categorieMere;
    }

    public void setCategorieMere(Categorie categorieMere)
    {
        this.categorieMere = categorieMere;
    }

    public int getNomCategorie()
    {
        return nomCategorie;
    }

    public void setNomCategorie(int nomCategorie)
    {
        this.nomCategorie = nomCategorie;
    }

    public ArrayList<Produit> getProduit()
    {
        return produit;
    }

    public void setProduit(ArrayList<Produit> produit)
    {
        this.produit = produit;
    }

    public ArrayList<Categorie> getSousCategorie()
    {
        return sousCategorie;
    }

    public void setSousCategorie(ArrayList<Categorie> sousCategorie)
    {
        this.sousCategorie = sousCategorie;
    }

    public Categorie getM_Categorie()
    {
        return m_Categorie;
    }

    public void setM_Categorie(Categorie m_Categorie)
    {
        this.m_Categorie = m_Categorie;
    }
}//end Categorie