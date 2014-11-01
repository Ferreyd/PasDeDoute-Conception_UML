package metier;


/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:13
 */
public class LigneDeCommande {

	private int montant;
	private int quantite;

    public LigneDeCommande(int montant, int quantite)
    {
        this.montant = montant;
        this.quantite = quantite;
    }

    public int getMontant()
    {
        return montant;
    }

    public void setMontant(int montant)
    {
        this.montant = montant;
    }

    public int getQuantite()
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
        this.quantite = quantite;
    }

    public void finalize() throws Throwable {


	}
}//end LigneDeCommande