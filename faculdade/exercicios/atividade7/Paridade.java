package faculdade.exercicios.atividade7;
import java.util.Scanner;

public class Paridade {
	Scanner valor = new Scanner(System.in);
	Pilha pilha = new Pilha();
	Fila pares = new Fila();
	Fila impares = new Fila();
	
	public Pilha valores() {
		int numero = 0;
		int i = 1;
		System.out.println("Coloque os valores da pilha:");
		while(numero >= 0) {
			System.out.print(i + " - ");
			i++;
			numero = valor.nextInt();
			pilha.push(numero);
		}
		return pilha;
	}
	public void divisão(){
		Pilha.Ligacao atual = pilha.fundo;
		while(atual != null) {
			if(atual.index%2 == 0) {
				pares.add(atual.index);
			}
			else {
				impares.add(atual.index);
			}
			atual = atual.anterior;
		}
	}
	public void mostrarListas() {
		pilha.mostrarPilha();
		System.out.print("(Pares) "); pares.mostrarFila();
		System.out.print("(Impares) "); impares.mostrarFila();
	}
	public static void main(String[] args) {
		Paridade paridade = new Paridade();
		paridade.valores();
		paridade.divisão();
		paridade.mostrarListas();
	}
}