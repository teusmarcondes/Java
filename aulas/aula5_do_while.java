package aulas;

import java.util.Scanner;

public class aula5_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char resposta;
		// multiplicar um número por 2
		do {
			System.out.print("Digite um número: ");
			double numero = sc.nextDouble();
			double calculo = numero * 2;
			System.out.println("Total: " + calculo);
			System.out.println("Deseja fazer um novo cálculo(s/n)?");
			resposta = sc.next().charAt(0);
		} while (resposta == 's');// condição respota do usuário
		System.out.println("consulta encerrada");
		sc.close();

	}

}