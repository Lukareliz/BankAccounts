package Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Utils {
	static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
	
	//Método Double para String, serve para converter os valores//
	public static String doubleToString(Double valor) {
		return formatandoValores.format(valor);
	}
}
