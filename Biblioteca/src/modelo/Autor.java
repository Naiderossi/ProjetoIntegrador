package modelo;

public class Autor {
	
	private String nome;
	private String paisOrigem;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	@Override
	public String toString() {
		return "Nome do autor " + nome +
                "\nPaís de origem: " + paisOrigem;
                
    }
	@Override
	public boolean equals(Object obj) {
		
		if (obj == this) {
	         return true;
	      }
	      if (!(obj instanceof Autor)) {
	         return false;
	      }
	      
	      Autor autor = (Autor) obj;
	      return (autor).equals(autor.getNome()); 
	    	
	}

	
	
}
