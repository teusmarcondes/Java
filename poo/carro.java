package poo;

public class carro {
		//atributos são as variáveis
		String modelo;
		int preço;
		int anoFabricacao;
		String cor;
		
		//Construtor
		/*para gerar o método construtor: botão direito
		do mouse --> Source --> Generate Construtor
		using Fields...*/
		public carro(String modelo, int preço, int anoFabricacao, String cor) {
			super();
			this.modelo = modelo;
			this.preço = preço;
			this.anoFabricacao = anoFabricacao;
			this.cor = cor;
			
		/*getters e setters para acessar e modificar os valores 
		dos atributos
		para gerar: botão direito do mouse --> Source --> Generate Getters 
		and setters*/			
			
		}
		public String getModelo() {
			return modelo;
		}



		public void setModelo(String modelo) {
			this.modelo = modelo;
		}



		public int getPreço() {
			return preço;
		}



		public void setPreço(int preço) {
			this.preço = preço;
		}



		public int getAnoFabricacao() {
			return anoFabricacao;
		}



		public void setAnoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}



		public String getCor() {
			return cor;
		}



		public void setCor(String cor) {
			this.cor = cor;
		}

		//método para exibir informações do carro
		//quando void significa que vai retornar algo
		void exibirInformacoes() {
			System.out.println("Modelo: " + modelo);
			System.out.println("Preço: "+ preço);
			System.out.println("Ano de fabricação: "+ anoFabricacao);
			System.out.println("Cor: "+ cor);
		}
		

		//método com a lógica para calcular o valor do seguro
		double calcularSeguro() {
			double seguro= preço * 0.10;
			System.out.println("Valor do seguro: " + seguro);
			System.out.println("**************************************");
			return seguro;
		}	
		
	}