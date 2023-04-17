package controle;

import javax.swing.JOptionPane;

import apresentacao.BibliotecaAP;
import modelo.Livros;

public class BibliotecaControle {
	
	
	
	BibliotecaAP biblioAP = new BibliotecaAP();
	ListaDeAutores listaAutores = new ListaDeAutores();
	ListaDeLivros listaLivros = new ListaDeLivros();

	
	// no construtor do SAControle ï¿½ acionado o popula e o menu principal
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
<<<<<<< HEAD
			listaLivros.adiciona(livro);
		}else
		if (opcao == 2) {
			Livros livro = new Livros();
			listaLivros.incluirNoInicio(livro);
		}else
=======
			listaLivros.adiciona(livro, listaAutores.selecionaAutor());
		}
		if (opcao == 2) {
			Livros livro = new Livros();
			listaLivros.incluirNoInicio(livro, listaAutores.selecionaAutor());
		}
>>>>>>> 2c5a9b1f74282a212f80b3ce4a228d21b9debd35
		if (opcao == 3) {
			
			listaLivros.ListaLivro();
		}else
		if (opcao == 4) {
			JOptionPane.showMessageDialog(null, "A lista contém "+listaLivros.getTamanho()+" livros!");
			
		}else
		if(opcao==5) {
			biblioAP.posicaoDesejo(listaLivros);
			
		}else if(opcao==6) {
			listaLivros.deletar();
		}
	}
	
	public ListaDeLivros getListaDeLivros() {
		return this.listaLivros;
	}


}
