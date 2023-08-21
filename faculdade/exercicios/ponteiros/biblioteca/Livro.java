package faculdade.exercicios.ponteiros.biblioteca;

public class Livro {
	private String nome;
	private boolean disponivel;
	private FilaEspera filaEspera;
	
	public Livro(String nome, boolean disponivel, FilaEspera filaEspera) {
		this.nome = nome;
		this.disponivel = disponivel;
		this.filaEspera = filaEspera;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public FilaEspera getFilaEspera() {
		return filaEspera;
	}
	/*public void setFilaEspera(Fila filaEspera) {
		this.filaEspera = filaEspera;
	}*/
}
