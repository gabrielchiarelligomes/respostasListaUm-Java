public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	
	public Cachorro (String n, String r, int i) {
		this.nome = n;
		this.raca = r;
		this.idade = i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
		return "au au";
	}
}
