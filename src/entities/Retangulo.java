package entities;

public class Retangulo {
	
	//atributos da classe
	public double largura, altura;
	
	//método que calcula a área do retângulo
	public double area(){		
		return largura * altura;		
	}

	//método que calcula o perímetro do retângulo
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	//método que calcula a diagonal do retângulo
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
}
