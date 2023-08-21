package faculdade.exercicios.atividade7;

public class Aeroporto {
	Ligacao inicio;
	Ligacao fim;
	
	class Ligacao{
		String nome;
		int index;
		String cor;
		double tamanho;
		Ligacao anterior;
		Ligacao proximo;
		
		public Ligacao(String nome,int index, String cor, double tamanho) {
			this.nome = nome;
			this.index = index;
			this.cor = cor;
			this.tamanho = tamanho;
		}
	}
	
	public void add(String nome,int index, String cor, double tamanho) {
		Ligacao novaLigacao = new Ligacao(nome,index,cor,tamanho);
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
			System.out.printf("Avião '%s' autorizado para decolar\n", inicio.nome);
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
	public void contagem() {
		if(inicio == null) {
			System.out.println("Não a nenhum avião esperando no aeroporto");
			return;
		}
		int i = 0;
		Ligacao atual = inicio;
		while(atual != null) {
			i++;
			atual = atual.proximo;
		}
		System.out.printf("Existem %d aviões esperando no aeroporto\n",i);
	}
	public void mostrarFila() {
		if(inicio == null) {
			System.out.println("Não existe nenhuma fila");
			return;
		}
		Ligacao atual = inicio;
		System.out.println("A Fila contem os aviões:");
		int i = 1;
		while(atual != null) {
			System.out.println(i+ " - "+atual.nome);
			i++;
			atual = atual.proximo;
		}
		System.out.println();
	}
	public void caracteristicas() {
		System.out.printf("\n%s (Caracteristicas):\n1 - %d\n2 - %s\n3 - %.2f\n",
				inicio.nome,inicio.index,inicio.cor,inicio.tamanho);
	}
	
	public static void main(String[] args) {
		Aeroporto aeroporto1 = new Aeroporto();
		aeroporto1.add("Roberto", 0,"vermelho",17.67);
		aeroporto1.add("João", 1,"amarelo",12.47);
		aeroporto1.add("Rodrigo",2, "preto", 27.80);
		aeroporto1.caracteristicas();
		aeroporto1.mostrarFila();
		aeroporto1.contagem();
		aeroporto1.peek();
		aeroporto1.contagem();
		aeroporto1.caracteristicas();
	}
}
