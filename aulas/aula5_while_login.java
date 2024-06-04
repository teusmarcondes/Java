package aulas;

import java.util.Scanner;

public class aula5_while_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String senhaAceita = "senac123";
		String senhaDigitada;

		while (true) {// loop para solicitar a senha até que seja a correta
			System.out.print("Digite a senha: ");
			senhaDigitada = sc.next();
			if (senhaDigitada.equals(senhaAceita)) {
				System.out.println("login bem-sucedido!");
				break;
			} else {
				System.out.println("Senha inválida. Tente novamente");
			}
		}
		// se login bem-sucedido
		System.out.println("Bem vindo ao Senac...");
	}

}