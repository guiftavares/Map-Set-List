package Set;

public class Book {
	
	String nomeLivro;
	String nomeAutor;
		
		
	public Book (String nomeAutor, String nomeLivro ) {
		this.nomeLivro = nomeLivro;
		this.nomeAutor = nomeAutor;
	}
	
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public String getNomeAutor() {
		return nomeAutor;
	}
	
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	
		
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeLivro == null) ? 0 : nomeLivro.hashCode());
		result = prime * result + ((nomeAutor == null) ? 0 : nomeAutor.hashCode());
		return result;
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
				if (nomeLivro == null) {
			if (other.nomeLivro != null)
				return false;
		} else if (!nomeLivro.equals(other.nomeLivro))
			return false;
				if (nomeAutor == null) {
					if (other.nomeAutor != null)
						return false;
				} else if (!nomeAutor.equals(other.nomeAutor))
					return false;
		return true;
	}
	
	public String toString() {
		return " Título: " + nomeLivro + " | Autor: " + nomeAutor;
	}


}


