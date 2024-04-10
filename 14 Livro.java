public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int anoPublicacao;
	
	public Livro (String t, String a, String e, int aP) {
		this.titulo = t;
		this.autor = a;
		this.editora = e;
		this.anoPublicacao = aP;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
}
