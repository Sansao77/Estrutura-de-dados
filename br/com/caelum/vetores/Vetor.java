package br.com.caelum.vetores;
import br.com.caelum.ed.Aluno;

public class Vetor {
	private Aluno[] estudantes = new Aluno[10000];
	
	public void adiciona(Aluno estudante) {}
	
	public void adiciona(int posicao, Aluno estudante) {}
	
	public Aluno pega(int posicao) {
		return estudantes[posicao];
	}
	public void remover(int posicao) {
		
	}
}
