package metier;


import java.util.ArrayList;

/**
 * @author Nicolas
 * @version 1.0
 * @created 21-oct.-2014 14:56:09
 */
public class Catalogue {

	public ArrayList <Categorie> m_Categorie;

	public Catalogue(){

	}

	public void finalize() throws Throwable {

	}

    public ArrayList<Categorie> getM_Categorie()
    {
        return m_Categorie;
    }

    public void setM_Categorie(ArrayList<Categorie> m_Categorie)
    {
        this.m_Categorie = m_Categorie;
    }
}//end Catalogue