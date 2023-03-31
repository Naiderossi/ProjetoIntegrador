package controle;
import apresentacao.LivroAp;
import modelo.Livros;


public class ListaDeLivros {
	
	LivroAp livroAp = new LivroAp();
	
	
	private No<Livros> inicio;
	private No<Livros> ultimo;
	private int tamanho;
	
	
	public void adiciona (Livros elemento) {
		
		No<Livros> titulo = new No<Livros> (elemento);
		Livros livro = new Livros();
		 
		if(this.tamanho == 0) {
			this.inicio = titulo;	
			} else { 
				this.ultimo.setProximo(titulo);
			}
		
		this.ultimo = titulo;
		
		livroAp.cadastraLivro(livro);
		this.tamanho++;
		
	}
	
	
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "ListaDeLivros [inicio=" + inicio + "]";
	}

	
	
	
	

}


