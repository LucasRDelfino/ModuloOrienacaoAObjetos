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
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}

	// transferir
	public boolean transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
			return true;
		}
		return false; 
	}

	// exibirSaldo
	public abstract void exibirSaldo();
	
}
