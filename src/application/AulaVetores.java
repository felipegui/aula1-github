package application;

import java.util.Locale;
import java.util.Scanner;

public class AulaVetores {

	public static void main(String[] args) {

		/*Fazer um programa para ler um número inteiro N e a
		 * altura de N pessoas. Armazene as N alturas em um
		 * vetor. Em seguida, mostrar a altura média dessas
		 * pessoas.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de altura que deseja colocar: ");		
		int n = sc.nextInt();
		
		//declaração do vetor
		double[] vetor = new double[n];
		
		//fazer o for pq já tem previamente definido a quantidade de altura
		for(int i = 0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		}
		//fazer a soma das alturas armazenando numa variável "soma" através de um for
		double soma = 0.0;
		for(int i = 0; i<n; i++) {
			soma += vetor[i];
		}
		//fazer o cálculo da média e guardar a média em uma variável "med"
		double med = soma / n;
		//mostra o resultado da média
		System.out.printf("Média entre as alturas inseridas: %.2f",med);
		
		
		
		sc.close();

	}

}
