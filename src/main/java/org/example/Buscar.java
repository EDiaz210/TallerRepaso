package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Buscar {
    public JPanel p1;
    private JTextField BusquedaXD;
    private JLabel propietario;
    private JLabel color;
    private JLabel tipoCombustible;
    private JLabel Cilindraje;
    private JLabel Marca;
    private JLabel Placa;
    private JButton buscar;
    private JButton regresarButton;

    public Buscar() {
        buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/revision";
                String user = "root";
                String pass = "123456";



                try(Connection connection = DriverManager.getConnection(url,user, pass)){
                    String sql = "select * from vehiculos where placa = '"+BusquedaXD.getText()+"'";
                    Statement xp = connection.createStatement();
                    ResultSet rs = xp.executeQuery(sql);

                    System.out.println("Conexión exitosa");
                    while(rs.next()){
                        Placa.setText("Placa: "+rs.getString("placa"));
                        Marca.setText("Marca: "+rs.getString("marca"));
                        Cilindraje.setText("Cilindraje: "+rs.getString("cilindraje"));
                        tipoCombustible.setText("Tipo de Combustible: "+rs.getString("tipoCombustible"));
                        color.setText("Color: "+rs.getString("color"));
                        propietario.setText("Propietario: "+rs.getString("propietario"));

                    }



                }catch (SQLException e1){
                    e1.printStackTrace();
                }

            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ED = new JFrame();
                ED.setTitle("Revisión Vehicular");
                ED.setContentPane(new vehiculos().p1);
                ED.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ED.setSize(700, 700);
                ED.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(regresarButton)).dispose();
            }
        });
    }
}
