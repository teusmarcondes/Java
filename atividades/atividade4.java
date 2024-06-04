package atividades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date();
		Locale localeBrasil = new Locale("pt", "BR");
		Scanner sc = new Scanner(System.in);
		System.out.println("***Bem-vindo a Lanchonete Senac***");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy", localeBrasil);
		System.out.println("-> Data do pedido: " + dataFormatada.format(data));
		System.out.println("[1] Calzone -> R$: 5,00");
		System.out.println("[2] Doce do dia -> R$: 7,00");
		System.out.println("[3] Pão de Queijo -> R$: 2,50");
		System.out.println("[4] Bolo de chocolate -> R$: 7,00");
		System.out.println("**********************************");
		System.out.println("");
		System.out.print("Digite a opção escolhida: ");
		int escolha = sc.nextInt();
		switch (escolha) {
			case 1:
				double preco1 = (5.00);
				System.out.print("Quantos calzones você deseja comprar?: ");
				double quantidade1 = sc.nextDouble();
				double total = (preco1 * quantidade1);
				System.out.printf("-> Total a pagar: R$ %.2f%n", total);
				System.out.println("");
				System.out.println("Obrigado por escolher a Lanchonete Senac!");
				break;
			case 2:
				double preco2 = (7.00);
				System.out.print("Quantos doces do dia você deseja comprar?: ");
				double quantidade2 = sc.nextDouble();
				double total2 = (preco2 * quantidade2);
				System.out.printf("-> Total a pagar: R$ %.2f%n", total2);
				System.out.println("");
				System.out.println("Obrigado por escolher a Lanchonete Senac!");
				break;
			case 3:
				double preco3 = (2.50);
				System.out.print("Quantos pães de queijo você deseja comprar?: ");
				double quantidade3 = sc.nextDouble();
				double total3 = (preco3 * quantidade3);
				System.out.printf("-> Total a pagar: R$ %.2f%n", total3);
				System.out.println("");
				System.out.println("Obrigado por escolher a Lanchonete Senac!");
				break;
			case 4:
				double preco4 = (7.00);
				System.out.print("Quantos bolos de chocolate você deseja comprar?: ");
				double quantidade4 = sc.nextDouble();
				double total4 = (preco4 * quantidade4);
				System.out.printf("-> Total a pagar: R$ %.2f%n", total4);
				System.out.println("");
				System.out.println("Obrigado por escolher a Lanchonete Senac!");
				break;
			default:
				System.out.print("Opção Inválida, tente novamente e digite um número de 1 a 4");
				break;
		}
		sc.close();
	}

}
