package com.eli.function;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.eli.templates.PanelDeDivisa;

import javax.swing.*;

public class NumericButtons implements ActionListener {
    private final JTextField targetTextField;

    public NumericButtons(JTextField targetTextField) {
        this.targetTextField = targetTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (targetTextField != null) {
            if(targetTextField.getText().equals("0")){
                targetTextField.setText("");
            }
            String buttonText = e.getActionCommand();
            targetTextField.setText(targetTextField.getText() + buttonText);
        }
    }
}