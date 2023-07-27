package com.eli.function;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clear implements ActionListener {
    private final JTextField targetTextField;
    private final JTextField targetTextField2;

    public Clear(JTextField targetTextField, JTextField targetTextField2){
        this.targetTextField = targetTextField;
        this.targetTextField2 =targetTextField2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (targetTextField != null && targetTextField2 != null){
            targetTextField.setText("0");
            targetTextField2.setText("0");
         }
    }
}
