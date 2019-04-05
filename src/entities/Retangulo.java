package entities;

public class Retangulo {
	
	//atributos da classe
	public double largura, altura;
	
	//m�todo que calcula a �rea do ret�ngulo
	public double area(){		
		return largura * altura;		
	}

	//m�todo que calcula o per�metro do ret�ngulo
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	//m�todo que calcula a diagonal do ret�ngulo
	public double diagonal() {
		return Math.sqrt(altura * altura + largura * largura);
	}
}
