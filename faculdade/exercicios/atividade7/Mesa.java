package faculdade.exercicios.atividade7;

public class Mesa {

	private Mesa prox = null;
	private Mesa ant = null;
	private String id;
	private boolean frente = false;
	private boolean trazeira = true;
	private static Mesa topo = new Mesa(null);
	private static int ordem = 0;
	
	public  Mesa(String id) {
		this.id = id;
	}
	
	public void push(Mesa add) {
		
		if(this.prox==null) {
			
			this.trazeira = false;
			this.prox = add;
			add.ant = this;
			++ordem;
			
			if(this==topo) {
				
				add.frente = true;
				
			}
			
		} else {
			
			this.prox.push(add);
			
		}
	}
	
	public Mesa pop() {
		
		Mesa res = this.prox;
		
		if(this.prox.prox==null) {
			
			this.prox = null;
			
		} else {
			
			this.prox = this.prox.prox;
			this.prox.ant = this;
			this.frente = true;
			
		}
		
		--ordem;
		
		return res;
	}
	
	public void contar() {
		
		if(topo.prox==null) {
			
			System.err.println("Não há elementos!!!");
			
		} else {
			
			System.out.println("Nº de elementos: " + ordem);
			
		}
	}
	
	public static void main(String[] args) {
		
		Mesa a1 = new Mesa("100");
		Mesa a2 = new Mesa("101");
		Mesa a3 = new Mesa("102");
		Mesa a4 = new Mesa("103");
		
		topo.push(a1);
		System.out.println(topo.pop().id);
		topo.contar();
	}
}