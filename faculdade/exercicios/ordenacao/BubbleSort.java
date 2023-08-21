package faculdade.exercicios.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
	public void trocar(int[] x, int y, int z) {
		int tempZ = x[z];
		x[z] = x[y];
		x[y] = tempZ;
	}
	public void bubbleSort(int[] x) {
		int dentro, fora;
		int n = x.length;
		int i = 1;
		System.out.printf("Lista original: %s\n\n",Arrays.toString(x));
		for(fora = n-1; fora>0; fora--) {
			for(dentro = 0; dentro<fora; dentro++) {
				if(x[dentro] > x[dentro+1]) {
					trocar(x,dentro,dentro+1);
					System.out.printf("%dº Troca: %s ",i,Arrays.toString(x));
					System.out.printf("(Alteração entre vetor %d e vetor %d)\n\n",
							dentro, dentro+1);
					i++;
				}
			}
		}
		System.out.println("Número de trocas feitas: " + (i-1));
	}
	public static void main(String[] args) {
		BubbleSort ordem = new BubbleSort();
		
		int[] s1 = {2, 4, 6, 8, 10, 12};
		int[] s2 = {11, 9, 7, 5, 3, 1};
		int[] s3 = {5, 7, 2, 8, 1, 6};
		int[] s4 = {2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1};
		int[] questao5 = {77, 51, 11, 37, 29, 13, 21};
		
		@SuppressWarnings("serial")
		ArrayList<int[]> conteudo = new ArrayList<>() {{
			add(s1);add(s2);add(s3);add(s4);add(questao5);
		}};
		
		for(int i = 0; i<conteudo.size(); i++) {
			System.out.println((i+1)+"º lista "+" (original): "+Arrays.toString(conteudo.get(i)));
			ordem.bubbleSort(conteudo.get(i));
			System.out.println((i+1)+"º lista "+" (ordenada): "+ Arrays.toString(conteudo.get(i)));
			System.out.println();
		}
	}
}
