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
		 
		if(this.tamanho == 0) { // A lista estÃ¡ vazia
			this.inicio = titulo;
			this.ultimo = titulo;
		} else { // A lista nÃ£o estÃ¡ vazia
			
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
		
		 
		if(this.tamanho == 0) { // A lista estÃ¡ vazia
			this.inicio = titulo;	

		} else { // A lista nÃ£o estÃ¡ vazia
			this.ultimo.setProximo(titulo);
			
		}
		
		this.ultimo = titulo;
		
		livroAp.cadastraLivro(elemento, autor);
		this.tamanho++;
		
	}
	
	// ordenar os objetos Livro presentes na lista em ordem alfabÃ©tica
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

	
	public int getTamanho() {
		return this.tamanho;
	}
	
	// retorna o Livro que estÃ¡ na posiÃ§Ã£o da lista indicada no argumento (parÃ¢metro)
	public Livros getLivro(int posicao) {
		
		int i = 0;
		No<Livros> aux = this.inicio;
		
		while(i < posicao) {
		
			aux = aux.getProximo();
			
			i++;
		}
		return aux.getElemento();
	}
	

	
	public void ListaLivro() {
		
		int i = 0;
		String temporaria = "";
		while(i<tamanho) {

			temporaria+="Título do Livro: " + getLivro(i).getTitulo() + " Autor do livro: " + getLivro(i).getAutor().getNome()+", ISBN: " + getLivro(i).getIsbn() + ", Editora: " + getLivro(i).getEditora() + ", ano de publicação: " + getLivro(i).getAnoPublicacao() + "\n"  ;
			i++;
		}
		livroAp.ListaLivro(temporaria);
	}
	
	public void ListaLivroPorAutor(Autor autor) {
		
		String temporaria = "";
		int n = tamanho;
		for (int i = 0; i < n; i++) {
			if ((getLivro(i).getAutor().getNome().equals(autor.getNome()))) {
				temporaria += getLivro(i).getTitulo()+ "\n";
			}
		}
		livroAp.ListaLivro(temporaria);
	}
	
	
	
	public void ListaLivroPorAnoPubli(int anoInicio, int anoFim) {
		
		String temporaria = "";
		int n = tamanho;
		for (int i = 0; i < n; i++) {
			if ((getLivro(i).getAnoPublicacao() >= anoInicio && (getLivro(i).getAnoPublicacao() <= anoFim))) {
				temporaria += getLivro(i).getTitulo()+ "\n";
			}
		}
		livroAp.ListaLivro(temporaria);
	}
	
	
	public void ListaLivroPorPalavraChave(String palavraChave) {

		String temporaria = "";
		int n = tamanho;
		for (int i = 0; i < n; i++) {	
			if (getLivro(i).getTitulo().toLowerCase().contains(palavraChave.toLowerCase())) {
				temporaria += "Foram encontrados os seguintes livros: " + 
			"\nTítulo: " + getLivro(i).getTitulo()+ 
			"\nAutor: " + getLivro(i).getAutor().getNome() +
			"\nEditora: " + getLivro(i).getEditora() +
			"\n\n";
			}
		}
		livroAp.ListaLivro(temporaria);	
	
	}
	

}


