package application;

import java.util.Scanner;

public class ExerResolvidoMatriz {

	public static void main(String[] args) { 

		/*Fazer um programa para ler um n�mero inteiro N e uma matriz de
		 * ordem N contendo n�meros inteiros. Em seguida, mostrar a diagonal
		 * principal e a quantidade de valores negativos da matriz*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//declarando uma matriz "n" linhas e "n" colunas(matriz quadr�tica)
		int [][] mat = new int [n][n];
		
		//fazer dois la�os "for" para percorrer as linhas(i) e colunas(j)
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		//mostrar os elementos da diagonal principal
		System.out.println("Diagonal proincipal:");
		
		for(int i = 0; i < mat.length; i++) {
			System.out.print( mat [i][i] + " ");
		}
		
		System.out.println();
		
		//quantidade de elementos negativos
		int count = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat [i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println();
		
		System.out.print("Quantidades de n�meros"
				+ " negativos em toda matriz: " + count);
		
		sc.close();

	}

}
