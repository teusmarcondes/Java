package atividades;

import java.util.Locale;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o título do seu livro: ");
		String titulo = sc.nextLine();
		System.out.print("Digite o autor do livro: ");
		String autor = sc.nextLine();
		System.out.print("Digite a editora do seu livro: ");
		String editora = sc.nextLine();
		System.out.print("Digite o ano de publicação do livro: ");
		String ano = sc.next();
		System.out.print("Digite a edição do livro: ");
		String edicao = sc.next();
		System.out.print("Digite o número total de páginas do livro: ");
		String paginas = sc.next();
		System.out.print("Digite a categoria do livro: ");
		String categoria = sc.next();
		System.out.print("Digite o idioma do livro: ");
		String idioma = sc.next();
		System.out.print("Digite o formato do livro: ");
		String formato = sc.next();
		System.out.print("Digite a avaliação do livro: ");
		String avaliacao = sc.next();
		System.out.print("Digite o número de série do livro: ");
		String serie = sc.next();
		System.out.print("Digite o preço do livro: ");
		double preco = sc.nextDouble();
		System.out.print("Digite a quantidade em estoque: ");
		double estoque = sc.nextDouble();
		double total = (preco * estoque);
		System.out.println("");
		Locale.setDefault(Locale.US);
		System.out.println("****CADASTRO****");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Editora: " + editora);
		System.out.println("Publicado em: " + ano);
		System.out.println("Edição do livro: " + edicao);
		System.out.println("Total de páginas: " + paginas);
		System.out.println("Categoria: " + categoria);
		System.out.println("Idioma: " + idioma);
		System.out.println("Formato: " + formato);
		System.out.println("Avaliações: " + avaliacao);
		System.out.println("Número de Série: " + serie);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.printf("Total : R$ %.2f%n", total);

		sc.close();
	}
}
