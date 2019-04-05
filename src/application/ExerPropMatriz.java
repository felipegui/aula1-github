package application;

import java.util.Scanner;

public class ExerPropMatriz {

	public static void main(String[] args) {

		/*Fazer um programa para ler dois números inteiros M e N, e depois
		 * ler uma matriz de M linhas por N colunas contendo números inteiros,
		 * podendo haver repetições. Em seguida, ler um número inteiro X que
		 * pertence à matriz. Para cada ocorrência de X, mostrar os valores
		 * à esquerda, acima, à direita e abaixo de X, quando houver, conforme
		 * exemplo*/
		
		//entrada para leitura do dois dados m e n
		Scanner sc = new Scanner(System.in);
		
		//captura dos dados digitados no teclado
		int m = sc.nextInt();
		
		int n = sc.nextInt();
		
		//declarando a matriz
		int [][] mat = new int [m][n];
		
		//percorrendo a matriz toda
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}
		
		//pegar um elemento pertencete a matriz criada e gerada
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Posição " + i + "," + j + ":");
					if(j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Em cima: " + mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("Em baixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();

	}

}
