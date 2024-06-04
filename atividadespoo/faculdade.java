package atividadespoo;

public class faculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// criar instâncias do objeto Carro para gerar novos objetos
		aluno Aluno1 = new aluno("Mateus", 10070, "22/02/2000", "(41)99986-5453");
		aluno Aluno2 = new aluno("Adriano", 58050, "20/02/1998", "(42)99599-8826");
		aluno Aluno3 = new aluno("Richard", 046067, "25/03/2003", "(46)99854-9132");
		aluno Aluno4 = new aluno("Josias", 10020, "28/09/2004", "(41)99765-1041");
		aluno Aluno5 = new aluno("Coraline", 79504, "30/10/1999", "(43)99173-7069");

		// cadastro dos objetos
		Aluno1.exibirInformacoes();
		Aluno1.cadastro();
		Aluno1.cancelar();
		Aluno2.exibirInformacoes();
		Aluno2.cadastro();
		Aluno2.cancelar();
		Aluno3.exibirInformacoes();
		Aluno3.cadastro();
		Aluno3.cancelar();
		Aluno4.exibirInformacoes();
		Aluno4.cadastro();
		Aluno4.cancelar();
		Aluno5.exibirInformacoes();
		Aluno5.cadastro();
		Aluno5.cancelar();
	}

}
