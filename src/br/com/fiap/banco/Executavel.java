package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1,"Lucas Delfino","4405492895");
		Conta conta2 = new Conta(2 , "Bruno Aquino" , "3943894239");
		Conta conta3 = new Conta(3 , "Daivinho" , "47253132763");
		
		conta1.depositar(10000);
		conta2.depositar(5000);
		conta3.depositar(3000);
		
		
		conta1.exibirSaldo();
		conta2.exibirSaldo();
		conta3.exibirSaldo();
		
		conta1.sacar(9000);
		conta2.sacar(2000);
		conta3.sacar(500);
		
		conta1.exibirSaldo();
		conta2.exibirSaldo();
		conta3.exibirSaldo();
		
		
		
		
	}

}
