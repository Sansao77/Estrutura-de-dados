package faculdade.exercicios;

public class Recursividade {
	static Recursividade recursividade = new Recursividade();
	
	public int N(int N) {// Calculo 
		if(N<0) {
			return -1;
		}
		else if(N == 1) {
			return N;
		}
		else {
			return N((N-1))+N;
		}
	}
	public int MDC(int x,int y) {//Calculo do MDC
		if(x%y == 0) {
			return y;
		}
		else if(y%x == 0) {
			return x;
		}
		else{
			return MDC(x%y,y%x);
		}
	}
	/*
	 *Método mais eficiente para conversor binário
	 *public String conversor(int decimal) {
		return Integer.toBinaryString(decimal);
	}*/
	public int conversor(int decimal) {//Conversor de decimal para binario
		if(decimal == 0) {
			return 0;
		}
		else {
			return decimal%2 + 10 *conversor(decimal/2);
		}
	}
	public int prod_list(int[] valores, int x) {//Produto de uma lista de inteiros
		if(x <= 0) {
			return 1;
		}
		else {
			return prod_list(valores,x-1)*valores[x-1];
		}
	}
	public static void main(String[] args) {
		int[] lista = {1,2,3,4};
		System.out.println("Fatorial: "+recursividade.N(12));
		System.out.println("MDC: "+recursividade.MDC(16, 140));
		System.out.println("Conversor (decimal -> binario): "+recursividade.conversor(8));
		System.out.println("Multiplicação de uma lista: "+ recursividade.prod_list(lista,lista.length));
	}
}
