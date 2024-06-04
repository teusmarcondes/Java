package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class aula6_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// adicionar elementos
		lista.add("Banana");// 1º elemento = 0
		lista.add("Maçã");
		lista.add("Melancia");
		lista.add("Manga");

		lista.remove("Melancia");
		System.out.println("Primeira fruta cadastrada: "
			+ lista.get(0));

		/*
		 * for(String frutas : lista) {
		 * System.out.println("Frutas cadastradas: " + frutas);
		 * }
		 */
		// acessar dinamicamente os elementos usando loop
		// size indica o tamanho da lista
		for (int i = 0; i < lista.size(); i++) {
			String frutas = lista.get(i);
			System.out.println((i + 1) + "º fruta: " + frutas);
		}
	}

}