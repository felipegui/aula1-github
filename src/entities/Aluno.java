package entities;

public class Aluno {
	
	public String nome;
	public double n1, n2, n3;
	
	public double somaNota() {
		return n1 + n2 + n3;
	}
	
	public double verificacaoAprovacao() {
		if(somaNota() < 60.0) {
			return 60 - somaNota();
		}else {
			return 0.0;
		}
	}

}
