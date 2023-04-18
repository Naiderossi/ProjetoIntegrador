package controle;

import java.util.ArrayList;

import apresentacao.AutorAp;
import modelo.Autor;

public class ListaDeAutores {
	
	
private ArrayList<Autor> listaAutor = new ArrayList<Autor>();
	
	private AutorAp autorAP = new AutorAp();

	
	public void adicionaAutor() {
		Autor autor = new Autor();
		autorAP.cadastraAutor(autor);
		listaAutor.add(autor);
	}

	
	
	public void listaAutor() {
		String listaTemporaria = "";
		int n = listaAutor.size();
		for (int i = 0; i < n; i++) {
			listaTemporaria += Integer.toString(i) + " - "
					+ listaAutor.get(i).getNome() + "- " + 
					   listaAutor.get(i).getPaisOrigem() + "\n";

		}
		autorAP.listaAutor(listaTemporaria);
	}
		public Autor selecionaAutor() {
		String listaTemporaria = "";
		int n = listaAutor.size();
		for (int i = 0; i < n; i++) {
			listaTemporaria += Integer.toString(i) + " - "
					+ listaAutor.get(i).getNome() + "\n";
		}
		int id= autorAP.selecionaAutor(listaTemporaria);
		return listaAutor.get(id);
	}
		
		
}
}
