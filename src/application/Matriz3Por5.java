package application;

import java.util.Scanner;

public class Matriz3Por5 {

	public static void main(String[] args) {
		
		/*Fazer uma matriz 3x5 adicionando valores
		 * inteiros aleatórios. Motrar valores
		 * que se repetem e mostrar também sua
		 * posição na matriz*/
		
		//Entrada de dados pelo teclado
		Scanner sc = new Scanner(System.in);
		
		//Informar o tamanho da matriz
		System.out.print("Informe o tamanho da matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		//Declarando uma matriz
		int [][] matriz = new int [m][n];
		
		//Percorrer a matriz por completo
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz [i][j] = sc.nextInt(); 				
			}
		}
		
		//Pular linha
		System.out.println();
		
		//Digitar o elemento que mais se repeti na matriz
		System.out.println("Digitar o número que mais se repeti na matriz à cima: ");
		int x = sc.nextInt();
		
		//Fazer outra varredura dentro na matriz para buscar o elemento repetitivo e mostrar
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz [i][j] == x) {
					System.out.println("Posição: " + i + "," + j);
					System.out.println();
					if(j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(j > 0) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(j > 0) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
					
					System.out.println();
					
					if(i > 0) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Em cima: " + matriz[i-1][j]);
					}
					if(i > 0) {
						System.out.println("Abaixo: " + matriz[i+1][j]);
					}
					
					System.out.println();
					
					if(i < 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if(i < 0) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if(i < 0) {
						System.out.println("Em cima: " + matriz[i-1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
