package application;

import java.util.Locale;
import java.util.Scanner;

import util.CadastroConta;


public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite o nome do titular da conta: ");
		String nomeTitular = sc.nextLine();
		
		System.out.print("Deseja realizar um deposito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		CadastroConta cc;
		
		if(resposta == 's') {
			System.out.print("Qual o valor para deposito? ");
			double valor = sc.nextDouble();
			cc = new CadastroConta(numeroConta, nomeTitular, valor);
		}else {
			cc = new CadastroConta(numeroConta, nomeTitular);
		}
		
		System.out.println();
		
		System.out.println("Dados da conta:");
		
		System.out.println(cc);
		
		System.out.println();
		
		System.out.print("Inisira um valor para deposito: ");
		double deposito = sc.nextDouble();
		
		cc.depositos(deposito);
		System.out.println();
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(cc);
		
		System.out.println();
		
		System.out.print("Insira o valor de retirada: ");
		double retirada = sc.nextDouble();
		
		cc.saques(retirada);
		System.out.println();
		
		System.out.println("Dados atualizados da conta:");
		System.out.println(cc);
		sc.close();

	}

}
