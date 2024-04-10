public class Cliente {
	private String nome;
	private String cpf;
	private Data dataNascimento;
	
	public Cliente (String n, String c, Data d) {
		this.nome = n;
		this.cpf = c;
		this.dataNascimento = d;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String imprimirCliente() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nasc: " + dataNascimento.imprimirData();
	}
	
}
