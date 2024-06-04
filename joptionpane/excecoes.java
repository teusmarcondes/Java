package joptionpane;

import javax.swing.JOptionPane;

public class excecoes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String numeroStr= JOptionPane.showInputDialog("Digite um número:");
			int numero= Integer.parseInt(numeroStr);
			/*para converter para double
			 double numero= Double.parseDouble(numeroStr)*/
			JOptionPane.showMessageDialog(null, "Número digitado: " + numero);
		}catch(NumberFormatException e) {
		JOptionPane.showMessageDialog(null, "Por favor, insira um número válido",
					"Erro", JOptionPane.ERROR_MESSAGE);
			
		}
		
	}

}
