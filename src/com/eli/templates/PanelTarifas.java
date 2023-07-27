package com.eli.templates;

import com.eli.divisas.ListaDeMonedas;
import com.eli.utilities.Monedas;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class PanelTarifas extends JPanel {
    private static final PanelDeDivisa divisa = new PanelDeDivisa();
    private static final PanelDeDivisa divisa2 = new PanelDeDivisa();
    public static JTextField ingresaMonto1 = divisa.getTextField();
    public static JTextField ingresaMonto2 = divisa2.getTextField();

    public static JComboBox<String> monedaBase = divisa.getComboBox();
    public static JComboBox<String> monedaCambio = divisa2.getComboBox();
    private final Map<String, Monedas> monedas = ListaDeMonedas.getCurrencies();
    public PanelTarifas(){
        display();
    }
    private void display(){
        setBackground(Color.decode("#2a3140"));
        setMinimumSize(new Dimension(216,500));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        Titulo titulo = new Titulo("Divisas");

        Mensaje mensaje = new Mensaje();
        add(titulo);
        add(divisa);
        ingresaMonto1.setFocusable(false);
        ingresaMonto1.setText("0");
        ingresaMonto1.setForeground(Color.WHITE);
        ingresaMonto1.setOpaque(false);
        ingresaMonto1.setBorder(BorderFactory.createEmptyBorder());
        ingresaMonto1.setFont(new Font("Arial Unicode MS", Font.PLAIN, 62));
        //ComboBox
        monedaBase.setFont(new Font("Arial Unicode MS", Font.PLAIN, 25));
        monedaBase.setBackground(Color.decode("#2a3140"));
        monedaBase.setForeground(Color.WHITE);
        monedaBase.setBorder(BorderFactory.createEmptyBorder());
        for (Monedas nombre : monedas.values()) {
            monedaBase.addItem(nombre.getAbbreviation() + ": " + nombre.getName());
        }
        monedaBase.setSelectedItem("MXN: Peso Mexicano");
        //---------------------------------------------------------
        add(divisa2);
        ingresaMonto2.setText("0");
        ingresaMonto2.setForeground(Color.WHITE);
        ingresaMonto2.setOpaque(false);
        ingresaMonto2.setBorder(BorderFactory.createEmptyBorder());
        ingresaMonto2.setFont(new Font("Arial Unicode MS", Font.PLAIN, 62));
        //ComboBox
        monedaCambio.setFont(new Font("Arial Unicode MS", Font.PLAIN, 25));
        monedaCambio.setBackground(Color.decode("#2a3140"));
        monedaCambio.setForeground(Color.WHITE);
        monedaCambio.setBorder(BorderFactory.createEmptyBorder());
        for (Monedas nombre : monedas.values()) {
            monedaCambio.addItem(nombre.getAbbreviation() + ": " + nombre.getName());
        }
        monedaCambio.setSelectedItem("USD: Estados Unidos Dólar");
        //---------------------------------------------------------
        add(mensaje);
    }
    public static boolean foco(){
        return ingresaMonto1.isFocusOwner();
    }
}
