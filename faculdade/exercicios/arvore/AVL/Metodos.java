package faculdade.exercicios.arvore.AVL;

public class Metodos extends ArvoreAVL {
	// Metodos para inserir elementos
	public Ligacao inserir(int valor, Ligacao ligacao) {
		if(ligacao == null) 
			return (new Ligacao(valor));
		
		if(valor<ligacao.elemento)
			ligacao.esquerda = inserir(valor,ligacao.esquerda);
		else if(valor>ligacao.elemento)
			ligacao.direita = inserir(valor,ligacao.direita);
		else
			return ligacao;
		
		ligacao.altura = 1 + getAlturaMaxima(getAltura(ligacao.esquerda),getAltura(ligacao.direita));
		int diferenca = getDiferenca(ligacao);
		
		if(diferenca > 1 && valor<ligacao.esquerda.elemento)
			return rodarDireita(ligacao);
		if(diferenca < -1 && valor>ligacao.direita.elemento)
			return rodarEsquerda(ligacao);
		if(diferenca > 1 && valor>ligacao.esquerda.elemento)
			return rodarEsquerdaDireita(ligacao);
		if(diferenca < -1 && valor<ligacao.direita.elemento)
			return rodarDireitaEsquerda(ligacao);
		
		return ligacao;
	}
	//Metodos que contam e mostram a quantidade de ligacoes na arvore
	public int ligacoes() {
		return ligacoes(getRaiz());
	}
	public int ligacoes(Ligacao raiz) {
		if(raiz == null) return 0;
		else {
			int quantidade = 1;
			quantidade += ligacoes(raiz.esquerda);
			quantidade += ligacoes(raiz.direita);
			return quantidade;
		}
	}
	
	//Metodos para encontrar e mostrar se um elemento especifico existe dentro da arvore
	public boolean pesquisar(int elemento) {
		return pesquisar(getRaiz(),elemento);
	}
	public boolean pesquisar(Ligacao raiz, int elemento) {
		boolean checar = false;
		while((raiz != null) && !checar) {
			int cabeca = raiz.elemento;
			if(elemento < cabeca)
				raiz = raiz.direita;
			else if(elemento > cabeca)
				raiz = raiz.esquerda;
			else {
				checar = true;
				break;
			}
			checar = pesquisar(raiz,elemento);
		}
		return checar;
	}
	//Metodo para deletar elementos
	public Ligacao deletar(Ligacao ligacao, int valor) {
		if(ligacao == null) 
			return ligacao;
		if(valor<ligacao.elemento) 
			ligacao.esquerda = deletar(ligacao.esquerda,valor);
		if(valor>ligacao.elemento)
			ligacao.direita = deletar(ligacao.direita,valor);
		else {
			if(ligacao.esquerda == null || ligacao.direita == null) {
				Ligacao temp = null;
				if(temp == ligacao.esquerda)
					temp = ligacao.direita;
				else
					temp = ligacao.esquerda;
				
				if(temp == null) {
					temp = ligacao;
					ligacao = null;
				}
				else
					ligacao = temp;
			}
			else {
				Ligacao temp = menorLigacao(ligacao.direita);
				ligacao.elemento = temp.elemento;
				ligacao.direita = deletar(ligacao.direita,temp.elemento);
			}
		}
		if(ligacao == null) return ligacao;
		
		ligacao.altura = getAlturaMaxima(getAltura(ligacao.esquerda),getAltura(ligacao.direita)) + 1;
		int diferenca = getDiferenca(ligacao);
		
		if(diferenca > 1 && getDiferenca(ligacao.esquerda) >= 0)
			return rodarDireita(ligacao);
		if(diferenca > 1 && getDiferenca(ligacao.esquerda) < 0)
			return rodarEsquerdaDireita(ligacao);
		if(diferenca < -1 && getDiferenca(ligacao.direita) <= 0)
			return rodarEsquerda(ligacao);
		if(diferenca < -1 && getDiferenca(ligacao.direita) > 0)
			return rodarDireitaEsquerda(ligacao);
		
		return ligacao;
	}
	
	//Metodos para percorrer a arvore
	public static void percorrer(Ligacao ligacao) {
		System.out.println("\nPercorrendo a arvore...\nEm Ordem:");emOrdem(ligacao);
		System.out.println("\nPré-ordem:");preOrdem(ligacao);
		System.out.println("\nPós-ordem:");posOrdem(ligacao);
		System.out.println();
	}
	public static void emOrdem(Ligacao ligacao) {
		if(ligacao == null) return;
		emOrdem(ligacao.esquerda); System.out.print(ligacao.elemento + "  ");emOrdem(ligacao.direita);
	}
	public static void preOrdem(Ligacao ligacao) {
		if(ligacao == null) return;
		 System.out.print(ligacao.elemento + "  "); preOrdem(ligacao.esquerda); preOrdem(ligacao.direita);
	}
	public static void posOrdem(Ligacao ligacao) {
		if(ligacao == null) return;
		posOrdem(ligacao.esquerda); posOrdem(ligacao.direita); System.out.print(ligacao.elemento + "  ");
	}
}
