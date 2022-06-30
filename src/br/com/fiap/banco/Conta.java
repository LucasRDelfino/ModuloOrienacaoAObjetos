package br.com.fiap.banco;

public abstract class Conta {

	// atributos
	private static int contador;
	protected long numeroConta;
	protected double saldo;
	protected Cliente cliente;

	
	public Conta(long numeroConta,Cliente cliente) {
		contador++;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		
	}

	// métodos 
	// sacar
	public boolean sacar(double valor)throws SaldoInsuficiente {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			} else {
				throw new SaldoInsuficiente("Sado Insuficiente");
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
		boolean teste = false;
		try {
			teste = this.sacar(valor);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (teste == true) {
			conta.depositar(valor);
			return true;
		}
		return false; 
	}
	
	private static int Contador;
	
	public static void exibirContador() {
		System.out.println("Conta Criadas : "+contador);
	}
	
	

	// exibirSaldo
	public abstract void exibirSaldo();
	
}
