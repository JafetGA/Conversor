package com.eli.function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Punto implements ActionListener {
    private final JTextField targetTextField;

    public Punto(JTextField targetTextField) {
        this.targetTextField = targetTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (targetTextField != null) {
            targetTextField.setText(targetTextField.getText() + ".");
        }
    }
}
