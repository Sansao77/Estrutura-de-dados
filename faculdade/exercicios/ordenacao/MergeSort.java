package faculdade.exercicios.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
	public void mergeSort(int[] array) {
		if (array.length < 2) {
	        return;
	    }
	    int meio = array.length / 2;
	    int[] e = new int[meio];
	    int[] d = new int[array.length - meio];

	    for (int i = 0; i < meio; i++) {
	        e[i] = array[i];
	    }
	    for (int i = meio; i < array.length; i++) {
	        d[i - meio] = array[i];
	    }
	    mergeSort(e);
	    mergeSort(d);

	    merge(array, e, d, meio, array.length - meio);
	}
	void merge(int[] array, int[] e ,int[] d, int esquerda, int direita) {
		int i = 0, j = 0, k = 0;
	    while (i < esquerda && j < direita) {
	        if (e[i] <= d[j]) {
	            array[k++] = e[i++];
	        }
	        else {
	            array[k++] = d[j++];
	        }
	    }
	    while (i < esquerda) {
	        array[k++] = e[i++];
	    }
	    while (j < direita) {
	        array[k++] = d[j++];
	    }
	}
	public static void main(String[] args) {
		MergeSort ordem = new MergeSort();
		
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
			ordem.mergeSort(conteudo.get(i));
			System.out.println((i+1)+"º lista "+" (ordenada): "+ Arrays.toString(conteudo.get(i)));
			System.out.println();
		}
	}
}
