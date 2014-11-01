package vue;

import javax.swing.*;

/**
 * Created by Nicolas on 01/11/2014.
 */
public class MenuHaut extends JPanel
{
    private JButton acceuil = new JButton("acceuil");
    private JButton catalogue = new JButton("catalogue");
    private JButton compte = new JButton("compte");

    public MenuHaut()
    {
        this.add(acceuil);
        this.add(catalogue);
        this.add(compte);
    }
}
