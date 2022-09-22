package controller;

import br.com.leandrocolevati.pilhaint.Pilha;

public class PilhaInt {
	
	public PilhaInt() {
		super();
	}
	
	public String ConverteController(int decimal) throws Exception {
			Pilha pilha = new Pilha();
			String conversao = "";
			
			decToBin(decimal, pilha);
			
			while (pilha.isEmpty() == false) {
				conversao += Integer.toString(pilha.pop());
			}
			
			return conversao;
	}
	
	private int decToBin(int decimal, Pilha pilha) {
		if (decimal == 0 || decimal == 1) {
			pilha.push(decimal);
			return 0;
		} else {
			pilha.push(decimal % 2);
			return decToBin(decimal / 2, pilha);
		}
	}
}
