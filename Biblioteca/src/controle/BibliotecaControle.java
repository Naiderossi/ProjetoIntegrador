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
		popula();
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
			JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!" + "\n" + autor.toString());
		}
		if (opcao == 2) {
			listaAutores.listaAutor();
		}
	}

	
	public void menuLivro(int opcao) {
		
			if (opcao == 1) {
				Livros livro = new Livros();
	
				listaLivros.adiciona(livro, listaAutores.selecionaAutor());
				JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!" + "\n" + livro.toString());
			}else 
			
			if (opcao == 2) {
				Livros livro = new Livros();
				listaLivros.incluirNoInicio(livro, listaAutores.selecionaAutor());
				JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!" + "\n" + livro.toString());
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
			
			else if(opcao==8) {
			
			 listaLivros.ListaLivroPorAutor(listaAutores.selecionaAutor());
			}
		
			else if(opcao==9) {
			
			String input1 = JOptionPane.showInputDialog("Digite o ano de inicio do intervalo:");
			int anoInicio = Integer.parseInt(input1);
			
			String input2 = JOptionPane.showInputDialog("Digite o ano de fim do intervalo:");
			int anoFim = Integer.parseInt(input2);
			
			 listaLivros.ListaLivroPorAnoPubli(anoInicio, anoFim);
			}

			else if(opcao==10) {
			String palavraChave = JOptionPane.showInputDialog(null, "Digite uma palavra ou frase presente no título dos livros desejados:");
			
			listaLivros.ListaLivroPorPalavraChave(palavraChave);
			
			}
			else { //Caso o usuário nao digite nem um número correto. 
				
					JOptionPane.showMessageDialog(null, "Você digitou o código errado!");
					menuLivro(biblioAP.menuLivro());
				}
			}
			

	public ListaDeLivros getListaDeLivros() {
		return this.listaLivros;
	}
	
	public void popula() {
		populaAutor();
	
	}
		
	public void populaAutor() {
	    listaAutores.populaAutor("Ferreira Gullar", "Brasil");
	    listaAutores.populaAutor("Miguel de Cervantes", "Espanha");
	    listaAutores.populaAutor("William Shakespeare", "Reino Unido");
	    
	}
	
	


}
