package com.eli.templates;

import javax.swing.*;
import java.awt.*;

public class PanelDeDivisa extends JPanel {
    private  final JTextField ingresarMonto = new JTextField();

    private final JComboBox <String> monedasDisponibles = new JComboBox<>();
    public PanelDeDivisa(){
        displayInformation();
    }
    private void displayInformation(){
        setBackground(Color.decode("#2a3140"));
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(220,225));
        //Elementos
        JLabel moneda = new JLabel();
        moneda.setText("$ ");
        moneda.setForeground(Color.WHITE);
        moneda.setFont(new Font("Arial Unicode MS", Font.PLAIN, 62));
         //añadir elementos
        add(moneda,"West");
        add(ingresarMonto, "Center");
        add(monedasDisponibles, "South");
    }
    public void setDefaultItem(String item){
        monedasDisponibles.setSelectedItem(item);
    }
    public JComboBox<String> getComboBox(){
        return monedasDisponibles;
    }
    public JTextField getTextField(){
        return ingresarMonto;
    }
}
