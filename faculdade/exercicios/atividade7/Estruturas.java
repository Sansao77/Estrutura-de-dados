package faculdade.exercicios.atividade7;

public class Estruturas {
	static Fila fila = new Fila();
	static Pilha pilha = new Pilha();
	
	public static void main(String[] args) {
		fila.add(0);fila.add(1);fila.add(2);fila.add(3);fila.add(4);
		pilha.push(0); pilha.push(1); pilha.push(2); pilha.push(3); pilha.push(4);
		for(char i = 'a'; i < 'd'; i++) {
			System.out.printf("\n%c:\n",i);
			switch(i) {
			case 'a':
				pilha.mostrarPilha();
				fila.mostrarFila();
				break;
			case 'b': fila.mostrarFila();
				break;
			case 'c': pilha.mostrarPilha();
				break;
			}
		}
	}
}
class Fila{
	Ligacao inicio;
	Ligacao fim;
	
	class Ligacao{
		int index;
		Ligacao anterior;
		Ligacao proximo;
		
		public Ligacao(int index) {
			this.index = index;
		}
	}
	
	public void add(int index) {
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
		Ligacao atual = inicio;
		System.out.println("A Fila contem:");
		while(atual != null) {
			System.out.println(atual.index);
			atual = atual.proximo;
		}
	}
}
class Pilha{
	Ligacao topo;
	Ligacao fundo;
	class Ligacao{
		int index;
		Ligacao anterior;
		Ligacao proximo;
		
		public Ligacao(int index) {
			this.index = index;
		}
	}
	
	public void push(int index) {
		Ligacao novaLigacao = new Ligacao(index);
		if(topo == null) {
			topo = fundo = novaLigacao;
			topo.anterior = null;
			topo.proximo = null;
		}
		else {
			fundo.proximo = novaLigacao;
			novaLigacao.anterior = fundo;
			fundo = novaLigacao;
			fundo.proximo = null;
		}
	}
	public void pop() {
		if(fundo == null) {
			return;
		}
		else {
			if(fundo == topo) {
				fundo = topo = null;
			}
			else {
				fundo = fundo.anterior;
				if(fundo.proximo != null) {
					fundo.proximo.anterior = fundo.anterior;
				}
				if(fundo.anterior != null) {
					fundo.anterior.proximo = fundo.proximo;
				}
			}
			return;
		}
	}
	public void mostrarPilha() {
		if(topo == null) {
			System.out.println("Não existe nenhuma pilha");
			return;
		}
		Ligacao atual = fundo;
		System.out.println("A Pilha contem:");
		while(atual != null) {
			System.out.println(atual.index);
			atual = atual.anterior;
		}
		System.out.println();
	}
}