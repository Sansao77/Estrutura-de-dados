package faculdade.exercicios.atividade7;

public class PilhaDupla {
	
	public static void add(int[] array, int data) {
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]==0) {
				
				array[i] = data;
				break;
				
			}
		}
	}
	
	public static int peek(int[] array) {
		
		int res = array[0];
		
		for(int i=0;i<array.length-1;i++) {
			
			array[i] = array[i+1];
		}
		
		return res;
	}
	
	public static int total(int[] array) {
		
		int res = 0;
		
		for(int i=0;i<array.length;i++) {
			res += array[i];
		}
		
		return res;
	}
	
	public static int[] comparacao(int[] array1, int[] array2) {
		
		if(array1.length==array2.length && PilhaDupla.total(array1)==PilhaDupla.total(array2)) {
			return array1;
		} else {
			return (PilhaDupla.total(array1)>PilhaDupla.total(array2) ? array1 : array2);
		}
	}
	
	public static void caracteristicas(int[] array1, int[] array2) {
		
		int maior = 0;
		int menor = 0;
		
		for(int i=0;i<array1.length;i++) {
			
			if(maior<array1[i]) {maior = array1[i];}
			if(menor>array1[i]) {menor = array1[i];}
			
		}
		
		for(int i=0;i<array2.length;i++) {
			
			if(maior<array2[i]) {maior = array2[i];}
			if(menor>array2[i]) {menor = array2[i];}
			
		}
		
		System.out.println("Características:");
		System.out.println("Maior elemento: " + maior);
		System.out.println("Menor elemento: " + menor);
		System.out.println("Média aritmédica: " + (PilhaDupla.total(array1)
				+PilhaDupla.total(array2)/2));
	}
	
	public static int[] juntar(int[] array1, int[] array2) {
		
		int[] res = new int[array1.length+array2.length];
		
		for(int i=0;i<array1.length;i++) {
			
			res[i] = array1[i];
			
		}
		
		for(int i=0;i<array2.length;i++) {
			
			res[array1.length+i] = array2[i];
			
		}
		
		return res;
	}
	
	public static int numerosPares(int[] array) {
		
		int res = 0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2 == 0) {res++;}
			
		}
		
		return res;
	}
	
	public static int numerosImpares(int[] array) {
		
		int res = 0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]%2 != 0) {res++;}
			
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] a1 = {1, 2, 3, 4, -1, 0, 0};
		int[] a2 = {2, 5, 2, 6, 2, 0};
		
		System.out.println(comparacao(a1,a2));
		caracteristicas(a1,a2);
		System.out.println(juntar(a1,a2));
		System.out.println(numerosImpares(a1));
		System.out.println(numerosPares(a2));
	}
}