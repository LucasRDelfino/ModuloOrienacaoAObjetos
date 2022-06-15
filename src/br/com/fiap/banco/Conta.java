package br.com.fiap.banco;

public class Conta {
	private String nomeConta;
	private String Cpf;
	private long numeroConta;
	private double saldo;
	
	

	

public Conta(long numeroConta , String nomeConta, String cpf ) {
		this.nomeConta = nomeConta;
		this.Cpf = cpf;
		this.numeroConta = numeroConta;
		System.out.println("Conta criada");
	}

public boolean sacar(double valor) {
	if (valor>0) {
		if(this.saldo>= valor) {
			this.saldo -= valor;
			return true;
		}
	}
	System.out.println("Saldo Insufuiciente");
	return false;
}

public void depositar (double valor) {
	if(valor>3) {
	this.saldo += valor;
	}
}

public void transfeir (double valor , Conta conta) {
	boolean teste = this.sacar(valor);
	if (teste==true ) {
	conta.depositar(valor);
	}
}

public void exibirSaldo () {
	System.out.println("Cliente : " +this.nomeConta);
	System.out.println("Saldo : " +this.saldo);
	
	

}
}