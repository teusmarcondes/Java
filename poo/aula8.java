package poo;

import javax.swing.JOptionPane;

public class aula8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//entrada de dados	
	String nome= JOptionPane.showInputDialog(null, "Nome");
	//saída de dados
	JOptionPane.showMessageDialog(null, "Bem vindo(a) " + nome);
	//confirmação dos dados
	int opcao= JOptionPane.showConfirmDialog(null, "Deseja continuar?", 
			"Confirmação", JOptionPane.YES_NO_OPTION);
			
			if(opcao == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Você escolheu continuar");
				Object[] sexo= {"Escolha uma opção","Feminino", "Masculino", "Outro"};
				String escolha= (String) JOptionPane.showInputDialog(null,
				"Escolha seu sexo ", "Sexo", JOptionPane.PLAIN_MESSAGE,
				null, sexo, sexo[0]);
				JOptionPane.showMessageDialog(null, "Você escolheu " + escolha);
						
			}else {
				JOptionPane.showMessageDialog(null, "Saindo do programa...");
			}
			
			
			
			
	}

}
