package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExercicioFixacaoLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		//Parte 1 - Dados de leitura:
		System.out.print("Quantos funcionários serão registrados? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			System.out.println();
			System.out.print("Funcionário #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario  = sc.nextDouble();
			list.add(new Funcionario(id, nome, salario));
		}
		
		//Parte 2 - Atualizando o salário do funcionário:
		System.out.println();
		System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == id ).findFirst().orElse(null);
		if(func == null) {
			System.out.print("Este id não existe!");
			System.out.println();
		}else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.aumentarSalario(porcentagem);
		}
		
		//Parte 3 - Lista dos colaboradores:
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for(Funcionario obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
