package principal;

import controle.BibliotecaControle;
import modelo.Livros;
import controle.ListaDeLivros;

public class Biblioteca {

	public static void main(String[] args) {
		
		
		BibliotecaControle biblioControle = new BibliotecaControle();
		
		System.out.println(biblioControle.getListaDeLivros().getLivro(0).getTitulo());
		System.out.println(biblioControle.getListaDeLivros().getLivro(1).getTitulo());
		                                                                            
		/*ListaDeLivros listaLivros = new ListaDeLivros();
		Livros livro = new Livros();
		
		listaLivros.adiciona(livro);
		
		System.out.println(listaLivros.getLivro(0).getTitulo());*/
		
		//System.out.println(listaLivros);
		
		
	
	}
}
