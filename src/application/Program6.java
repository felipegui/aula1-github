package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoeda;

public class Program6 {

	public static void main(String[] args) {

		/*Fa�a um programa para ler a cota��o do d�lar e depois um valor em
		 * d�lares a ser comprado por uma pessoa em reais. Informar quantos
		 * reias a pessoa vai pagar pelos d�lares, considerando ainda que a 
		 * pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma
		 * classe ConversorDeMoeda para ser respons�vel pelos c�lculos*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual � o pre�o do d�lar? ");
		ConversorDeMoeda.dolar = sc.nextDouble();
		System.out.print("Quantos d�lares ser�o comprados? ");
		ConversorDeMoeda.valor = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais: %.2f%n", ConversorDeMoeda.total());
		
		
		
		sc.close();

	}

}
