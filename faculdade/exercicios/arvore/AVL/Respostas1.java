package faculdade.exercicios.arvore.AVL;
import java.util.Random;

public class Respostas1 extends Metodos{
	public void questao3() {
		Ligacao arvore1 = null;
		arvore1 = inserir(35,arvore1);
		arvore1 = inserir(39,arvore1);
		arvore1 = inserir(51,arvore1);
		arvore1 = inserir(20,arvore1);
		arvore1 = inserir(13,arvore1);
		arvore1 = inserir(28,arvore1);
		arvore1 = inserir(22,arvore1);
		arvore1 = inserir(32,arvore1);
		arvore1 = inserir(25,arvore1);
		arvore1 = inserir(33,arvore1);
		
		percorrer(arvore1);
	}
	public void questao4() {
		Random gerador = new Random();
		Ligacao arvore3 = null;
		for(int i = 0; i<gerador.nextInt(3,10);i++) 
			arvore3 = inserir(gerador.nextInt(0,100),arvore3);
		percorrer(arvore3);
		System.out.println("Menor valor na arvore: "+ menorValor(arvore3));
	}
	public void questao5() {
		Ligacao T = new Ligacao(13);
		T.direita = new Ligacao(12);
		T.esquerda = new Ligacao(9);
		T.esquerda.esquerda = new Ligacao(5);//Até aqui é true
		T.esquerda.esquerda.direita = new Ligacao(9);//Até aqui é false
		
		System.out.println("Arvore T é AVL? R: "+checarAVL(T));
	}
	public void questao6() {
		//Raiz
		Ligacao arvore2 = new Ligacao(8);
		
		//Sub-arvore esquerda
		arvore2.esquerda = new Ligacao(5);
		arvore2.esquerda.esquerda = new Ligacao(3);
		arvore2.esquerda.esquerda.esquerda = new Ligacao(2);
		arvore2.esquerda.esquerda.esquerda.esquerda = new Ligacao(1);
		arvore2.esquerda.esquerda.direita = new Ligacao(4);
		arvore2.esquerda.direita = new Ligacao(6);
		arvore2.esquerda.direita.direita = new Ligacao(7);
		
		//Sub-arvore direita
		arvore2.direita = new Ligacao(10);
		arvore2.direita.esquerda = new Ligacao(9);
		arvore2.direita.direita = new Ligacao(12);
		arvore2.direita.direita.esquerda = new Ligacao(11);
		percorrer(arvore2);
		
		deletar(arvore2,8);
		inserir(9,arvore2);
		percorrer(arvore2);
	}
	public static void main(String[] args) {
		Respostas1 questoes = new Respostas1();
		questoes.questao3();
		questoes.questao4();
		questoes.questao5();
		questoes.questao6();
		
		/*
		 * 1º Questão
		 * R: Uma arvore binaria balanceada (ABB) é uma onde a altura das sub-arvores esquerda e direita seja igual, enquanto que
		 * a arvore binária de busca balanceada (AVL) tem um fator de balanceamento entre as sub-arvores que não deve ser no máximo
		 * 1, o que significa que as alturas podem ser iguais mas não é necessário que sejam.
		 * 
		 * 2º Questão
		 * R: Como a altura da arvore AVL é menor e mais organizada que uma ABB sua eficiência em buscar um elemento é maior e com 
		 * diminuição consideravel no numero de comparações
		 */
	}
}
