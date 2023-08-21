package faculdade.exercicios.ponteiros;
//FILO -> 'First in, Last out'
public class Pilha {
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
	public static void main(String[] args) {
		Pilha pilha1 = new Pilha();
		pilha1.push(5); pilha1.mostrarPilha(); // Teste 1
		pilha1.push(3); pilha1.mostrarPilha(); // Teste 2
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 3
		pilha1.push(2); pilha1.mostrarPilha(); // Teste 4
		pilha1.push(8); pilha1.mostrarPilha(); // Teste 5
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 6
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 7
		pilha1.push(9); pilha1.mostrarPilha(); // Teste 8
		pilha1.push(1); pilha1.mostrarPilha(); // Teste 9
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 10
		pilha1.push(7); pilha1.mostrarPilha(); // Teste 11
		pilha1.push(6); pilha1.mostrarPilha(); // Teste 12
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 13
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 14
		pilha1.push(4); pilha1.mostrarPilha(); // Teste 15
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 16
		pilha1.pop(); pilha1.mostrarPilha(); // Teste 17
		pilha1.pop(); pilha1.mostrarPilha();
	}
}
