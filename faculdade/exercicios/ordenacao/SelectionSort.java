package faculdade.exercicios.ordenacao;

import java.util.Arrays;
import java.util.ArrayList;

public class SelectionSort {
	public void trocar(int[] x, int y, int z) {
		//System.out.printf("[Antes] y: %d / z: %d\n",x[y],x[z]);
		int tempZ = x[z];
		x[z] = x[y];
		x[y] = tempZ;
		//System.out.printf("[Depois] y: %d / z: %d\n",x[y],x[z]);
	}
	public void selectSort(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				int minimo = i;
				//System.out.printf("m: %d / j: %d\n\n",array[minimo],array[j]);
				if(array[j] < array[minimo]) minimo = j;
				trocar(array, i, minimo);
			}
		}
	}
	public static void main(String[] args) {
		SelectionSort ordem = new SelectionSort();
		
		int[] s1 = {2, 4, 6, 8, 10, 12};
		int[] s2 = {11, 9, 7, 5, 3, 1};
		int[] s3 = {5, 7, 2, 8, 1, 6};
		int[] s4 = {2, 4, 6, 8, 10, 12, 11, 9, 7, 5, 3, 1};
		
		@SuppressWarnings("serial")
		ArrayList<int[]> conteudo = new ArrayList<>() {{
			add(s1);add(s2);
			add(s3);add(s4);
		}};
		
		for(int i = 0; i<conteudo.size(); i++) {
			System.out.println((i+1)+"º lista "+" (original): "+Arrays.toString(conteudo.get(i)));
			ordem.selectSort(conteudo.get(i));
			System.out.println((i+1)+"º lista "+" (ordenada): "+ Arrays.toString(conteudo.get(i)));
			System.out.println();
		}
	}
}
