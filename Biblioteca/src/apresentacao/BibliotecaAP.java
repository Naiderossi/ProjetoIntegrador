package apresentacao;

import javax.swing.JOptionPane;
import controle.BibliotecaControle;
import controle.ListaDeLivros;

public class BibliotecaAP {
		
	//BibliotecaControle biblioControlee = new BibliotecaControle();
	public int menuPrincipal(){
		int opcaoMenuPrincipal;
		opcaoMenuPrincipal = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tMenu Pricipal\n1-Autor\n2-Livro\n0-Sair")
		);
		return opcaoMenuPrincipal;
	}
	
	
	public int menuLivro(){
		int opcaoMenuLivro;
		opcaoMenuLivro = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\t Livros \n 1-Cadastrar no fim \n 2-Cadastrar no ínicio \n 3- Listar \n4- Tamanho da Lista\n 5- Posição\n 6- Deletar Livro \n 0-Sair")
		);
		return opcaoMenuLivro;
	}
	public void posicaoDesejo(ListaDeLivros listaLivros) {
		int posicao;
		posicao=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posicao"));
		String str ="";
		System.out.println(listaLivros.getLivro(posicao).getTitulo()); ;
		JOptionPane.showMessageDialog(null, str);
	}
	
	public int menuAutor(){
		int opcaoMenuAutor;
		opcaoMenuAutor= Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tAutores \n1-Cadastro\n2-Listar\n0-Sair")
		);
		return opcaoMenuAutor;
	}
	

}
