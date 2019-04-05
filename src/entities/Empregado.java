package entities;

public class Empregado {
	
	//atribultos(propriedades) da minha classe
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	//m�todo que calcula o sal�rio l�quido
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	//m�todo que aumenta o sal�rio com base na porcetagem insirida
	public void aumentarSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
