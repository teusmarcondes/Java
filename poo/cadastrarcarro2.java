package poo;

import java.util.Scanner;

public class cadastrarcarro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criar instâncias do objeto Carro para gerar novos objetos
		Scanner sc= new Scanner(System.in);
		
		for(int i=1; i<=3; i++) {
		System.out.print("Digite o modelo do " + i + "° carro: ");
		String modelo= sc.next();
		System.out.print("Digite o preço do " + i + "°carro: ");
		int preco=sc.nextInt();
		System.out.print("Ano de fabricação do " + i + "°carro: ");
		int ano= sc.nextInt();
		System.out.print("Cor do " + i + "°carro: ");
		String cor= sc.next();
		
		
		carro carro1= new carro(modelo, preco, ano, cor);
		
		
		//cadastro dos objetos
		carro1.exibirInformacoes();
		carro1.calcularSeguro();
		
		
		}
		
	}
}
