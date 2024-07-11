package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame ED = new JFrame();
        ED.setTitle("Revisión Vehicular");
        ED.setContentPane(new vehiculos().p1);
        ED.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ED.setSize(700, 700);
        ED.setVisible(true);


    }
}