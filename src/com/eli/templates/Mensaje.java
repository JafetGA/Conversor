package com.eli.templates;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Mensaje extends JPanel {
    public Mensaje(){
        showMensaje();
    }
    private void showMensaje(){
        this.setBackground(Color.decode("#2a3140"));
        setLayout(new BorderLayout());
        JTextPane message = new JTextPane();
        message.setText("Esta aplicación utiliza los servicios de Open Exchange Rates. "+
                        "Puede usar la api por defecto o si lo prefiere puede colocar su propia API KEY\n(Work in progres)");
        message.setForeground(Color.WHITE);
        message.setFont(new Font("Arial", Font.PLAIN, 13));
        message.setEditable(false);
        message.setOpaque(false);
        message.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        message.setBackground(Color.decode("#2a3140"));
        this.add(message, "Center");
    }
}
