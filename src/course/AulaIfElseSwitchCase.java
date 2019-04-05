package course;

import java.util.Scanner;

public class AulaIfElseSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String dia;

		System.out.println("Digite um n�mero correspondente ao dia da semana:");
		int n = sc.nextInt();

		/*
		 * // estrutura condicional if-else encadeados if (n == 1) { dia =
		 * "Segunda feira"; } else if (n == 2) { dia = "Ter�a feira"; } else if (n == 3)
		 * { dia = "Quarta feira"; } else if (n == 4) { dia = "Quinta feira"; } else if
		 * (n == 5) { dia = "Sexta feira"; } else if (n == 6) { dia = "S�bado"; } else
		 * if (n == 7) { dia = "Domingo"; } else { dia = "Dia da semana n�o existe!"; }
		 * System.out.println("Hoje �: " + dia);
		 */

		// estrutura condicional switch-case encadeado
		switch (n) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda feira";
			break;
		case 3:
			dia = "Ter�a feira";
			break;
		case 4:
			dia = "Quarta feira";
			break;
		case 5:
			dia = "Quinta feira";
			break;
		case 6:
			dia = "Sexta feira";
			break;
		case 7:
			dia = "S�bado";
			break;
		default:
			dia = "Dia da semana n�o existe";
		}
		System.out.println("Hoje �: "+dia);

		sc.close();

	}

}
