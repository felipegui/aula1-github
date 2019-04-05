package util;

public class ConversorDeMoeda {
	
	public static double dolar, valor;

	public static double comprarDolar() {
		return dolar * valor;
	}	
	
	public static double iof() {
		return comprarDolar() * 6 / 100;
	}
	
	public static double total() {
		return comprarDolar() + iof();
	}
}
