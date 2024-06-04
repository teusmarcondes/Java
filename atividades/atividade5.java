package atividades;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Sistema Biblioteca=======");
		System.out.print("Usuário: ");
		String user = sc.next();
		System.out.print("Senha: ");
		String password = sc.next();
		if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
			System.out.println("");
			System.out.println("Bem vindo(a) ao sistema!");
			System.out.println("");
			System.out.println("Escolha a opção desejada:");
			System.out.println("1- Consultar Livros");
			System.out.println("2- Empréstimos");
			System.out.println("3- Multas");
			System.out.println("4- Sair");
			System.out.println("");
			System.out.print("--> Sua opção: ");
			int escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.println("");
				System.out.println("Escolha uma das opções abaixo");
				System.out.println("");
				System.out.println("Livros disponíveis:");
				System.out.println("Livro 1- Introduction to Algorithms");
				System.out.println("Livro 2- O Programador Apaixonado");
				System.out.println("Livro 3- Programação Web com plataforma Java");
				System.out.println("Livro 4- Java: Como Programar");
				System.out.println("Livro 5- Java para iniciantes");
			} else if (escolha == 2) {
				System.out.println("");
				System.out.println("1 para: Introduction to Algorithms");
				System.out.println("2 para: O Programador Apaixonado");
				System.out.println("3 para: Programação Web com plataforma Java");
				System.out.println("4 para: Java: Como Programar");
				System.out.println("5 para: Java para iniciantes");
				System.out.println("");
				System.out.print("Escolha o livro que deseja emprestar: ");
				int livro = sc.nextInt();
				if (livro == 1) {
					System.out.println("");
					System.out.println("--> Você escolheu: Livro 1- Introduction to Algorithms");
				} else if (livro == 2) {
					System.out.println("");
					System.out.println("--> Você escolheu: Livro 2- O Programador Apaixonado");
				} else if (livro == 3) {
					System.out.println("");
					System.out.println("--> Você escolheu: Livro 3- Programação Web com plataforma Java");
				} else if (livro == 4) {
					System.out.println("");
					System.out.println("--> Você escolheu: Livro 4- Java: Como Programar");
				} else if (livro == 5) {
					System.out.println("");
					System.out.println("--> Você escolheu: Livro 5- Java para iniciantes");
				} else {
					System.out.println("");
					System.out.println("--> Opção inválida. Tente novamente.");
				}
			} else if (escolha == 3) {
				System.out.println(
						"De acordo com nossas políticas de empréstimo e devolução, será aplicada uma multa de R$1,00 por cada dia de atraso.");
			} else if (escolha == 4) {
				System.out.println("Você escolheu sair do sistema...");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		} else {
			System.out.println("");
			System.out.println("Usuário e ou senha incorretos.");
		}

		sc.close();

	}
}