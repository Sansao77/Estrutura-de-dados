package faculdade.exercicios.grafos;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Grafo <T> {
	private Map<T, List<T>> mapa = new HashMap<>();
	
	public void adicionarVertice(T x) {
		mapa.put(x, new LinkedList<T>());
	}
	public void adicionarAresta(T fonte, T destino) {
		if(!mapa.containsKey(fonte))
			adicionarVertice(fonte);
		if(!mapa.containsKey(destino))
			adicionarVertice(destino);
		
		mapa.get(fonte).add(destino);
		mapa.get(destino).add(fonte);
	}
	public int contarArestas() {
		int contagem = 0;
		for(T v:mapa.keySet())
			contagem += mapa.get(v).size();
		
		contagem /= 2;
		return contagem;
	}
	public void contemVertice(T x) {
		if(mapa.containsKey(x))
			System.out.println("O grafo contem o vertice " + x);
		else
			System.out.println("O grafo não contem o vertice " + x);
	}
	public void contemAresta(T x, T y) {
		if(mapa.get(x).contains(y))
			System.out.println("O grafo tem uma aresta entre "+ x +" e " + y);
		else
			System.out.println("O grafo não tem uma aresta entre " + x + " e " + y);
	}
	public String matrizAdjacente() {
		StringBuilder construtor = new StringBuilder();
		construtor.append("\nMatriz Adjacente:\n   ");
		for(T a: mapa.keySet()) construtor.append(a + " ");
		construtor.append("\n   ");
		for(int i = 0; i<mapa.size(); i++) construtor.append("- ");
		construtor.append("\n");
		for(T x: mapa.keySet()) {
			construtor.append(x.toString() + "| ");
			for(T y: mapa.keySet())
				construtor.append((mapa.get(x).contains(y))? "1 ": "0 ");
			construtor.append("\n");
		}
		return construtor.toString();
	}
	
	public static void main(String[] args) {
		Grafo<Integer> grafo = new Grafo<>();
		
		grafo.adicionarAresta(2, 4);
		grafo.adicionarAresta(5, 1);
		grafo.adicionarAresta(4, 5);
		grafo.adicionarAresta(1, 2);
		grafo.adicionarAresta(3, 6);
		grafo.adicionarAresta(3, 2);
		grafo.adicionarAresta(6, 4);
		
		System.out.println("Número de Arestas: " + grafo.contarArestas());
		grafo.contemVertice(5);
		grafo.contemVertice(7);
		grafo.contemAresta(1, 5);
		grafo.contemAresta(2, 5);
		System.out.println(grafo.matrizAdjacente());
	}
}
