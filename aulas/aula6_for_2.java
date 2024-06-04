package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class aula6_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista = new ArrayList<>();

		// lista do tipo int
		ArrayList<Integer> verduras = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// adicionar elementos
		for (int i = 1; i <= 4; i++) {
			System.out.print("Digite a " + i + "ª futa: ");
			String fruta = sc.next();
			lista.add(fruta);

		}
		lista.remove(lista.get(0));
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