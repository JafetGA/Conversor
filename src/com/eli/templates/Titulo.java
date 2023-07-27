package com.eli.templates;

import javax.swing.*;
import java.awt.*;

public class Titulo extends JPanel {
    public Titulo(String titulo){
        crearPanelTitulo(titulo);
    }
    private void crearPanelTitulo(String titulo){
        setBackground(Color.decode("#2a3140"));
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel title = new JLabel();
        title.setText(titulo);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial Unicode MS", Font.PLAIN, 32));
        title.setHorizontalAlignment(0);
        title.setVerticalAlignment(0);

        add(title);
    }
}
