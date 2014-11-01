package vue;

import javax.swing.*;

/**
 * Created by Nicolas on 01/11/2014.
 */
public class EcranAcceuil extends JFrame
{
    private JPanel panel_principal = new JPanel();
    private JPanel menuHaut = new MenuHaut();

    private JTextPane textPane = new JTextPane();


    public EcranAcceuil()
    {
        super("Ecran acceuil");

        panel_principal.add(textPane);

        this.getContentPane().add(panel_principal);
        this.getContentPane().add(menuHaut);

        setSize(1024,768);
        setVisible(true);
    }

}
