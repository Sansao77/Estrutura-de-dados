package faculdade.exercicios.ponteiros;

public class Fila {
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
	public static void reverterFila(Fila fila, Fila filaReversa) {
		while(fila.fim != null) {
			filaReversa.add(fila.fim.index);
			fila.fim = fila.fim.anterior;
		}
	}
	public static void intercalarFilas(Fila fila1, Fila fila2, Fila fila3) {
		while(fila1.inicio != null) {
			fila3.add(fila1.inicio.index);
			fila1.inicio = fila1.inicio.proximo;
		}
		if(fila1 == fila2) {return;}
		while(fila2.inicio != null) {
			fila3.add(fila2.inicio.index);
			fila2.inicio = fila2.inicio.proximo;
		}
	}
	public static void main(String[] args) {
		Fila fila1 = new Fila();
		Fila fila2 = new Fila();
		Fila fila3 = new Fila();
		fila1.add(15);
		fila1.add(20);
		fila1.add(25);
		fila1.add(30);
		fila1.mostrarFila();
		reverterFila(fila1,fila2);
		fila2.mostrarFila();
		fila2.peek();
		fila2.mostrarFila();
		intercalarFilas(fila1,fila2,fila3);
		fila3.mostrarFila();
	}
}
