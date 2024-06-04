package aulas;

import java.util.Scanner;

public class aula3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Usuário: ");
		String user = sc.next();
		System.out.print("Senha: ");
		String password = sc.next();
		// equalsIgnoreCase serve para comparar valores de Strings
		if ((user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("admin23"))
				&& password.equalsIgnoreCase("123")) {
			System.out.print("Digite sua idade: ");
			int idade = sc.nextInt();

			// condição lógica: saber se o usuário é maior de 18 anos
			if (idade >= 18 && idade <= 60) {// idade entre 18 e 60 anos
				System.out.println("Maior de idade");// se verdade
				System.out.print("Escolha um curso: (1- Java 2- HTML 3- JS)");
				int escolha = sc.nextInt();
				if (escolha == 1) {
					System.out.println("Você escolheu o curso Java");
				} else if (escolha == 2) {
					System.out.println("Você escolheu o curso HTML");
				} else if (escolha == 3) {
					System.out.println("Você escolheu o curso JS");
				} else {
					System.out.println("opção inválida, escolha entre 1 e 3...");
				}
			} else if (idade < 18) {
				System.out.println("Menor de idade");
			} else {
				System.out.println("Idade não permitida");// se falso

			}
			sc.close();
		} else {
			System.out.println("Usuário e ou senha incorretos.");
		}
	}
}