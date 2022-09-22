package view;

import javax.swing.*;

import controller.PilhaInt;

public class Principal {

	public static void main(String[] args) throws Exception{
		PilhaInt p = new PilhaInt();
		
		int decimal = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero decimal menor que 1000 para transformar em bin�rio"));
		
		try {
			if (decimal <= 1000) {
				JOptionPane.showMessageDialog(null, p.ConverteController(decimal));
			} else {
				JOptionPane.showMessageDialog(null, "O n�mero que voc� digitou � maior que 1000. Encerrando aplica��o.");
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
	}
}
