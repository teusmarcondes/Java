package atividadespoo;

public class aluno {
	// atributos são as variáveis
	String nome;
	int matricula;
	String data;
	String telefone;

	// Construtor
	public aluno(String nome, int matricula, String string, String telefone) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.data = string;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// getters e setters

	// método para exibir informações do carro
	// quando void significa que vai retornar algo
	void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Data de nascimento: " + data);
		System.out.println("Telefone: " + telefone);
	}

	// método com a lógica para matrícula
	int cadastro() {
		System.out.println("************************************************");
		System.out.println(("Aluno: ") + nome + (" cadastrado com sucesso!"));
		return matricula;
	}

	// método com a lógica para cancelar a matrícula
	int cancelar() {
		System.out.println("=================================================");
		System.out.println(("Matrícula: ") + matricula + (" cancelada!"));
		System.out.println("=================================================");
		System.out.println("");
		return matricula;
	}
}
