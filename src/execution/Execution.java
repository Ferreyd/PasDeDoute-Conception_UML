package execution;

import vue.EcranAcceuil;
import vue.MenuHaut;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nicolas on 01/11/2014.
 */
public class Execution extends JFrame
{
    JFrame f;
    JPanel panelPrincipal;
    JPanel menuHaut;

    public Execution()
    {
        f = new JFrame();
        panelPrincipal = new JPanel(new GridLayout(2,0));
        menuHaut = new MenuHaut();
        panelPrincipal.add(menuHaut);
        JPanel acceuil = new EcranAcceuil();
        panelPrincipal.add(acceuil);
        f.getContentPane().add(panelPrincipal);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setSize(1024,1024);
        f.setVisible(true);

    }

    public static void main(String[] args)
    {
        Execution execution = new Execution();
    }
}
