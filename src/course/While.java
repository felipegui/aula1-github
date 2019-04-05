package course;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero e ser� calculado sua raiz quadr�tica: ");
		double n = sc.nextDouble();
		
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.println(sr);
			System.out.print("Digite outro n�mero: ");
			n = sc.nextDouble();
		}
		System.out.println("Aparentemente n�o existe raiz de n�mero negativo para " + n);
		
		sc.close();

	}

}
