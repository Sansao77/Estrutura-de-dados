package faculdade.exercicios.hash;

public class TabelaFechada {
	private int maximo = 11;  
	  
    private LigacaoHash[] vetor = new LigacaoHash[maximo];  
  
    class LigacaoHash{  
        public int chave;  
  
        LigacaoHash(int chave){
            this.chave = chave;  
        }  
    }  
  
    TabelaFechada(){  
        for (int i = 0; i < maximo; i++)   
        {  
              
            this.vetor[i] = null;  
        }  
    }  
      
    public void adicionar(int chave, int valor)   
    {  
  
        int hashcode = this.hash(chave, valor);  
  
        if ((valor > 0) && (hashcode == this.hash(chave, 0))) {  
  
            System.out.println("A chave " + chave +" não pode ser adicionada no mapa");  
            return;  
        }  
  
        if (this.vetor[hashcode] != null) {  
              
            this.adicionar(chave, valor + 1);  
        }  
        else {  
  
            this.vetor[hashcode] = new LigacaoHash(chave);  
        }  
    }  
 
    public void adicionar(int chave)   
    {  
  
        this.adicionar(chave, 0);  
    }  
  
    public int procurar(int chave, int i)   
    {  
  
        int hashcode = this.hash(chave, i);  
  
        if ((i > 0) && (hashcode == this.hash(chave, 0))){  
            System.out.println("A chave " + chave + " não foi encontrado. Ocorreram " + i + " pesquisas.");  
            return -99;  
        }  
  
        if ((this.vetor[hashcode] != null) && (this.vetor[hashcode].chave == chave))   
        {  
  
            System.out.println("A chave " + chave + " foi encontrado. Ocorreram " + (i + 1) + " pesquisas.");  
  
            return hashcode;  
        }  
          
        return this.procurar(chave, i + 1);  
    }  
  
    public int procurar(int chave){  
    	return this.procurar(chave, 0);  
    }  
  
    public void remover(int chave){  
        int i = this.procurar(chave);  
  
        if (i != -99) {
            System.out.println("A chave ou elemento" + chave + " foi removido do mapa");  
            this.vetor[i] = null;  
        }  
        else {  
  
            System.out.println("A chave " + chave + " não existe no mapa");  
        }  
    }  
  
    public int hash_linear(int chave, int i)   
    {  
  
        return (chave + i) % this.maximo;  
    }  
   
    public int hash_quadratica(int chave, int i)   
    {  
  
        return (chave + (i * i)) % this.maximo;  
    }  
  
    public int hash_dobrar(int chave, int i)   
    {  
  
        return (this.hash_double2(chave) + i) % this.maximo;  
    }  
  
    public int hash_double2(int chave)   
    {  
  
        return (1 + chave) % (this.maximo - 1);  
    }  
  
    public int hash(int chave, int i)   
    {  
  
        return this.hash_linear(chave, i);  
    }  
  
    public String mostrarMapa()   
    {  
  
        String descricao = "Mapa (conteudo): [ ";  
  
        for (int i = 0; i < this.maximo; i++)   
        {  
              
            if (this.vetor[i] == null)   
            {  
                  
                descricao += "__  ";  
            }  
            else {  
  
                descricao += String.format("%2d  ", this.vetor[i].chave);  
            }  
        }  
  
        descricao += "]";  
  
        return descricao;  
    }
    
    public static void main(String[] args) {
    	TabelaFechada mapa = new TabelaFechada();
    	mapa.adicionar(5, 14);
    	mapa.adicionar(28, 25);
    	mapa.adicionar(19, 7);
    	mapa.adicionar(15, 82);
    	mapa.adicionar(20, 29);
    	mapa.adicionar(33, 65);
    	mapa.adicionar(12, 42);
    	mapa.adicionar(7, 10);
    	mapa.adicionar(10, 2);
    	System.out.println(mapa.mostrarMapa());
    }
}
