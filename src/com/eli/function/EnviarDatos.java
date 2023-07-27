package com.eli.function;

import com.eli.api.ConexionAPI;
import com.eli.divisas.ListaDeMonedas;
import com.eli.utilities.Monedas;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Map;

public class EnviarDatos implements ActionListener {
    private final JTextField targetTextField;
    private final JTextField targetTextField2;
    private static final Map<String, Monedas> monedas = ListaDeMonedas.getCurrencies();

    private final JComboBox<String> monedaBase;
    private final JComboBox<String> monedaCambio;

    public EnviarDatos(JTextField targetTextField, JTextField targetTextField2, JComboBox<String> monedaBase, JComboBox<String> monedaCambio) {
        this.targetTextField = targetTextField;
        this.targetTextField2 = targetTextField2;
        this.monedaBase = monedaBase;
        this.monedaCambio = monedaCambio;
    }
    private String item(JComboBox<String> select){
        return  (String) select.getSelectedItem();
    }

    private Boolean validarCambios(String moneda1, String moneda2){
        if(moneda1.equalsIgnoreCase(moneda2)) {
    		JOptionPane.showMessageDialog(null, "Seleccione monedas diferentes.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    		return false;
    	}
    	return true;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String base =item(monedaBase);
        String contraria =item(monedaCambio);

        String coinBase = base.substring(0,base.indexOf(":"));
        String coinContraria = contraria.substring(0,contraria.indexOf(":"));

        System.out.println(coinBase + " " + coinContraria);

        if (!(validarCambios(coinBase,coinContraria))) return;
        double numeroCambiar = Double.parseDouble(targetTextField.getText());
        ConexionAPI API = new ConexionAPI(monedas);
        API.conectarServicio();
        double resultado = 0.0;
        if(coinBase.equalsIgnoreCase("USD")){
            resultado = monedas.get(coinContraria).getValue() * numeroCambiar;
        }else{
            resultado = (monedas.get(coinContraria).getValue() * numeroCambiar)
                        / (monedas.get(coinBase).getValue());
        }
        DecimalFormat df = new DecimalFormat("#.#####");
        String resultadoDf = df.format(resultado);
        targetTextField2.setText(resultadoDf);
        System.out.println("Resultado: "+resultadoDf+" "+coinContraria);
    }
}
