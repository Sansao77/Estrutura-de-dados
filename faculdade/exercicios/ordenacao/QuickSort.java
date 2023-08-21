package faculdade.exercicios.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
	/*Para que ocorrar analise completa da lista é melhor que o valor do parametro fim
	 * represente o array.length -1 do array para ter uma analise completa da lista. 
	 */
	public void quickSort(int[] array, int inicio, int fim) {
		if(inicio<fim) {
			int posicaoPivo = separar(array,inicio,fim);
			quickSort(array,inicio,posicaoPivo-1);
			quickSort(array,posicaoPivo+1,fim);
		}
	}
	public int separar(int[] array,int inicio, int fim) {
		int pivo = array[inicio];
		int i = inicio + 1, f = fim;
		while(i <= f) {
			if(array[i] <= pivo) i++;
			else if(pivo < array[f]) f--;
			else {
				int troca = array[i];
				array[i] = array[f];
				array[f] = troca;
				i++;
				f--;
			}
		}
		array[inicio] = array[f];
		array[f] = pivo;
		return f;
	}
	
	public static void main(String[] args) {
		QuickSort ordem = new QuickSort();
		
		int[] s1 = {2, 4, 6, 8, 10, 12};
		int[] s2 = {11, 9, 7, 5, 3, 1};
		int[] s3 = {5, 7, 2, 8, 1, 6};
		int[] s4 = {2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1};
		int[] questao6 = {3,4,9,2,5,8,2,1,7,4,6,2,9,8,5,1};
		
		@SuppressWarnings("serial")
		ArrayList<int[]> conteudo = new ArrayList<>() {{
			add(s1);add(s2);add(s3);add(s4);add(questao6);
		}};
		
		for(int i = 0; i<conteudo.size(); i++) {
			System.out.println((i+1)+"º lista "+" (original): "+Arrays.toString(conteudo.get(i)));
			ordem.quickSort(conteudo.get(i),0,conteudo.get(i).length-1);
			System.out.println((i+1)+"º lista "+" (ordenada): "+ Arrays.toString(conteudo.get(i)));
			System.out.println();
		}
	}
}
