package com.eli.divisas;
import java.util.HashMap;
import com.eli.utilities.Monedas;
import java.util.Map;
public class ListaDeMonedas {

    private static final Map<String, Monedas>currencies;

    static{
        currencies = new HashMap<>();
        currencies.put("MXN", new Monedas("MXN","Peso Mexicano", 16.8353));
        currencies.put("EUR", new Monedas("EUR","Euro", 0.903816));
        currencies.put("GBP", new Monedas("GBP","Libras Esterlinas", 0.779764));
        currencies.put("JPY", new Monedas("JPY","Yen Japonés", 141.45432143));
        currencies.put("KRW", new Monedas("KRW","Won surcoreano", 1279.752534));
        currencies.put("USD", new Monedas("USD", "Estados Unidos Dólar", 1));
    }
    public static Map<String, Monedas> getCurrencies() {
        return currencies;
    }
}
