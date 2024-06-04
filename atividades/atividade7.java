package atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		ArrayList<Integer> lista2 = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o nome do " + i + "º cliente: ");
			String nome = sc.next();
			lista.add(nome);
			System.out.print("Digite a idade do " + i + "º cliente: ");
			Integer idade = sc.nextInt();
			lista2.add(idade);
			System.out.println("");
		}
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			String nomes = lista.get(i);
			Integer idades = lista2.get(i);
			System.out.println("Nome do " + (i + 1) + "º " + "cliente: " + nomes + "|idade: " + idades);
		}

		sc.close();
	}
}