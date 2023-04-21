package apresentacao;

import javax.swing.JOptionPane;

import controle.ListaDeLivros;
import modelo.Autor;
import modelo.Livros;



public class LivroAp {

	

	public void cadastraLivro(Livros elemento, Autor autor) {
		elemento.setTitulo(JOptionPane.showInputDialog("Digite o titulo do livro:"));
		elemento.setIsbn(JOptionPane.showInputDialog("Digite o isbn"));
		//elemento.setAutor(JOptionPane.showInputDialog("Digite autor do livro:"));
		elemento.setAutor(autor);
		elemento.setEditora(JOptionPane.showInputDialog("Digite editora do livro:"));
		elemento.setAnoPublicacao(Integer.parseInt((JOptionPane.showInputDialog("Digite o ano do livro:"))));
		
	}
	
	public void ListaLivro(String listaLivro) {
		JOptionPane.showMessageDialog(null,listaLivro);
	
	}
	 
	
	
}
