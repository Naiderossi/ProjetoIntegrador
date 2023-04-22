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
	
	
	ppublic int menuLivro(){
		int opcaoMenuLivro;
		opcaoMenuLivro = Integer.parseInt(
		JOptionPane.showInputDialog(null, "\t Livros "
				+ "\n 1-Cadastrar no fim "
				+ "\n 2-Cadastrar no inicio "
				+ "\n 3- Listar "
				+ "\n 4- Tamanho da Lista "
				+ "\n 5- Posição "
				+ "\n 6- Deletar Livro "
				+ "\n 7- Ordenar em ordem alfabética "
				+ "\n 8- Buscar livro por autor "
				+ "\n 9- Buscar livro por ano de publicacao"
				+ "\n 10- Buscar livro usando uma palavra-chave"
				+ "\n 0-Sair")
		);
		return opcaoMenuLivro;
	}
	
	public void posicaoDesejo(ListaDeLivros listaLivros) {
		int posicao;
		posicao=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posicao"));
		
		JOptionPane.showMessageDialog(null, listaLivros.getLivro(posicao).getTitulo()+" é o livro localizado na posição "+posicao);
	}
	
	public int menuAutor(){
		int opcaoMenuAutor;
		opcaoMenuAutor= Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tAutores \n1-Cadastro\n2-Listar\n0-Sair")
		);
		return opcaoMenuAutor;
	}
	

}
