package faculdade.exercicios.arvore.binario;

public class Respostas extends Arvores {
	public static void main(String[] args) {
		Respostas arvore = new Respostas();
		/*Arvore como base
		 * se colocar "true" o valor sera inserido de forma aleátoria
		 * se colocar "false" tem uma condição (menores a esquerda e maiores a direita) 
		 */
		arvore.raiz = new Ligacao(25);
		inserir(arvore.raiz,15,true);
		inserir(arvore.raiz,28,true);
		inserir(arvore.raiz,16,true);
		inserir(arvore.raiz,35,true);
		inserir(arvore.raiz,30,true);
		percorrer(arvore.raiz);
		
		//Questão 1
		//System.out.println("Nº de folhas: "+ numeroFolhas(arvore.raiz));
		
		//Questão 2
		//System.out.println("Menor valor: "+ menor(arvore.raiz));
		
		//Questão 3
		//System.out.println("Altura da arvore: "+ altura(arvore.raiz));
		
		//Questão 4
		//System.out.println("Nº de ligações: "+ ligacoes(arvore.raiz));
		
		/*questao5();
		questao6();*/
	}
}
