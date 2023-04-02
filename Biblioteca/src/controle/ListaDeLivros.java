package controle;
import apresentacao.LivroAp;
import modelo.Livros;


public class ListaDeLivros {
	
	LivroAp livroAp = new LivroAp();
	
	
	private No<Livros> inicio;
	private No<Livros> ultimo;
	private int tamanho;
	
	// incluir um Livro no inicio da lista
	public void incluirNoInicio(Livros elemento) {
		
		No<Livros> titulo = new No<Livros> (elemento);
		//Livros livro = new Livros();
		 
		if(this.tamanho == 0) { // A lista est� vazia
			this.inicio = titulo;
			this.ultimo = titulo;
		} else { // A lista n�o est� vazia
			
			No<Livros> primeiro = this.inicio;
			
			this.inicio = titulo;
			this.inicio.setProximo(primeiro);
		}
		
		livroAp.cadastraLivro(elemento);
		this.tamanho++;
		
	}
	
	// incluir um Livro no final da lista
	public void adiciona (Livros elemento) { // pela proposta da atividade, esse metodo deveria se chamar incluirNoFIm, veririfar se � necess�rio alterar
		
		No<Livros> titulo = new No<Livros> (elemento);
		//Livros livro = new Livros();
		 
		if(this.tamanho == 0) { // A lista est� vazia
			this.inicio = titulo;	
		} else { // A lista n�o est� vazia
			this.ultimo.setProximo(titulo);
		}
		
		this.ultimo = titulo;
		
		livroAp.cadastraLivro(elemento);
		this.tamanho++;
		
	}
	
	// ordenar os objetos Livro presentes na lista em ordem alfab�tica
	public void ordenar() {
		
	}
	
	// remove um Livro do final da lista e o retorna
	public void removerDoFim() {
		
		// percorrer toda a lista, salvando em uma vari�vel o atual e o anterior
		
		// quando o atual for o ultimo (podes comparar com o tamanho)
		
		// apagar a posi��o atual
		
		// setar o pr�ximo do anterior como null
		
		// alterar o tamanho (tamanho--)
		
	}
	
	// retorna a quantidade de livros na lista
	public int getTamanho() {
		return this.tamanho;
	}
	
	// retorna o Livro que est� na posi��o da lista indicada no argumento (par�metro)
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

	
	
	
	

}


