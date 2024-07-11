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
    String Placa;
    String Marca;
    double Cilindraje;
    String TipoCombustible;
    String Color;
    String Propietario;

    public vehiculos(String placa, String marca, double cilindraje, String tipoCombustible, String color, String propietario) {
        Placa = placa;
        Marca = marca;
        Cilindraje = cilindraje;
        TipoCombustible = tipoCombustible;
        Color = color;
        Propietario = propietario;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public double getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        Cilindraje = cilindraje;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

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
                ED.setSize(700, 800);
                ED.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(insertar)).dispose();

            }
        });
    }
}
