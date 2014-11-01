package vue;

import javax.swing.*;

/**
 * Created by Nicolas on 01/11/2014.
 */
public class EcranAcceuil extends JPanel
{
    private JPanel panel_principal = new JPanel();
    private JTextPane textPane = new JTextPane();


    public EcranAcceuil()
    {
        panel_principal.add(textPane);

    }

}
