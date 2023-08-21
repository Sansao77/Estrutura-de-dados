package faculdade.exercicios;
import java.util.Scanner;

public class Se {
	private Integer N;
	Scanner resultado = new Scanner(System.in);
	
	public void Frases() {
		System.out.print("Por favor, coloque um valor (entre 1 e 100): ");
		N = resultado.nextInt();
		if(N>=1 && N<=100) {
			if(N%2 == 0) {
				if(N >=6 && N<=20) {
					System.out.print("Estranho (Weird)");
					}
				else {
					System.out.print("Não é Estranho (Not Weird)");
					}
				}
			else {
				System.out.print("Estranho (Weird)");
				}
			}
		else {System.out.println("Esse valor não é válido");}
	}
	public static void main(String[] args) {
		Se teste = new Se();
		teste.Frases();
	}
}
