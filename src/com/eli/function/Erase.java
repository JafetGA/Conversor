package com.eli.function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Erase implements ActionListener {
    private final JTextField targetTextField;

    public Erase(JTextField targetTextField) {
        this.targetTextField = targetTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (targetTextField != null) {
            String texto = targetTextField.getText();
            if(texto == null || texto.length() == 0){
                targetTextField.setText(texto);
            }
            assert texto != null;
            String nuevoTexto = texto.substring(0,texto.length()-1);
            targetTextField.setText(nuevoTexto);
            if(targetTextField.getText().equals("")){
                targetTextField.setText("0");
            }
        }
    }
}
