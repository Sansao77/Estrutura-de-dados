package faculdade.exercicios.ponteiros;

public class Parque {
	Ligacao cabeca;

	static class Ligacao{
		private int matricula;
		private String carro;
		private int horaEntrada;
		Ligacao proximo;
		//Cria os Node da lista
		Ligacao(int matricula, String carro,int horaEntrada){
			this.matricula = matricula;
			this.carro = carro;
			this.horaEntrada = horaEntrada;
			proximo = null;
		}
	}
	//Adiciona os valores da lista
	public void adicionar(int matricula,String carro, int horaEntrada) {
		Ligacao novaLigacao = new Ligacao(matricula,carro,horaEntrada);
		if(cabeca == null) {
			cabeca = novaLigacao;
		}
		else {
			Ligacao ultimo = cabeca;
			while(ultimo.proximo != null) {
				ultimo = ultimo.proximo;
			}//Se já tiver elementos, ele vai ficar procurando um espaço null para adicionar o novo
			ultimo.proximo = novaLigacao;
		}
	}
	//Mostra quantos elementos existem na lista
	public static void mostrarLista(Parque lista) {
		Ligacao atual = lista.cabeca;
		System.out.println("Lista do Parque: ");
		while(atual != null) {
			System.out.printf("M: %d -> %s [H: %d]\n",atual.matricula,atual.carro,atual.horaEntrada);
			atual = atual.proximo;
		}
	}
	public static void main(String[] args) {
		Parque parque = new Parque();
		parque.adicionar(0, "vermelho",1100);
		parque.adicionar(1, "azul", 1200);
		parque.adicionar(2, "verde", 1230);
		mostrarLista(parque);		
	}
}
