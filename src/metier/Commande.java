package metier;


import java.util.ArrayList;
import java.util.Date;

/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:11
 */
public class Commande {

	private Date dateCommande;
	private String etat;
	private int montant;
	private int numeroCommande;
	public LigneDeCommande m_LigneDeCommande;
    private ArrayList<Produit> produits;


    public Commande(Date dateCommande, String etat, int montant, int numeroCommande, LigneDeCommande m_LigneDeCommande, ArrayList<Produit> produits)
    {
        this.dateCommande = dateCommande;
        this.etat = etat;
        this.montant = montant;
        this.numeroCommande = numeroCommande;
        this.m_LigneDeCommande = m_LigneDeCommande;
        this.produits = produits;
    }

    public void finalize() throws Throwable {

	}

    public Date getDateCommande()
    {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande)
    {
        this.dateCommande = dateCommande;
    }

    public String getEtat()
    {
        return etat;
    }

    public void setEtat(String etat)
    {
        this.etat = etat;
    }

    public int getMontant()
    {
        return montant;
    }

    public void setMontant(int montant)
    {
        this.montant = montant;
    }

    public int getNumeroCommande()
    {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande)
    {
        this.numeroCommande = numeroCommande;
    }

    public LigneDeCommande getM_LigneDeCommande()
    {
        return m_LigneDeCommande;
    }

    public void setM_LigneDeCommande(LigneDeCommande m_LigneDeCommande)
    {
        this.m_LigneDeCommande = m_LigneDeCommande;
    }

    public ArrayList<Produit> getProduits()
    {
        return produits;
    }
}//end Commande