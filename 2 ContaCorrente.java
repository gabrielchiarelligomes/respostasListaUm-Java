package teste;
public class ContaCorrente {
	private int numeroDaConta;
	private double saldo;
	
	public ContaCorrente(int n, double s) {
		this.numeroDaConta = n;
		this.saldo = s;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Depositar(double d) {
		this.saldo += d;
	}
	
	public void Sacar(double sa) {
		this.saldo -= sa;
	
	}
	
	public String toString() {
		return "Numero da Conta: " + numeroDaConta + "\nSaldo: " + saldo;
		
	}
