package apresentacao;

import javax.swing.JOptionPane;

import controle.ListaDeLivros;

import modelo.Livros;



public class LivroAp {

	

	public void cadastraLivro(Livros elemento) {
		elemento.setTitulo(JOptionPane.showInputDialog("Digite o título do livro:"));

		
			
	}
	
	
	
}
