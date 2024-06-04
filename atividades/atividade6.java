package atividades;

import java.util.Scanner;

public class atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("*******************************");

		String senhaAceita = "1234";
		String senhaDigitada;
		System.out.println("Opções de Pagamento: ");
		System.out.println("-> 1- Dinheiro");
		System.out.println("-> 2- PIX");
		System.out.println("-> 3- Cartão de crédito/débito");
		System.out.println("*******************************");
		System.out.println("");
		System.out.print("-> Digite o número da sua opção: ");

		int num = sc.nextInt();

		if (num >= 1 && num <= 3) {
			if (num <= 2) {
				System.out.println("Pagamento bem sucedido");
			} else {
				System.out.println("Cartão de débito/crédito");
				boolean senhaCorreta = false;
				for (int tentativa = 1; tentativa <= 3; tentativa++) {
					System.out.print("Digite a senha: ");
					senhaDigitada = sc.next();
					if (senhaDigitada.equals(senhaAceita)) {
						System.out.println("Pagamento bem sucedido");
						senhaCorreta = true;
						break;
					} else {
						System.out.println("Senha inválida. Tente novamente (" + tentativa + "/3)");
					}
				}

				if (!senhaCorreta) {
					System.out.println("Cartão bloqueado");
				}
			}
		} else {
			System.out.println("Opção inválida. Escolha uma opção válida.");
		}

		System.out.println("Programa finalizado");
		sc.close();
	}
}