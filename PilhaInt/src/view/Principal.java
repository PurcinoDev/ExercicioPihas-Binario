package view;

import javax.swing.*;

import controller.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception{
		PilhaInt p = new PilhaInt();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um número decimal menor que 1000 para transformar em binário"));
		
		try {
			if (decimal <= 1000) {
				JOptionPane.showMessageDialog(null, p.ConverteController(decimal));
			} else {
				JOptionPane.showMessageDialog(null, "O número que você digitou é maior que 1000. Encerrando aplicação.");
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
