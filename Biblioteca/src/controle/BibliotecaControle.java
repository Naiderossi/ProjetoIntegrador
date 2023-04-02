package controle;

import apresentacao.BibliotecaAP;
import modelo.Livros;

public class BibliotecaControle {
	
	
	
	BibliotecaAP biblioAP = new BibliotecaAP();
	ListaDeAutores listaAutores = new ListaDeAutores();
	ListaDeLivros listaLivros = new ListaDeLivros();

	
	// no construtor do SAControle � acionado o popula e o menu principal
	public BibliotecaControle() {
		//popula();
		int opcao = 5;
		do {
			opcao = biblioAP.menuPrincipal();
			if (opcao == 1) {
				menuAutor(biblioAP.menuAutor());
			}
			if (opcao == 2) {
				menuLivro(biblioAP.menuLivro());
			}
			
		} while (opcao > 0);
	}
	

	// antes de adicionar um aluno, ele vai at� o curso para recebe-lo e passalo
	// ao aluno
	public void menuAutor(int opcao) {
		if (opcao == 1) {
			listaAutores.adicionaAutor();
		}
		if (opcao == 2) {
			listaAutores.listaAutor();
		}
	}

	
	public void menuLivro(int opcao) {
		if (opcao == 1) {
			Livros livro = new Livros();
			listaLivros.adiciona(livro);
		}
		if (opcao == 2) {
			Livros livro = new Livros();
			listaLivros.incluirNoInicio(livro);
		}
		if (opcao == 3) {
			System.out.println("Listar...");
		}
	}
	
	public ListaDeLivros getListaDeLivros() {
		return this.listaLivros;
	}


}
