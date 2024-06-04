package aulas;

import java.util.Locale;
import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		// comando para saída de dados
		// habilita interação no Console
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();// leitura de dados para o tipo String
		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();// leitura de dados para valores inteiros
		System.out.print("Digite sua altura: ");
		float altura = sc.nextFloat();
		System.out.print("Digite seu sexo: ");
		char sexo = sc.next().charAt(0);// leitura de dados para 1 caractere
		Locale.setDefault(Locale.US);
		System.out.println("******Resultado******");
		System.out.println("Bem-vindo(a)," + nome);
		System.out.println("Sua idade: " + idade);
		// para quebra de linhas com o printf, usar o %n
		// concatenar(juntar teto e variável) usar , no lugar do +
		System.out.printf("Altura: %.2f%n", altura);// saída formatada
		System.out.println("Sexo: " + sexo);

		sc.close();// fechar o método evita problemas
	}
}
