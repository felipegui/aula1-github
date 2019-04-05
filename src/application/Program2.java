package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		
		System.out.print("Nome: ");
		String name = sc.nextLine().toUpperCase();
		
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("alterado");
		System.out.println("Acessar o atributo: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Acessar o atributo: " + product.getPrice());
		
		System.out.println();
		System.out.println("Dados do produto: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos a serem adicionados em estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ product);
		
		System.out.println();
		System.out.print("Digite o número de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ product);
		
		
		sc.close();

	}

}
