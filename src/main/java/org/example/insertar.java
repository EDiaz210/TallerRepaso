package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class insertar {
    public JPanel p2;
    private JTextField placa;
    private JTextField marca;
    private JTextField cilindraje;
    private JTextField color;
    private JTextField propietario;
    private JButton ingresar;
    private JButton limpiar;
    private JTextField tipoCombus;
    private JButton regresarButton;


    public insertar() {
        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/revision";
                String user = "root";
                String pass = "123456";

                vehiculos vb= new vehiculos();




                try(Connection connection = DriverManager.getConnection(url,user, pass)){
                    String sql = "insert into vehiculos (Placa, Marca, Cilindraje, TipoCombustible, Color, Propietario) VALUES (?,?,?,?,?,?)";
                    PreparedStatement cp = connection.prepareStatement(sql);
                    System.out.println("Conexión Exitosa");
                    vb.setPlaca(placa.getText());
                    vb.setMarca(marca.getText());
                    vb.setCilindraje(Double.parseDouble(cilindraje.getText()));
                    vb.setTipoCombustible(tipoCombus.getText());
                    vb.setColor(color.getText());
                    vb.setPropietario(propietario.getText());

                    cp.setString(1,vb.getPlaca());
                    cp.setString(2,vb.getMarca());
                    cp.setDouble(3,vb.getCilindraje());
                    cp.setString(4,vb.getTipoCombustible());
                    cp.setString(5,vb.getColor());
                    cp.setString(6,vb.getPropietario());




                }catch (SQLException e2){
                    e2.printStackTrace();
                }

            }
        });


        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                placa.setText("");
                marca.setText("");
                cilindraje.setText("");
                tipoCombus.setText("");
                color.setText("");
                propietario.setText("");

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
