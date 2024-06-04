package atividadesjoptionpane;

import javax.swing.JOptionPane;

public class sistemafaculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// entrada de dados
		for (int i = 1; i <= 5; i++) {
			String nome = JOptionPane.showInputDialog(null, i + "° Nome");
			String matricula = JOptionPane.showInputDialog(null, i + "° Matrícula");
			String data = JOptionPane.showInputDialog(null, i + "° Data de nascimento");
			String telefone = JOptionPane.showInputDialog(null, i + "° Telefone");

			// saída de dados
			JOptionPane.showMessageDialog(null, "Bem vindo(a) " + nome +
					"\n Matrícula: " + matricula +
					"\n Data de nascimento: " + data +
					"\n Telefone: " + telefone);
			// confirmação dos dados
			int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?",
					"Confirmação", JOptionPane.YES_NO_OPTION);

			if (opcao != JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Você escolheu continuar");
				Object[] opcoes = { "fazer a matrícula", "cancelar a matrícula" };
				String escolha = (String) JOptionPane.showInputDialog(null,
						"Escolha sua opção ", "Opções", JOptionPane.PLAIN_MESSAGE,
						null, opcoes, opcoes[0]);
				JOptionPane.showMessageDialog(null, "Você escolheu " + escolha + ": " + matricula);
			} else {
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
				break;
			}
		}
	}
}