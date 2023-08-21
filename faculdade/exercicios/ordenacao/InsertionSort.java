package faculdade.exercicios.ordenacao;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
	public void insertionSort(int[] array) {
		int antes,posicao;
		for(posicao = 1;posicao<array.length;posicao++) {
			antes = posicao-1;
			int temp = array[posicao];
			while(antes>=0 && array[antes]>=temp) {
				array[antes+1] = array[antes];
				antes = antes-1;
			}
			array[antes+1] = temp;
		}
	}
	public static void main(String[] args) {
		InsertionSort ordem = new InsertionSort();
		
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
			ordem.insertionSort(conteudo.get(i));
			System.out.println((i+1)+"º lista "+" (ordenada): "+ Arrays.toString(conteudo.get(i)));
			System.out.println();
		}
	}
}
