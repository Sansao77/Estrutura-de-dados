package faculdade.exercicios.ponteiros;
import java.util.Scanner;

public class LerNumeros {
	private int[] numeros = new int[10];
	private Scanner leitor = new Scanner(System.in);
	
	public int[] lerNumeros() {
		System.out.println("Por favor insira 10 números no leitor");
		for(int i = 0; i<numeros.length; i++) {
			System.out.printf("Número %d: ", (i+1));
			numeros[i] = leitor.nextInt();
		}
		return numeros;
	}
	public void avaliarLeituras() {
		Pilha pilha = new Pilha();
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i]%2 == 0) {
				pilha.push(numeros[i]);
			}
			else {
				pilha.pop();
			}
		}
		if(pilha.topo == null) {
			System.out.println("A pilha não contem nenhum valor");
		}
		else {
			System.out.println("Esvaziando a pilha:");
			while(pilha.topo != null) {
				System.out.println(pilha.fundo.index);
				pilha.pop();
			}
			System.out.print("A pilha foi esvaziada: ");
			pilha.mostrarPilha();
		}
	}
	
	public static void main(String[] args) {
		LerNumeros lerNumeros = new LerNumeros();
		lerNumeros.lerNumeros();
		lerNumeros.avaliarLeituras();
	}
}
