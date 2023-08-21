package faculdade.exercicios.arvore.binario;

public class Arvores extends Metodos2{
	static Arvores arvore1 = new Arvores();
	static Arvores arvore2 = new Arvores();
	
	//Questão 5, construção da arvore
	public static void questao5() {
		//Raiz
		arvore1.raiz = new Ligacao(1);
		
		//Lado direito
		arvore1.raiz.direita = new Ligacao(7);
		arvore1.raiz.direita.direita = new Ligacao(8);
		arvore1.raiz.direita.direita.direita = new Ligacao(9);
		
		//Lado esquerdo
		arvore1.raiz.esquerda = new Ligacao(2);
		arvore1.raiz.esquerda.esquerda = new Ligacao(3);
		arvore1.raiz.esquerda.direita = new Ligacao(4);
		arvore1.raiz.esquerda.direita.esquerda = new Ligacao(5);
		arvore1.raiz.esquerda.direita.esquerda.esquerda = new Ligacao(6);
		
		percorrer(arvore1.raiz);
	}
	
	//Questão 6, construção da arvore
	public static void questao6() {
		//Raiz
		arvore2.raiz = new Ligacao(8);
		
		//Lado direito
		arvore2.raiz.direita = new Ligacao(5);
		
		arvore2.raiz.direita.direita = new Ligacao(12);
		arvore2.raiz.direita.direita.direita = new Ligacao(18);
		arvore2.raiz.direita.direita.esquerda = new Ligacao(17);
		arvore2.raiz.direita.direita.esquerda.esquerda = new Ligacao(16);
		
		arvore2.raiz.direita.esquerda = new Ligacao(6);
		arvore2.raiz.direita.esquerda.direita = new Ligacao(14);
		arvore2.raiz.direita.esquerda.direita.esquerda = new Ligacao(10);
		arvore2.raiz.direita.esquerda.esquerda = new Ligacao(4);
		arvore2.raiz.direita.esquerda.esquerda.esquerda = new Ligacao(13);
		
		//Lado esquerdo
		arvore2.raiz.esquerda = new Ligacao(9);
		
		arvore2.raiz.esquerda.direita = new Ligacao(7);
		arvore2.raiz.esquerda.direita.direita = new Ligacao(1);
		arvore2.raiz.esquerda.direita.esquerda = new Ligacao(3);
		arvore2.raiz.esquerda.direita.esquerda.esquerda = new Ligacao(2);
		
		arvore2.raiz.esquerda.esquerda = new Ligacao(11);
		arvore2.raiz.esquerda.esquerda.direita = new Ligacao(20);
		arvore2.raiz.esquerda.esquerda.direita.esquerda = new Ligacao(21);
		arvore2.raiz.esquerda.esquerda.esquerda = new Ligacao(15);
		arvore2.raiz.esquerda.esquerda.esquerda.esquerda = new Ligacao(19);
		
		percorrer(arvore2.raiz);
	}
}
