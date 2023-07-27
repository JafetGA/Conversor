package com.eli.templates;

import javax.swing.*;

import com.eli.function.*;
import eli.button.MyButton;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Botones extends JPanel {
    public Botones(){
        crearPad();
    }
    private void crearPad(){
        final Color fondo = new Color(50, 89, 140);
        final Color sobre = new Color(22, 40, 63);
        final Color click = new Color(77, 137, 216);
        final Color borde = new Color(191, 191, 191);
        final int radio = 10;
        setBackground(Color.decode("#2a3140"));
        //setMinimumSize(new Dimension(375,500));
        setLayout(new GridLayout(5,3,3,3));
        //Creación de los botones
        JLabel espacio = new JLabel();
        MyButton btnLimpiar = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btnBorrar = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn7 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn8 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn9 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn4 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn5 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn6 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn1 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn2 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn3 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btn0 = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btnPunto = new MyButton(fondo,sobre,click,borde,radio);
        MyButton btnSend = new MyButton(fondo,sobre,click,borde,radio);
        //Contenido de los botones
        btnLimpiar.setText("CE",48, Color.WHITE);
        btnBorrar.setText("⌫",48, Color.WHITE);
        btn0.setText("0",48,Color.WHITE);
        btn1.setText("1",48,Color.WHITE);
        btn2.setText("2",48,Color.WHITE);
        btn3.setText("3",48,Color.WHITE);
        btn4.setText("4",48,Color.WHITE);
        btn5.setText("5",48,Color.WHITE);
        btn6.setText("6",48,Color.WHITE);
        btn7.setText("7",48,Color.WHITE);
        btn8.setText("8",48,Color.WHITE);
        btn9.setText("9",48,Color.WHITE);
        btnPunto.setText(".",48,Color.WHITE);
        btnSend.setText("\uD83D\uDD85", 48, Color.WHITE);
        //Funcionalidad
            JTextField objetivo = PanelTarifas.ingresaMonto1;
            JTextField objetivo2 = PanelTarifas.ingresaMonto2;
            JComboBox<String> caja = PanelTarifas.monedaBase;
            JComboBox<String> caja2 = PanelTarifas.monedaCambio;
            NumericButtons listener = new NumericButtons(objetivo);
            btn0.addActionListener(listener);
            btn1.addActionListener(listener);
            btn2.addActionListener(listener);
            btn3.addActionListener(listener);
            btn4.addActionListener(listener);
            btn5.addActionListener(listener);
            btn6.addActionListener(listener);
            btn7.addActionListener(listener);
            btn8.addActionListener(listener);
            btn9.addActionListener(listener);

            Clear clear = new Clear(objetivo, objetivo2);
            btnLimpiar.addActionListener(clear);

            Erase erase = new Erase(objetivo);
            btnBorrar.addActionListener(erase);

            Punto punto = new Punto(objetivo);
            btnPunto.addActionListener(punto);

            EnviarDatos datos = new EnviarDatos(objetivo,objetivo2,caja,caja2);
            btnSend.addActionListener(datos);
        //Añadir al panel
        add(espacio);
        add(btnLimpiar);
        add(btnBorrar);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn0);
        add(btnPunto);
        add(btnSend);


    }
}
