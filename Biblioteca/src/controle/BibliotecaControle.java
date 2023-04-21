package controle;

import javax.swing.JOptionPane;

import apresentacao.BibliotecaAP;
import modelo.Livros;

public class BibliotecaControle {
	
	
	
	BibliotecaAP biblioAP = new BibliotecaAP();
	ListaDeAutores listaAutores = new ListaDeAutores();
	ListaDeLivros listaLivros = new ListaDeLivros();

	
	// no construtor do SAControle Ã¯Â¿Â½ acionado o popula e o menu principal
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
	
				listaLivros.adiciona(livro, listaAutores.selecionaAutor());
				
			}else 
			
			if (opcao == 2) {
				Livros livro = new Livros();
				listaLivros.incluirNoInicio(livro, listaAutores.selecionaAutor());
				
			}else 
	
			if (opcao == 3) {
				
				listaLivros.ListaLivro();
			
			}else 
			if (opcao == 4) {
				JOptionPane.showMessageDialog(null, "A lista contem "+listaLivros.getTamanho()+" livros!");
				
			}else 
			if(opcao==5) {
				biblioAP.posicaoDesejo(listaLivros);
				
			}else if(opcao==6) {
				listaLivros.deletar();
				
			}
			else if(opcao==7) {
				 listaLivros.ordenar();
			}
			else { //Caso o usuário nao digite nem um número correto. 
				
					JOptionPane.showMessageDialog(null, "Você digitou o código errado!");
					menuLivro(biblioAP.menuLivro());
				}
			}
			
		
	
		
		
	
	public ListaDeLivros getListaDeLivros() {
		return this.listaLivros;
	}


}
