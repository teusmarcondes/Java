package aulas;

import java.util.Scanner;

public class aula5_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for(int x=1; x < 5; x++) {
		 * System.out.println("Núumero: " + x);
		 * }
		 * System.out.println("Fim");
		 * }
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número para o cálculo: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= 10; i++) {// definir contador
			System.out.println(numero + "X" + i + "=" + numero * i);
		}
	}
}