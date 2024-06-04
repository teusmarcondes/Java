package aulas;

import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("****Sistema de Login****");
		// importar a classe Scanner para leitura de dados e interação
		// usuário
		Scanner sc = new Scanner(System.in);
		// entrada de dados
		System.out.print("Usuário: ");
		String user = sc.nextLine(); // nextLine()faz a leitura da linha
		// inteira
		System.out.print("Senha: ");
		String password = sc.next();// next () faz a leitura de uma palavra
		System.out.println("Bem-vindo (a), " + user);
		System.out.print("Informe a Nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Informe a Nota 2: ");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		System.out.println("Média do(a) aluno(a):" + media);

		sc.close();

	}
}
