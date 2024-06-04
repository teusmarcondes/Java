package aulas;

import java.util.Scanner;

public class aula5_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		// enquanto estiver fora do intervalo
		while (true) {
			System.out.print("Digite um número: ");
			num = sc.nextInt();
			// aceita números entre 1 e 10
			if (num >= 1 && num <= 10) {
				System.out.println("O número é válido");
				break;
			} else {
				System.out.println("número inválido. Tente novamente");
			}

		}
		System.out.println("Programa finalizado");
		sc.close();
	}
}