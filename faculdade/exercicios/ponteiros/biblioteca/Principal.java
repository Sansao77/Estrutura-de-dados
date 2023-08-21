package faculdade.exercicios.ponteiros.biblioteca;

public class Principal extends Registro {
	private static Principal console = new Principal();
	private Livro livro1 = new Livro("",false,new FilaEspera());
	private Livro livro2 = new Livro("",false,new FilaEspera());
	private Livro livro3 = new Livro("",false,new FilaEspera());
	private Livro livro4 = new Livro("",false,new FilaEspera());
	private Livro livro5 = new Livro("",false,new FilaEspera());
	
	public static void main(String[] args) {
		console.registrarLivro(console.livro1, "Dune");
		console.registrarLivro(console.livro2, "Chainsaw Man");
		console.registrarLivro(console.livro3, "The Beggining After the End");
		console.registrarLivro(console.livro4, "O Auto da Compadecida");
		console.registrarLivro(console.livro5, "Memórias póstumas de Brás Cubas");
		
		console.registrarUsuario("Diego", console.livro1);
		console.registrarUsuario("Gabriel", console.livro1);
		console.registrarUsuario("Matheus", console.livro1);
		console.registrarUsuario("Denilson", console.livro1);
		console.garantirLivro(console.livro1);
		console.mostrarLivros();
		console.removerLivro(console.livro5);
		console.mostrarLivros();
	}
}
