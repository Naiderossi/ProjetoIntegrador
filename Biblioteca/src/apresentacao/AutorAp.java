package apresentacao;

import javax.swing.JOptionPane;

import modelo.Autor;



public class AutorAp {
	
	
	public void cadastraAutor(Autor autor) {
		autor.setNome(JOptionPane.showInputDialog("Digite o nome do autor:"));
		autor.setPaisOrigem(JOptionPane.showInputDialog("Digite o pais de origem do autor: "));
	}
	
	
	public void listaAutor(String listaAutor){	
		JOptionPane.showMessageDialog(null,listaAutor);
	}
	
	public int selecionaAutor(String listaNomeAutor){	
		return Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo do autor:\n\n"+ listaNomeAutor ));
	}

}
