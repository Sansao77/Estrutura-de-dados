package br.com.caelum.ed;

public class Aluno {
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String toString() {
		return this.nome;
	}
	public boolean equals(Object o) {
		Aluno outro = new Aluno();
		return this.nome.equals(outro.nome);
	}
}
