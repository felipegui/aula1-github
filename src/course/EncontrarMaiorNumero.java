package course;

import java.util.Scanner;

public class EncontrarMaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite tr�s n�meros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		showResult(maior);

		sc.close();
	}
	
	//usando uma fun��o
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	//usando outra fun��o
	public static void showResult(int valor) {
		System.out.println("O maior n�mero �: " + valor);
	}

}
