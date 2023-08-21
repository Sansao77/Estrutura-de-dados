package faculdade.exercicios.ponteiros;

public class ListaLigada {
	Ligacao cabeca;
	//Cria os Node da lista
	class Ligacao{
		int index;
		Ligacao proximo;
		Ligacao(int index){
			this.index = index;
			proximo = null;
		}
	}
	//Adiciona os valores da lista
	public void adicionar(int index) {
		Ligacao novaLigacao = new Ligacao(index);
		if(cabeca == null) {
			cabeca = novaLigacao;
		}
		else {
			Ligacao ultimo = cabeca;
			while(ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}
			ultimo.proximo = novaLigacao;
		}
	}
	//Avalia se os valores da lista está em ordem crescente
	public void listaCrescente() {
		Ligacao atual = cabeca;
		while(atual != null) {
			if(atual.proximo == null) {
				System.out.println("A lista está em ordem crescente\n");
				break;
			}
			if(atual.index>atual.proximo.index) {
				System.out.println("A lista não está em ordem crescente\n");
				break;
			}
			atual = atual.proximo;
		}
	}
	//Compara se duas listas tem o mesmo conteudo (independente da posição do contéudo)
	public static void compararListas(ListaLigada lista1,ListaLigada lista2) {
		int x = 0;
		int y = 0;
		Ligacao atual1 = lista1.cabeca;
		Ligacao atual2 = lista2.cabeca;
		while(atual1 != null) {
			atual2 = lista2.cabeca;
			while(atual2 != null) {
				//Se a lista2 for maior que a lista1 o pode causar um problema no código.
				if(atual1.index == atual2.index) {
					y++;
				}
				atual2 = atual2.proximo;
			}
			x++;
			atual1 = atual1.proximo;
		}
		if(x == y) {
			System.out.println("As listas tem o mesmo conteudo\n");
		}
		else {
			System.out.println("As listas não tem o mesmo conteudo\n");
		}
	}
	//Concatena as duas primeiras listas e adiciona os seus valores a terceira lista
	public static ListaLigada concatenarListas(ListaLigada lista1, ListaLigada lista2, ListaLigada lista3) {
		Ligacao atual1 = lista1.cabeca;
		Ligacao atual2 = lista2.cabeca;
		while(atual1 != null) {
			lista3.adicionar(atual1.index);
			atual1 = atual1.proximo;
		}
		while(atual2 != null) {
			lista3.adicionar(atual2.index);
			atual2 = atual2.proximo;
		}
		return lista3;
	}
	//Mostra quantos elementos existem na lista
	public void mostraLista() {
		if(cabeca == null) {//Precaução caso a lista esteja vazia
			System.out.println("A lista está vazia");
			return;
		}
		Ligacao atual = cabeca;
		System.out.println("Lista Ligada (LinkedList):");
		while(atual != null) {
			System.out.println(atual.index);
			atual = atual.proximo;
		}
	}
	public static void main(String[] args) {
		ListaLigada lista1 = new ListaLigada();
		ListaLigada lista2 = new ListaLigada();
		ListaLigada lista3 = new ListaLigada();
		lista1.adicionar(0);
		lista1.adicionar(1);
		lista1.adicionar(2);
		lista1.adicionar(3);
		lista1.mostraLista();
		lista1.listaCrescente();
		lista2.adicionar(3);
		lista2.adicionar(2);
		lista2.adicionar(1);
		lista2.adicionar(0);
		lista2.mostraLista();
		lista2.listaCrescente();
		compararListas(lista1,lista2);//comparar lista1 a lista2
		concatenarListas(lista1,lista2,lista3);
		lista3.mostraLista();
	}
}
