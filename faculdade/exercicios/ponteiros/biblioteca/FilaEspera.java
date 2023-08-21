package faculdade.exercicios.ponteiros.biblioteca;

public class FilaEspera {
	Ligacao inicio;
	Ligacao fim;
	
	class Ligacao{
		String index;
		Ligacao anterior;
		Ligacao proximo;
		
		public Ligacao(String index) {
			this.index = index;
		}
	}
	
	public void add(String index) {
		Ligacao novaLigacao = new Ligacao(index);
		if(inicio == null) {
			inicio = fim = novaLigacao;
			inicio.anterior = null;
			inicio.proximo = null;
		}
		else {
			fim.proximo = novaLigacao;
			novaLigacao.anterior = fim;
			fim = novaLigacao;
			fim.proximo = null;
		}
	}
	public void peek() {
		if(inicio == null) {
			return;
		}
		else {
			if(inicio == fim) {
				inicio = fim = null;
			}
			else {
				inicio = inicio.proximo;
				if(inicio.proximo != null) {
					inicio.proximo.anterior = inicio.anterior;
				}
				if(inicio.anterior != null) {
					inicio.anterior.proximo = inicio.proximo;
				}
				return;
			}
		}
	}
	public void mostrarFila() {
		if(inicio == null) {
			System.out.println("Não existe nenhuma fila");
			return;
		}
		int i = 1;
		Ligacao atual = inicio;
		System.out.println("A Fila de espera (Usuários):");
		while(atual != null) {
			System.out.println(i + " - " + atual.index);
			i++;
			atual = atual.proximo;
		}
	}
	public boolean filaVazia() {
		if(inicio != null) {
			return false;
		}
		return true;
	}
}
