package faculdade.exercicios.hash;

public class Generics <T extends Number>{
	T valor;
	public Generics(T valor) {
		this.valor = valor;
	}
	public void imprimirValor() {
		System.out.println(valor.intValue()%5);
	}
	public static void main(String[] args) {
		Generics<Integer> teste = new Generics<>(49);
		teste.imprimirValor();
	}
}
