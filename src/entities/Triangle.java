package entities;

public class Triangle {
	
	public double a, b, c;
	
	//m�todo calcular �rea
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
