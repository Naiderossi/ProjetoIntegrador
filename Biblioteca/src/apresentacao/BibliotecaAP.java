package apresentacao;

import javax.swing.JOptionPane;

public class BibliotecaAP {
	
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
		JOptionPane.showInputDialog(null, "\t Livros \n1-Cadastrar\n2-Listar\n0-Sair")
		);
		return opcaoMenuLivro;
	}
	
	
	public int menuAutor(){
		int opcaoMenuAutor;
		opcaoMenuAutor= Integer.parseInt(
		JOptionPane.showInputDialog(null, "\tAutores \n1-Cadastro\n2-Listar\n0-Sair")
		);
		return opcaoMenuAutor;
	}
	

}
