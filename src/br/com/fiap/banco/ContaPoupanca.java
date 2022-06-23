package br.com.fiap.banco;

public class ContaPoupanca extends Conta{
	private double saldoAplicacao;

	public ContaPoupanca(long numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
		
	}
	

	@Override
	public void exibirSaldo() {
		System.out.println("Nome Cliente: " + this.cliente.getNome());
		System.out.println("Saldo Poupança: " + this.saldo);
		
		
	}

}
