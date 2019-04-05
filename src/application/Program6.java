package application;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoeda;

public class Program6 {

	public static void main(String[] args) {

		/*Faça um programa para ler a cotação do dólar e depois um valor em
		 * dólares a ser comprado por uma pessoa em reais. Informar quantos
		 * reias a pessoa vai pagar pelos dólares, considerando ainda que a 
		 * pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma
		 * classe ConversorDeMoeda para ser responsável pelos cálculos*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual é o preço do dólar? ");
		ConversorDeMoeda.dolar = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		ConversorDeMoeda.valor = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais: %.2f%n", ConversorDeMoeda.total());
		
		
		
		sc.close();

	}

}
