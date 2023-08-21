package faculdade.exercicios.arvore.binario;

public class Metodos2 extends Metodos1 {
	//Metodo para encontrar menor valor na arvore
	public static int menor(Ligacao ligacao) {
		if(ligacao == null) return -1;
		else {
			int esquerdaM,direitaM;
			int min = ligacao.valor;
			
			if(ligacao.esquerda != null) {
				esquerdaM = menor(ligacao.esquerda);
				min = Math.min(min,esquerdaM);
			}
			if(ligacao.direita != null) {
				direitaM = menor(ligacao.direita);
				min = Math.min(min,direitaM);
			}
			return min;
		}
	}
	
	//Quantidade de ligações (Nodes)
	public static int ligacoes(Ligacao ligacao) {
		if(ligacao == null) return 0;
		int direita = ligacoes(ligacao.direita);
		int esquerda = ligacoes(ligacao.esquerda);
		return 1 + direita + esquerda;
	}
	
	//Quantidades de folhas na arvore
	public static int numeroFolhas(Ligacao ligacao) {
		if(ligacao == null) return 0;
		if(ligacao.folha()) return 1;
		else return numeroFolhas(ligacao.esquerda) + numeroFolhas(ligacao.direita);
	}
	
	//Altura da arvore
	public static int altura(Ligacao ligacao) {
		if(ligacao == null) return 0;
		
		return 1 + Math.max(altura(ligacao.esquerda), altura(ligacao.direita));
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
		emOrdem(ligacao.esquerda); System.out.print(ligacao.valor + "  ");emOrdem(ligacao.direita);
	}
	public static void preOrdem(Ligacao ligacao) {
		if(ligacao == null) return;
		 System.out.print(ligacao.valor + "  "); preOrdem(ligacao.esquerda); preOrdem(ligacao.direita);
	}
	public static void posOrdem(Ligacao ligacao) {
		if(ligacao == null) return;
		posOrdem(ligacao.esquerda); posOrdem(ligacao.direita); System.out.print(ligacao.valor + "  ");
	}
}
