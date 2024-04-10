public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	public Produto (String n, double p, int q) {
		this.nome = n;
		this.preco = p;
		this.quantidade = q;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double calcularTotal() {
		return (this.preco * this.quantidade);
	}
}	
