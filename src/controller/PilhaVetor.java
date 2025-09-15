package controller;

import br.gui.pilhaint.Pilha;

public class PilhaVetor {
	
	Pilha pilha = new Pilha();
	
	public void condicao(int[] vetor) {
		int tamanho = vetor.length - 1;
		for(int i = 0; i < tamanho; i++) {
			if (vetor[i] >= 0) {
				pilha.push(vetor[i]);
			} else if (vetor[i] < 0) {
				try {
					int v1 = pilha.pop();
					int v2 = pilha.pop();
					pilha.push(vetor[i]);
					pilha.push(v1 + v2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Quantidade de valores na pilha: " + pilha.size());
	}
}
