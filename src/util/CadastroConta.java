package util;

public class CadastroConta {
	
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public CadastroConta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public CadastroConta(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		depositos(valorInicial);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositos(double valor) {
		saldo += valor;
	}
	
	public void saques(double valor) {
		saldo -= valor + 5;
	}
	
	public String toString() {
		return "Conta "
				+ numeroConta
				+ ", "
				+ "Titular: "
				+ nomeTitular
				+ ", "
				+ "Saldo: R$"
				+ String.format("%.2f", saldo);
	}
	
}
