package aulas;

import java.util.Scanner;

public class aula5_for2 {

	public static void main(String[] args) {
		// leitura de 4 notas e mostrar média
		Scanner sc = new Scanner(System.in);
		double nota, soma = 0, media;

		for (int i = 1; i <= 4; i++) {
			System.out.print("Nota " + i + ":");
			nota = sc.nextDouble();
			soma += nota;
		}
		media = soma / 4;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		sc.close();

	}

}
