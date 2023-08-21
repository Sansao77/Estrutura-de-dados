package faculdade.exercicios.arvore.binario;

public class ArvoreBinaria {
	//Classes para criar ligações
	static class Ligacao {
		int valor;
		Ligacao esquerda;
		Ligacao direita;
		
		public Ligacao(int valor) {
			this.valor = valor;
			esquerda = null;
			direita = null;
		}
		public boolean folha() {
			return esquerda == null? direita == null: false;
		}
	}
	Ligacao raiz;
	public ArvoreBinaria() {
		raiz = null;
	}
}
