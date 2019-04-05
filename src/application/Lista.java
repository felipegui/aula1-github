package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//inserindo um novo elemento na lista
		list.add(2, "Marco");

		//exibindo a lista
		for (String x : list) {
			System.out.println("- " + x);
		}
		// ver tamanho da lista
		System.out.println("Tamanho da lista: " + list.size());

		System.out.println("-----------------------");
		// remover um elemento da lista diretamente
		// list.remove(1);

		// remover um elemento específico da lista
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println("- " + x);
		}
		System.out.println("Tamanho da lista: " + list.size());
		
		System.out.println("-----------------------");
		
		//verificar a posição do elemento na lista
		//OBS: quando o elemento não é encontrado na lista, retorna: -1
		System.out.println("Índice do Bob: " + list.indexOf("Bob"));
		
		System.out.println("-----------------------");
		
		/*filtar todos os elementos da lista
		 *que comecem com um tipo característico de por exemplo: */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		
		/*Achar o primeiro elemento da lista (busca personalizada)*/
		String nome = list.stream().filter(x -> x.charAt(0) == 'L' ).findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
