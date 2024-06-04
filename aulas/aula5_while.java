package aulas;

import java.util.Scanner;

public class aula5_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// loop continua até que o número 10 seja lido
		while (true) {// enquanto for verdade
			System.out.print("Digite um número:");
			int num = sc.nextInt();
			if (num == 10) {// sai do loop quando o 10 aparecer
				System.out.println("número aceito");
				break;
			}
		}
		System.out.println("Programa finalizado");
	}
}