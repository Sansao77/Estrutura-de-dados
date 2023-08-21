package faculdade.exercicios.ponteiros;

public class ListaLigadaDupla {
	Ligacao cabeca = null;
	Ligacao cauda = null;
	//Cria os Node da lista
	class Ligacao{
		int index;
		Ligacao anterior;
		Ligacao proximo;
		
		public Ligacao(int index) {
			this.index = index;
		}
	}
	//Adiciona os valores da lista
	public void adicionar(int index) {
		Ligacao novaLigacao = new Ligacao(index);
		if(cabeca == null) {
			cabeca = cauda = novaLigacao;
			cabeca.anterior = null;
			cabeca.proximo = null;
		}
		else {
			cauda.proximo = novaLigacao;
			novaLigacao.anterior = cauda;
			cauda = novaLigacao;
			cauda.proximo = null;
		}
	}
	//Remover os elementos da lista em relação a sua posição
	public void remover(Ligacao deletar) {
		if(cabeca == null || deletar == null) {
			return;
		}
		
		if(cabeca == deletar) {
			cabeca = deletar.proximo;
		}
		if(deletar.proximo != null) {
			deletar.proximo.anterior = deletar.anterior;
		}
		if(deletar.anterior != null) {
			deletar.anterior.proximo = deletar.proximo;
		}
		return;
	}
	//Mostra quantos elementos existem na lista
	public void mostrarLista() {
		if(cabeca == null) {//Precaução caso a lista esteja vazia
			System.out.println("A lista está vazia");
			return;
		}
		Ligacao atual = cabeca;
		System.out.println("Lista Ligada Dupla:");
		while(atual != null) {
			System.out.println(atual.index);
			atual = atual.proximo;
		}
	}
	public static void main(String[] args) {
		ListaLigadaDupla listaDupla = new ListaLigadaDupla();
		listaDupla.adicionar(0);
		listaDupla.adicionar(1);
		listaDupla.adicionar(2);
		listaDupla.adicionar(0);
		listaDupla.mostrarLista();
		listaDupla.remover(listaDupla.cabeca);//Remove o primeiro elemento da lista
		listaDupla.mostrarLista();
		listaDupla.remover(listaDupla.cauda);//Remove o ultimo elemento da lista
		listaDupla.mostrarLista();
	}
}
