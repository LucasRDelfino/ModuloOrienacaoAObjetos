package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double SaldoInvestimento;
	

	public ContaCorrente(long numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
		
	}
	
	public void Investir (Conta conta , double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}
	@Override
	public void exibirSaldo() {
		
	}
	
}
