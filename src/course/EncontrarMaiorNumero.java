package course;

import java.util.Scanner;

public class EncontrarMaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		showResult(maior);

		sc.close();
	}
	
	//usando uma função
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
	
	//usando outra função
	public static void showResult(int valor) {
		System.out.println("O maior número é: " + valor);
	}

}
