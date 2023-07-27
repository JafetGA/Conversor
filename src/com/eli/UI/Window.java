package com.eli.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import com.eli.templates.Botones;
import com.eli.templates.PanelTarifas;
public class Window extends JFrame {
    public Window(){
        start();
    }
    private void start(){
        Botones numericPad = new Botones();
        PanelTarifas tarifas = new PanelTarifas();
        Image icono =getIcon("/com/eli/icon/miniatura.png");
        setTitle("Conversor");
        getContentPane().setBackground(Color.decode("#2a3140"));
        setMinimumSize(new Dimension(800,500));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(tarifas);
        getContentPane().add(numericPad);
        setVisible(true);
        setIconImage(icono);
    }
    private Image getIcon(String URL) {
		Image imagen = new ImageIcon(getClass().getResource(URL)).getImage();
        return (imagen);
    }
}
