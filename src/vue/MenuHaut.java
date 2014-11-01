package vue;

import execution.Execution;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nicolas on 01/11/2014.
 */
public class MenuHaut extends JPanel
{
    private JButton acceuil = new JButton("acceuil");
    private JButton catalogue = new JButton("catalogue");
    private JButton compte = new JButton("compte");

    public MenuHaut(final Execution frame)
    {
        acceuil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.setContentPane(frame.getEcranAcceuil());
                frame.getEcranAcceuil().revalidate();
            }
        });
        catalogue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.setContentPane(frame.getCatalogue());
                frame.getCatalogue().revalidate();
            }
        });
        compte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.setContentPane(frame.getCompte());
                frame.getCompte().revalidate();
            }
        });


        this.add(acceuil);
        this.add(catalogue);
        this.add(compte);
    }
}
