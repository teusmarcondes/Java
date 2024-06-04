package joptionpane;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class aula9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> nomes= new ArrayList<>();
		
		
		//menu
		while(true) {
		String[] opçoes= {"Consulta", "Cadastro", "Sair" };
		int escolha= JOptionPane.showOptionDialog(null, "Escolha uma opção:",
				"Cadastro", 0, JOptionPane.INFORMATION_MESSAGE, null, opçoes, 
				opçoes[0]);

		if(escolha != JOptionPane.CLOSED_OPTION) {
			switch(escolha) {
			
			case 0:
				consultarAlunos(nomes);
				break;
			case 1:
				cadastrarAlunos(nomes);
				break;
			case 2:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				
				
			}
			
		}
		}		
	}

 //método para consultar e exibir os nomes
	private static void consultarAlunos(ArrayList<String> nomes) {
		if(nomes.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado");
		}else {
			String listaAlunos= String.join("\n", nomes);
			JOptionPane.showMessageDialog(null, "Alunos cadastrados: \n"+
			listaAlunos);
		}
	}
	//método para cadastrar novo aluno
	private static void cadastrarAlunos(ArrayList<String> nomes) {
		String nome= JOptionPane.showInputDialog("Digite o nome(a) do aluno(a):");
	 // trim remove os espaços antes e depois da palavra
		if(nome != null && !nome.trim().isEmpty()) {
			nomes.add(nome);
			JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Nome inválido, cadastro cancelado...");
		}
		
	}
}
