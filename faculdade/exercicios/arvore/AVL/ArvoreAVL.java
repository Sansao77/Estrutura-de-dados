package faculdade.exercicios.arvore.AVL;

public class ArvoreAVL {
	public class Ligacao{
		int elemento, altura;
		Ligacao esquerda, direita;
		
		public Ligacao(int elemento) {
			esquerda = null;
			direita = null;
			this.elemento = elemento;
			altura = 1;
		}
	}
	private Ligacao raiz;
	
	public ArvoreAVL() {
		raiz = null;
	}
	public Ligacao getRaiz() {
		return raiz;
	}
	
	public void removerTudo() {
		this.raiz = null;
	}
	public boolean taVazio() {
		return this.raiz == null? true:false;
	}
	public int getAltura(Ligacao ligacao) {
		if(ligacao == null) return -1;
		return ligacao.altura;
	}
	public int getAlturaMaxima(int alturaEsquerda, int alturaDireita) {
		return alturaEsquerda>alturaDireita? alturaEsquerda:alturaDireita;
	}
	public int getDiferenca(Ligacao ligacao) {
		if(ligacao == null) return 0;
		return getAltura(ligacao.esquerda) - getAltura(ligacao.direita);
	}
	public Ligacao rodarEsquerda(Ligacao x) {
		Ligacao y = x.direita;
		Ligacao z = y.esquerda;
		y.esquerda = x;
		x.direita = z;
		x.altura = getAlturaMaxima(getAltura(x.esquerda),getAltura(x.direita))+1;
		y.altura = getAlturaMaxima(getAltura(y.esquerda),getAltura(y.direita)) +1;
		return y;
	}
	public Ligacao rodarDireita(Ligacao y) {
		Ligacao x = y.esquerda;
		Ligacao z = x.direita;
		x.direita = y;
		y.esquerda = z;
		y.altura = getAlturaMaxima(getAltura(y.esquerda),getAltura(y.direita))+1;
		x.altura = getAlturaMaxima(getAltura(x.esquerda),getAltura(x.direita)) +1;
		return x;
	}
	public Ligacao rodarEsquerdaDireita(Ligacao ligacao) {
		ligacao.esquerda = rodarEsquerda(ligacao.esquerda);
		return rodarDireita(ligacao);
	}
	public Ligacao rodarDireitaEsquerda(Ligacao ligacao) {
		ligacao.direita = rodarDireita(ligacao.direita);
		return rodarEsquerda(ligacao);
	}
	
	//Metodo para avaliar se arvore é AVL ou não
	public boolean checarAVL(Ligacao ligacao) {
		return ((getDiferenca(ligacao) >= -1) && (getDiferenca(ligacao )<=1))? true:false;
	}
	public Ligacao menorLigacao(Ligacao ligacao) {
		Ligacao temp;
		for(temp = ligacao;temp.esquerda!= null; temp = temp.esquerda);
		return temp;
	}
	public int menorValor(Ligacao ligacao) {
		Ligacao atual = ligacao;
		while(atual.esquerda != null)
			atual = atual.esquerda;
		return(atual.elemento);
	}
}
