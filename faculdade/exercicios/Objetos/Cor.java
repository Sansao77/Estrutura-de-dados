package faculdade.exercicios.Objetos;
import java.util.List;
import java.util.ArrayList;

public class Cor {
	private String cor;
	private String valor;
	static List<Cor> cores = new ArrayList<Cor>() {{
		add(new Cor("red","#f00"));
		add(new Cor("green","#0f0"));
		add(new Cor("blue","#00f"));
		add(new Cor("cyan","#0ff"));
		add(new Cor("magenta","#f0f"));
		add(new Cor("yellow","#ff0"));
		add(new Cor("black","#000"));
	}};
	
	public Cor(String cor, String valor) {
		this.cor = cor;
		this.valor = valor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCor() {
		return cor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getValor() {
		return valor;
	}
	
	public static void main(String[] args) {
		System.out.printf("Cor: %s\nValor: %s\n\n",cores.get(0).cor,cores.get(0).valor);
		System.out.printf("Cor: %s\nValor: %s\n\n",cores.get(1).cor,cores.get(1).valor);
		System.out.printf("Cor: %s\nValor: %s\n\n",cores.get(2).cor,cores.get(2).valor);
		System.out.printf("Cor: %s\nValor: %s\n\n",cores.get(3).cor,cores.get(3).valor);
		System.out.printf("Cor: %s\nValor: %s\n\n",cores.get(4).cor,cores.get(4).valor);
		System.out.printf("Cor: %s\nValor: %s\n\n",cores.get(5).cor,cores.get(5).valor);
		System.out.printf("Cor: %s\nValor: %s",cores.get(6).cor,cores.get(6).valor);
	}
}
