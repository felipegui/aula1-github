package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program5 {

	public static void main(String[] args) {

		/*Fazer um programa para ler o nome de um aluno e as três notas que
		 * ele obteve nos três trimestres do ano(primeiro trimestre vale 30
		 * e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota
		 * final do aluno no ano. Dizer também se o aluno está aprovado ou não
		 * e em caso de negativo, quantos pontos faltam para o aluno obter o
		 * mínimo para ser aprovado(que é 60% da nota). Você deve criar uma
		 * classe Aluno para resolver este problema*/
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.next();
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f%n", aluno.somaNota());
		
		if(aluno.somaNota() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Faltando %.2f pontos%n", aluno.verificacaoAprovacao());
		}else {
			System.out.println("Aprovado");
		}
		
		sc.close();

	}

}
