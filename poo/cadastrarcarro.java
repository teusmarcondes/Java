package poo;

public class cadastrarcarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//criar instâncias do objeto Carro para gerar novos objetos
		
		carro carro1= new carro("Gol", 60000, 2023, "branco");
		carro carro2= new carro("Celta", 30000, 2000, "vermelho");
		carro carro3= new carro("Fusca", 50000, 1980, "bege");
		
		//cadastro dos objetos
		carro1.exibirInformacoes();
		carro1.calcularSeguro();
		carro2.exibirInformacoes();
		carro2.calcularSeguro();
		carro3.exibirInformacoes();
		carro3.calcularSeguro();
		
		
	}
}
