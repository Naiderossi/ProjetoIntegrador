package controle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import apresentacao.BibliotecaAP;
import modelo.Livros;


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
	public void incluirNoInicio(Livros elemento, Autor autor) {
		
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
		
		livroAp.cadastraLivro(elemento, autor);
		this.tamanho++;
		
	}
	
	// incluir um Livro no final da lista

	
	public void adiciona (Livros elemento, Autor autor) {  

		
		No<Livros> titulo = new No<Livros> (elemento);
		
		 
		if(this.tamanho == 0) { // A lista está vazia
			this.inicio = titulo;	

		} else { // A lista não está vazia
			this.ultimo.setProximo(titulo);
			
		}
		
		this.ultimo = titulo;
		
		livroAp.cadastraLivro(elemento, autor);
		this.tamanho++;
		
	}
	
	// ordenar os objetos Livro presentes na lista em ordem alfabética
	public void ordenar() {
			ArrayList<String> titulos = new ArrayList<String>();
			int i = 0;
			while(i < this.tamanho) {
				titulos.add(getLivro(i).getTitulo()) ;
				i++;
			}
			Collections.sort(titulos);
			JOptionPane.showMessageDialog(null, titulos.toString());
			
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

	
	// remove um Livro do final da lista e o retorna

		
		
		// percorrer toda a lista, salvando em uma variável o atual e o anterior
		
		// quando o atual for o ultimo (podes comparar com o tamanho)
		
		// apagar a posição atual
		
		// setar o próximo do anterior como null
		
		// alterar o tamanho (tamanho--)
		

	
	
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

			temporaria+="T�tulo do Livro: " + getLivro(i).getTitulo() + " Autor do livro: " + getLivro(i).getAutor().getNome()+", ISBN: " + getLivro(i).getIsbn() + ", Editora: " + getLivro(i).getEditora() + ", ano de publica��o: " + getLivro(i).getAnoPublicacao() + "\n"  ;
			i++;
		}
		livroAp.ListaLivro(temporaria);
	}

	
	
	
	
	

}


