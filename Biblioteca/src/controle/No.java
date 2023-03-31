package controle;

public class No <Livros>{
	
	private Livros elemento;
	private No<Livros> proximo;
	
	
	
	
	public No(Livros elemento) {

		this.elemento = elemento;
		this.proximo = null;
	}
	
	
	
	public No(Livros elemento, No<Livros> proximo) {
		
		this.elemento = elemento;
		this.proximo = proximo;
	}



	public Livros getElemento() {
		return elemento;
	}
	public void setElemento(Livros elemento) {
		this.elemento = elemento;
	}
	public No<Livros> getProximo() {
		return proximo;
	}
	public void setProximo(No<Livros> proximo) {
		this.proximo = proximo;
	}



	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}




}
