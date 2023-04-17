package controle;
import java.util.ArrayList;

import apresentacao.LivroAp;
import modelo.Autor;
import modelo.Livros;
import controle.BibliotecaControle;


public class ListaDeLivros {
	
	LivroAp livroAp = new LivroAp();
	
	
	private No<Livros> inicio;
	public No<Livros> ultimo;
	private int tamanho;
	
	// incluir um Livro no inicio da lista
	public void incluirNoInicio(Livros elemento) {
		
		No<Livros> titulo = new No<Livros> (elemento);
		//Livros livro = new Livros();
		 
		if(this.tamanho == 0) { // A lista está vazia
			this.inicio = titulo;
			this.ultimo = titulo;
		} else { // A lista não está vazia
			
			No<Livros> primeiro = this.inicio;
			
			this.inicio = titulo;
			this.inicio.setProximo(primeiro);
		}
		
		livroAp.cadastraLivro(elemento);
		this.tamanho++;
		
	}
	
	// incluir um Livro no final da lista
	public void adiciona (Livros elemento) { 
		
		No<Livros> titulo = new No<Livros> (elemento);
		
		 
		if(this.tamanho == 0) { // A lista está vazia
			this.inicio = titulo;	
			
		} else { // A lista não está vazia
			this.ultimo.setProximo(titulo);
			
		}
		
		this.ultimo = titulo;
		
		livroAp.cadastraLivro(elemento);
		this.tamanho++;
		
	}
	
	// ordenar os objetos Livro presentes na lista em ordem alfabética
	public void ordenar() {
		
	}
	public void deletar() {
			
			int i = 0;
			No<Livros> atual = this.inicio;
			No<Livros> anterior = null;
			
			while(i < this.tamanho) {
			
				anterior = atual;
				atual = atual.getProximo();
				
				i++;
			}
			
			anterior.setProximo(null);
			this.ultimo = anterior;
			
			this.tamanho--;		
			
		}
	
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	// retorna o Livro que está na posição da lista indicada no argumento (parâmetro)
	public Livros getLivro(int posicao) {
		
		int i = 0;
		No<Livros> aux = this.inicio;
		
		while(i < posicao) {
		
			aux = aux.getProximo();
			
			i++;
		}
		return aux.getElemento();
	}
	
	
	
	@Override
	public String toString() {
		return "ListaDeLivros [inicio=" + inicio + "]";
	}
	
	public void ListaLivro() {
		
		int i = 0;
		String temporaria = "";
		while(i<tamanho) {
			temporaria+="Título do Livro: " + getLivro(i).getTitulo() + ", ISBN: " + getLivro(i).getIsbn() + ", Editora: " + getLivro(i).getEditora() + ", ano de publicação: " + getLivro(i).getAnoPublicacao() + "\n"  ;
		
			i++;
		}
		livroAp.ListaLivro(temporaria);
	}

	
	
	
	
	

}


