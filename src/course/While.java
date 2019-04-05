package course;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número e será calculado sua raiz quadrática: ");
		double n = sc.nextDouble();
		
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.println(sr);
			System.out.print("Digite outro número: ");
			n = sc.nextDouble();
		}
		System.out.println("Aparentemente não existe raiz de número negativo para " + n);
		
		sc.close();

	}

}
