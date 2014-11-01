package vue;

import controleur.SessionPasserCommande;
import metier.Client;
import metier.Produit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Nicolas on 01/11/2014.
 */
public class EcranAcceuil extends JPanel
{
    private JPanel panel_principal = new JPanel();
    private JTextPane textPane = new JTextPane();

    private JButton testBtn = new JButton("Test");


    public EcranAcceuil()
    {
        System.out.println("\n### Constructeur Ecran Acceuil ###");
        panel_principal.add(textPane);
        System.out.println("### Ajout du textPane ###");
        testBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                test();
            }
        });
        test();
        System.out.println("### Ajout du bouton ###");
        panel_principal.add(testBtn);
        System.out.println("### Fini constructeur ###\n");

    }

    public void test()
    {
        Produit produit1 = new Produit("Description Produit 1", "Libelle produit 1", 150, "Reference produit 1");
        Produit produit2 = new Produit("Description Produit 2", "Libelle produit 2", 100, "Reference produit 2");
        Produit produit3 = new Produit("Description Produit 3", "Libelle produit 3", 350, "Reference produit 3");

        Client client1 = new Client("Adresse Facturation Client 1", "Adresse Livraison 1" , "Nom client 1", 1, "Prenom Client 1");

        ArrayList<Produit> produits = new ArrayList<Produit>();
        produits.add(produit1);
        produits.add(produit2);
        produits.add(produit3);


        SessionPasserCommande passerCommande = new SessionPasserCommande();
        passerCommande.passerCommande(client1, produits);

        System.out.println("CLIENT POSSEDE : " + client1.getM_Commande().get(0).getProduits().size() + " PRODUIT(S) EN " + client1.getM_Commande().size() + " COMMANDE(S)");
        for(int i = 0; i < produits.size(); i++)
        {
            System.out.println(client1.getM_Commande().get(0).getProduits().get(i).getLibelle());
        }
    }

}
