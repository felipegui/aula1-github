package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Program4 {

	public static void main(String[] args) {

		/*Fazer um programa para ler os dados de um funcion�rio
		 * (nome, sal�rio bruto e imposto). Em seguida, mostrar os dados do
		 * funcion�rio(nome e sal�rio l�quido). Em seguida, aumentar o sal�rio
		 * do funcion�rio com base em uma porcentagem dada (somente o sal�rio
		 * bruto � afetado pela porcentagem) e mostrar novamente os dados do
		 * funcion�rio. Use a classe projetada abaixo*/
		
		//objeto que usa . em vez de , para reparar valores fracion�rios
		Locale.setDefault(Locale.US);
		
		//objeto que permite entrada de dados na minha aplica��o
		Scanner sc = new Scanner(System.in);
		
		//objeto que permite pegar as funcionalidades da minha classe Empregado, inclusive os atribultos
		Empregado emp = new Empregado();
		
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Sal�rio Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Empregado: " + emp);
		
		System.out.println();
		
		System.out.print("Qual a porcentagem de aumento de sal�rio? ");
		double x = sc.nextDouble();
		emp.aumentarSalario(x);
		
		System.out.println();
		
		System.out.print("Dados atualizados: " + emp);		
		
		sc.close();
	}

}
