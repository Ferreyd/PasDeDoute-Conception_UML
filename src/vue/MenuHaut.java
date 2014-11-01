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

    public MenuHaut(final Execution frame)
    {
        acceuil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("### Clique bouton acceuil ###");
                frame.setContentPane(new EcranAcceuil());
                System.out.println("### appel JPanel ###");
                frame.getEcranAcceuil().revalidate();
                System.out.println("### Revalidate ###");
            }
        });
        catalogue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("### Clique bouton catalogue ###");
                frame.setContentPane(frame.getCatalogue());
                System.out.println("### appel JPanel ###");
                frame.getCatalogue().revalidate();
                System.out.println("### Revalidate ###");
            }
        });



        this.add(acceuil);
        this.add(catalogue);
    }
}
