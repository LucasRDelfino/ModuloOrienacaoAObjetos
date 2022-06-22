package br.com.fiap.banco;

public abstract class Conta {

	// atributos
	protected long numeroConta;
	protected double saldo;
	protected Cliente cliente;

	
	public Conta(long numeroConta,Cliente cliente) {
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		
	}

	// métodos 
	// sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	// transfeir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}

	// exibirSaldo
	public abstract void exibirSaldo();
	
}
