package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductAulaVetor2;

public class AulaVetor2 {

	public static void main(String[] args) {

		/*Fazer um programa para ler um n�mero inteiro N e os dados (nome e pre�o)
		 * de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar
		 * o pre�o m�dio dos produtos*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//iniciando a entrada de dados
		int n = sc.nextInt();
		
		//criando um vetor do tipo classe ProductAulaVertor2
		ProductAulaVetor2[] vetor = new ProductAulaVetor2[n];
		
		//fazendo o for pq j� tem definido a qnt de produtos a serem inseridos
		//OBS: vetor.length = tamanho do vetor
		for(int i = 0; i<vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new ProductAulaVetor2(nome, preco);
		}
		//fazendo a soma dos pre�os
		double soma = 0.0;
		for(int i = 0; i<vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		//fazendo a m�dia
		double media = soma / vetor.length;
		//mostrando a m�dia do pre�o
		System.out.printf("M�dia do pre�o: %.2f%n", media);
		
		
		
		
		sc.close();

	}

}
