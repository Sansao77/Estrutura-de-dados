package faculdade.exercicios;
import java.util.Scanner;

public class Loop {
	private Integer N;
	Scanner resposta = new Scanner(System.in);
	private Integer resultado;
	
	public void tabela(){
		N  = resposta.nextInt();
		if(N>=2 && N<=20) {
			for(int i = 1; i<=10;i++) {
				resultado = N*i;
				System.out.println(N+" x "+i +" = "+resultado);
			}
		}
		else {System.out.println("Esse valor não é válido");}
	}
	public static void main(String[] args) {
		System.out.print("Por favor, coloque um valor (entre 2 e 20): ");
		Loop teste = new Loop();
		teste.tabela();
	}
}
