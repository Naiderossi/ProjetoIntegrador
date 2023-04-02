package apresentacao;

import javax.swing.JOptionPane;

import controle.ListaDeLivros;

import modelo.Livros;



public class LivroAp {

	

	public void cadastraLivro(Livros elemento) {
		elemento.setTitulo(JOptionPane.showInputDialog("Digite o título do livro:"));
		elemento.setIsbn(JOptionPane.showInputDialog("Digite o isbn do livro:"));
		//elemento.setAutor(JOptionPane.showInputDialog("Digite o autor do livro:"));
		elemento.setEditora(JOptionPane.showInputDialog("Digite o editora do livro:"));
		elemento.setAnoPublicacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de publicação do livro:")));

		//teste para github
			
	}
	
	
	
}
