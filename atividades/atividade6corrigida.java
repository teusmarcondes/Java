package atividades;

import java.util.Scanner;

public class atividade6corrigida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String senhaAceita = "123";
		String senhaDigitada;

		System.out.println("Sistema de Autenticação de Pagamento");
		System.out.println("Opções de pagamento");
		System.out.println("[1] Dinheiro");
		System.out.println("[2] Pix");
		System.out.println("[3] Cartão de crédito/débito");

		System.out.print("Escolha uma opção de pagamento: ");
		int pag = sc.nextInt();

		if (pag >= 1 && pag <= 3) {
			if (pag <= 2) {
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