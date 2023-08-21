package faculdade.exercicios.hash;

public class TabelaAberta{
	class LigacaoHash<K extends Number,V extends Number>{
		K chave;
		V valor;
		int tamanho;
		public LigacaoHash(K chave,V valor) {
			this.chave = chave;
			this.valor = valor;
		}
	}
	
	int capacidade,tamanho;
	@SuppressWarnings("rawtypes")
	LigacaoHash [] vetor;
	@SuppressWarnings("rawtypes")
	LigacaoHash negativo;
	
	public TabelaAberta() {
		this.capacidade = 11;
		this.tamanho = 0;
		this.vetor = new LigacaoHash[this.capacidade];
		this.negativo = new LigacaoHash<Integer, Integer>(-1,-1);
	}
	public <K extends Number> int hashCode(K chave) {
		return Math.abs(chave.intValue())%capacidade;
	}
	public <K extends Number,V extends Number> void inserir(K chave, V valor){
		LigacaoHash<K,V> temp = new LigacaoHash<>(chave,valor);
		int index = hashCode(chave);
		while(this.vetor[index] != null && this.vetor[index].chave != chave && this.vetor[index].chave.intValue() != -1) {
			index++;
			index %= this.capacidade;
		}
		if(this.vetor[index] == null || this.vetor[index].chave.intValue() == -1)
			this.tamanho++;
		this.vetor[index] = temp;
	}
	public <K extends Number> int deletar(K chave) {
		int index = hashCode(chave);
		while(this.vetor[index] != null) {
			if(this.vetor[index].chave == chave) {
				LigacaoHash temp = this.vetor[index];
				this.vetor[index] = this.negativo;
				this.tamanho--;
				return temp.valor.intValue();
			}
			index++;
			index %= this.capacidade;
		}
		return -1;
	}
	public <K extends Number> int getValor(K chave) {
		int index = hashCode(chave);
		int contador = 0;
		while(this.vetor[index] != null) {
			if(contador > this.capacidade)
				return -1;
			if(this.vetor[index].chave == chave)
				return this.vetor[index].chave.intValue();
			index++;
			index %= this.capacidade;
			contador++;
		}
		return 0;
	}
	public int tamanhoMapa() {
		return this.tamanho;
	}
	public boolean taVazio() {
		return this.tamanho == 0;
	}
	public void mostrarMapa() {
		for(int i = 0; i< this.capacidade; i++)
			if(this.vetor[i] != null && this.vetor[i].chave.intValue() != -1)
				System.out.printf("Chave: %d --> Valor: %d\n",this.vetor[i].chave.intValue(),this.vetor[i].valor.intValue());
	}
	
	public static void main(String[] args) {
		TabelaAberta mapa1 = new TabelaAberta();
		mapa1.inserir(10, 8);
		mapa1.inserir(22, 5);
		mapa1.inserir(31, 19);
		mapa1.inserir(4, 26);
		mapa1.inserir(15, 45);
		mapa1.inserir(28, 78);
		mapa1.inserir(17, 46);
		mapa1.inserir(88, 29);
		mapa1.inserir(59, 83);
		mapa1.mostrarMapa();
	}
}
