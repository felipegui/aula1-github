package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program3 {

	public static void main(String[] args) {

		/*Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
		 * Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal.
		 * Usar uma classe mostrado no projeto ao lado*/
		
		//objeto que usa . em vez de , para reparar valores fracion�rios 
		Locale.setDefault(Locale.US);
		
		//objeto que permite entrada de dados na aplica��o
		Scanner sc = new Scanner(System.in);
		
		//objeto que permite eu pegar os atribultos e m�todos da minha classe ret�ngulo
		Retangulo ret = new Retangulo();
		
		System.out.println("Insira a largura e a altura do ret�ngulo: ");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.printf("�REA = %.2f%n", ret.area());
		System.out.printf("PER�METRO = %.2f%n", ret.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
		
		
		
		
		sc.close();
	}

}
