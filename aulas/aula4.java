package aulas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class aula4 {

	public static void main(String[] args) {
		// Estrutura switch case
		Date data = new Date();// retorna a data do sistema
		Locale localeBrasil = new Locale("pt", "BR");
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o dia da semana entre 1 a 7: ");
		int dia = sc.nextInt();
		String diaDaSemana = "";
		switch (dia) {
			case 1:
				diaDaSemana = "Domingo";
				break;
			case 2:
				diaDaSemana = "Segunda-feira";
				break;
			case 3:
				diaDaSemana = "Terça-feira";
				break;
			case 4:
				diaDaSemana = "Quarta-feira";
				break;
			case 5:
				diaDaSemana = "Quinta-feira";
				break;
			case 6:
				diaDaSemana = "Sexta-feira";
				break;
			case 7:
				diaDaSemana = "Sábado";
				break;
			default: // se falso
				diaDaSemana = "Dia inválido";
				break;
		}
		// imprime o resultado
		System.out.println("O dia " + dia + " é " + diaDaSemana);
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy", localeBrasil);
		System.out.println("Data de hoje: " + dataFormatada.format(data));
		sc.close();

	}

}
