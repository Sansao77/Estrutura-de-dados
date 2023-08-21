package faculdade.exercicios.ponteiros.biblioteca;
import java.util.ArrayList;
//O registro deve funcionar na forma de uma lista
public class Registro {
	private ArrayList<Livro> registro = new ArrayList<>();
	
	public void registrarLivro(Livro livro, String nome) {
		if(registro.contains(livro)) {
			System.out.println("Esse livro já está registrado");
		}
		else {
			livro.setNome(nome);
			livro.setDisponivel(true);
			registro.add(livro);
		}
	}
	public void removerLivro(Livro livro) {
		if(registro.contains(livro)) {
			registro.remove(livro);
		}
		else{
			System.out.println("Esse livro não existe no Registro");
		}
	}
	public void registrarUsuario(String usuario, Livro livro) {
		if(livro.getDisponivel() == true) {
			System.out.printf("%s pegou o livro: '%s'\n\n",usuario,livro.getNome());
			livro.setDisponivel(false);
		}
		else {
			System.out.printf("Desculpe esse livro está indisponível\n"
					+ "'%s' sera colocado na lista de espera\n\n", usuario);
			livro.getFilaEspera().add(usuario);
		}
	}
	public void garantirLivro(Livro livro) {
		if(livro.getDisponivel() == true) {
			System.out.println("O livro ainda está disponivel");
			return;
		}
		livro.setDisponivel(true);
		if(livro.getFilaEspera().filaVazia() == false) {
			System.out.printf("%s recebeu o livro: '%s'\n\n",
			livro.getFilaEspera().inicio.index, livro.getNome());
			livro.getFilaEspera().peek();
			livro.setDisponivel(false);
		}
	}
	public void mostrarLivros() {
		if(registro.size() == 0) {
			System.out.println("O registro está vázio");
			return;
		}
		for(int i = 0; i<registro.size(); i++) {
			System.out.printf("%d - '%s' (Disponível: %b)\n",
					(i+1), registro.get(i).getNome(), registro.get(i).getDisponivel());
			registro.get(i).getFilaEspera().mostrarFila();
			System.out.println();
		}
	}
}
