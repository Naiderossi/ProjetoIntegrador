package modelo;

public class Livros {
	
	
	private String titulo;
	private String isbn;
	private Autor autor;
	private String editora;
	private int anoPublicacao;
	
	
	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	@Override
	public String toString() {
		return "Título: " + titulo +
                "\nISBN: " + isbn +
                "\nEditora: " + editora +
                "\nAno de publicação: " + anoPublicacao +
                "\nAutor: " + autor.getNome() +
                "\nPaís de origem do autor: " + autor.getPaisOrigem();
    }
	
	@Override
	public boolean equals(Object obj) {
	
		if (obj == this) {
	         return true;
	      }
	      if (!(obj instanceof Livros)) {
	         return false;
	      }
	      Livros livro = (Livros) obj;
	      return titulo.equalsIgnoreCase(livro.getTitulo()); 
	    	
	}
	
	
	
	

}
