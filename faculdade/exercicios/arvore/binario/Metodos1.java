package faculdade.exercicios.arvore.binario;

import java.util.LinkedList;
import java.util.Random;

public class Metodos1 extends ArvoreBinaria{
	//Metodo para inserir elementos na arvore
		public static void inserir(Ligacao arvore,int valor, boolean aleatorio) {
			Random gerar = new Random();
			if((aleatorio)? gerar.nextBoolean(): arvore.valor<valor) {
				if(arvore.esquerda != null) {
					System.out.printf("Inserir %d no ramo esquerdo (%d)\n",valor,arvore.esquerda.valor);
					inserir(arvore.esquerda,valor,aleatorio);
				}
				else {
					System.out.println(valor + " criou sub-arvore a esquerda de (" + arvore.valor +")");
					arvore.esquerda = new Ligacao(valor);
				}
			}
			else if((aleatorio)? true: arvore.valor>valor) {
				if(arvore.direita != null) {
					System.out.printf("Inserir %d no ramo direito (%d)\n",valor,arvore.direita.valor);
					inserir(arvore.direita,valor,aleatorio);
				}
				else {
					System.out.println(valor + " criou sub-arvore a direita de (" + arvore.valor + ")");
					arvore.direita = new Ligacao(valor);
				}
			}
		}
		
		//Metodos para retirar elementos na arvore
		public static void profundo(Ligacao l, Ligacao dl) {
			LinkedList<Ligacao> galho = new LinkedList<>();
			galho.add(l);
			Ligacao temp = null;
			while(!galho.isEmpty()) {
				temp = galho.peek();
				galho.remove();
				if(temp == dl) {
					temp = null;
					return;
				}
				if(temp.direita != null) 
					if(temp.direita == dl) {
						temp.direita = null;
						return;
					}else 
						galho.add(temp.direita);
				if(temp.esquerda != null)
					if(temp.esquerda == dl) {
						temp.esquerda = null;
					}else
						galho.add(temp.esquerda);
			}
		}
		
		public static void remover(Ligacao ligacao, int valor) {
			if(ligacao == null) return;
			if(ligacao.direita == null && ligacao.esquerda == null) {
				if(ligacao.valor == valor) {
					ligacao = null; return;
				}
				else return;
			}
			LinkedList<Ligacao> galhos = new LinkedList<>();
			galhos.add(ligacao);
			Ligacao temp = null,valorLigado = null;
			while(!galhos.isEmpty()) {
				temp = galhos.peek();
				galhos.remove();
				if(temp.valor == valor) valorLigado = temp;
				if(temp.esquerda != null) galhos.add(temp.esquerda);
				if(temp.direita != null) galhos.add(temp.direita);
			}
			if(valorLigado != null) {
				int x = temp.valor;
				profundo(ligacao,temp);
				valorLigado.valor = x;
			}
		}
		private boolean bandeira = false;
		public void procurar(Ligacao temp, int valor) {
			if(raiz == null) 
				System.out.println("A arvore está vázia");
			else {
				if(temp.valor == valor) {
					bandeira = true;
					System.out.printf("O valor %d existe na arvore\n",valor);
					return;
				}
				if(bandeira == false && temp.esquerda != null)
					procurar(temp.esquerda,valor);
				if(bandeira == false && temp.direita != null)
					procurar(temp.direita,valor);
			}
		}
}
