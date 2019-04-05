package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program5 {

	public static void main(String[] args) {

		/*Fazer um programa para ler o nome de um aluno e as tr�s notas que
		 * ele obteve nos tr�s trimestres do ano(primeiro trimestre vale 30
		 * e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota
		 * final do aluno no ano. Dizer tamb�m se o aluno est� aprovado ou n�o
		 * e em caso de negativo, quantos pontos faltam para o aluno obter o
		 * m�nimo para ser aprovado(que � 60% da nota). Voc� deve criar uma
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
