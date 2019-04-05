package entities;

public class Empregado {
	
	//atribultos(propriedades) da minha classe
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	//método que calcula o salário líquido
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	//método que aumenta o salário com base na porcetagem insirida
	public void aumentarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
