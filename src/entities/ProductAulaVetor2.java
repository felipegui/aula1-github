package entities;

public class ProductAulaVetor2 {
	
	private String nome;
	private double preco;
	
	//construtor
	public ProductAulaVetor2(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}	
}
