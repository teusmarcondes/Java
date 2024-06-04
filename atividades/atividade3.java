package atividades;

import java.util.Locale;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double preco = (50.50);
		double desconto = (0.08);
		System.out.print("Qual a quantidade do produto? : ");
		double quantidade = sc.nextDouble();
		double precod = (preco - (preco * desconto));
		double totalv = (precod * quantidade);
		Locale.setDefault(Locale.US);
		System.out.println("");
		System.out.println("****TOTAL A PAGAR****");
		System.out.println("Produto: Bola de Basquete");
		System.out.println("Preço: R$ " + preco);
		System.out.println("Desconto: " + desconto);
		System.out.printf("Preço com desconto: R$ %.2f%n", precod);
		System.out.println("Quantidade: " + quantidade);
		System.out.printf("Total a pagar: R$ %.2f%n", totalv);

		sc.close();
	}

}
