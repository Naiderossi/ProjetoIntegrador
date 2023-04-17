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
<<<<<<< HEAD
	public void adiciona (Livros elemento) { 
=======
	public void adiciona (Livros elemento, Autor autor) { // pela proposta da atividade, esse metodo deveria se chamar incluirNoFIm, veririfar se é necessário alterar
>>>>>>> 2c5a9b1f74282a212f80b3ce4a228d21b9debd35
		
		No<Livros> titulo = new No<Livros> (elemento);
		
		 
		if(this.tamanho == 0) { // A lista está vazia
			this.inicio = titulo;	
<<<<<<< HEAD
			
		} else { // A lista n�o est� vazia
			this.ultimo.setProximo(titulo);
			
=======
			//System.out.println("entrou no tamanho=> zero  >incluir no fim<");
		} else { // A lista não está vazia
			this.ultimo.setProximo(titulo);
			//System.out.println("agora a lista não está vazia  >incluir no fim<");
			//System.out.println(tamanho);
>>>>>>> 2c5a9b1f74282a212f80b3ce4a228d21b9debd35
		}
		
		this.ultimo = titulo;
		
		livroAp.cadastraLivro(elemento, autor);
		this.tamanho++;
		
	}
	
	// ordenar os objetos Livro presentes na lista em ordem alfabética
	public void ordenar() {
		
	}
<<<<<<< HEAD
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
=======
	
	// remove um Livro do final da lista e o retorna

		
		
		// percorrer toda a lista, salvando em uma variável o atual e o anterior
		
		// quando o atual for o ultimo (podes comparar com o tamanho)
		
		// apagar a posição atual
		
		// setar o próximo do anterior como null
		
		// alterar o tamanho (tamanho--)
		
>>>>>>> 2c5a9b1f74282a212f80b3ce4a228d21b9debd35
	
	
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
<<<<<<< HEAD
			temporaria+="T�tulo do Livro: " + getLivro(i).getTitulo() + ", ISBN: " + getLivro(i).getIsbn() + ", Editora: " + getLivro(i).getEditora() + ", ano de publica��o: " + getLivro(i).getAnoPublicacao() + "\n"  ;
=======
			temporaria+="Título do Livro: " + getLivro(i).getTitulo() + ", ISDN: " + getLivro(i).getIsbn() + ", Editora: " + getLivro(i).getEditora() + ", ano de publicação: " + getLivro(i).getAnoPublicacao() + "\n"  ;
>>>>>>> 2c5a9b1f74282a212f80b3ce4a228d21b9debd35
		
			i++;
		}
		livroAp.ListaLivro(temporaria);
	}

	
	
	
	
	

}


