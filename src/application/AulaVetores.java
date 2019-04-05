package application;

import java.util.Locale;
import java.util.Scanner;

public class AulaVetores {

	public static void main(String[] args) {

		/*Fazer um programa para ler um n�mero inteiro N e a
		 * altura de N pessoas. Armazene as N alturas em um
		 * vetor. Em seguida, mostrar a altura m�dia dessas
		 * pessoas.*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de altura que deseja colocar: ");		
		int n = sc.nextInt();
		
		//declara��o do vetor
		double[] vetor = new double[n];
		
		//fazer o for pq j� tem previamente definido a quantidade de altura
		for(int i = 0; i<n; i++) {
			vetor[i] = sc.nextDouble();
		}
		//fazer a soma das alturas armazenando numa vari�vel "soma" atrav�s de um for
		double soma = 0.0;
		for(int i = 0; i<n; i++) {
			soma += vetor[i];
		}
		//fazer o c�lculo da m�dia e guardar a m�dia em uma vari�vel "med"
		double med = soma / n;
		//mostra o resultado da m�dia
		System.out.printf("M�dia entre as alturas inseridas: %.2f",med);
		
		
		
		sc.close();

	}

}
