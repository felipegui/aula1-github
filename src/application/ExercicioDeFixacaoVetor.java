package application;

import java.util.Scanner;

import entities.Aluguel;

public class ExercicioDeFixacaoVetor {

	public static void main(String[] args) {

		/*A dono de um pensionato possui dez quartos para alugar para estudantes,
		 * sendo esses quartos identificados pelos números 0 a 9.
		 * Fazer um programa que inicie com todos os dez quartos vazios e depois
		 * leia uma quantidade N representando o número de estudantes que vão
		 * alugar quartos(N pode ser de 1 a 10). Em seguida, registre o aluguel
		 * dos estudantes, bem como qual dos quartos o estudante escolheu(de 0 a
		 * 9). Suponha que seja escolhido um quarto vago. Ao final, seu programa
		 * deve imprimir um relatório de todas as ocupações do pensionato, por
		 * ordem de quarto.*/
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.print("Quantos estudantes são? ");
		int qntEstudantes = sc.nextInt();
		
		for(int i = 1; i <= qntEstudantes; i++) {
			System.out.println();
			System.out.println("Aluguel #"+i+":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}		
		
		sc.close();

	}

}
