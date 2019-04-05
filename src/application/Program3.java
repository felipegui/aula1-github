package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program3 {

	public static void main(String[] args) {

		/*Fazer um programa para ler os valores da largura e altura de um retângulo.
		 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
		 * Usar uma classe mostrado no projeto ao lado*/
		
		//objeto que usa . em vez de , para reparar valores fracionários 
		Locale.setDefault(Locale.US);
		
		//objeto que permite entrada de dados na aplicação
		Scanner sc = new Scanner(System.in);
		
		//objeto que permite eu pegar os atribultos e métodos da minha classe retângulo
		Retangulo ret = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.printf("ÁREA = %.2f%n", ret.area());
		System.out.printf("PERÍMETRO = %.2f%n", ret.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());
		
		
		
		
		sc.close();
	}

}
