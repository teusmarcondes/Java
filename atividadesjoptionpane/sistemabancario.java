package atividadesjoptionpane;

import javax.swing.JOptionPane;

public class sistemabancario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo = 0;

		while (true) {
			String[] opcoes = { "Consultar Saldo", "Realizar Depósito",
					"Realizar Saque", "Sair" };
			int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:",
					"Sistema Bancário", 0, JOptionPane.INFORMATION_MESSAGE, null,
					opcoes, opcoes[0]);

			if (escolha != JOptionPane.CLOSED_OPTION) {
				switch (escolha) {

					case 0:
						JOptionPane.showMessageDialog(null, "Saldo atual: R$" + saldo);
						break;
					case 1:
						try {
							String depositoStr = JOptionPane.showInputDialog("Digite o valor para depósito:");
							double deposito = Double.parseDouble(depositoStr);
							JOptionPane.showMessageDialog(null,
									"Depósito de R$" + deposito + " realizado com sucesso!");
							saldo += deposito;
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.",
									"Erro", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						try {
							String saqueStr = JOptionPane.showInputDialog("Digite o valor para depósito:");
							double saque = Double.parseDouble(saqueStr);
							if (saque <= saldo) {
								JOptionPane.showMessageDialog(null, "Saque de R$" + saque + " realizado com sucesso!");
								saldo -= saque;
							} else {
								JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.",
										"Erro", JOptionPane.ERROR_MESSAGE);
							}
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Digite um valor numérico válido.",
									"Erro", JOptionPane.ERROR_MESSAGE);
						}
						break;

					case 3:
						System.exit(0);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida");
						break;
				}
			}
		}
	}
}