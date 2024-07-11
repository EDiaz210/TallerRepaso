package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class vehiculos {
    private JCheckBox checkBox1;
    private JButton buscar;
    private JButton insertar;
    public JPanel p1;

    public vehiculos() {
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ED = new JFrame();
                ED.setTitle("Revisión Vehicular");
                ED.setContentPane(new Buscar().p1);
                ED.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ED.setSize(700, 700);
                ED.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(buscar)).dispose();
            }
        });
        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ED = new JFrame();
                ED.setTitle("Revisión Vehicular");
                ED.setContentPane(new insertar().p2);
                ED.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ED.setSize(700, 700);
                ED.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(insertar)).dispose();

            }
        });
    }
}
