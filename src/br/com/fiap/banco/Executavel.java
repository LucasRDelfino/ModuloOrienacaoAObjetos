package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Lucas Delfino" ,"Canuto Borelli , 273", 320919,"lucasrdelfino20005@gmail.com");
		Cliente cliente2 = new Cliente("Bruninho Delas" ,"Yervant, 100",7878787,"bruno.teya@gmail.com");
		Cliente cliente3 = new Cliente("Julio Cesar" ,"Grajau, 1000", 56565656,"julio.cesar@gmail.com");
		
	
		Conta conta1 = new Conta(1,cliente1);
		Conta conta2 = new Conta(2,cliente2);
		Conta conta3 = new Conta(2,cliente3);
		
		conta1.depositar(10000);
		conta2.depositar(5000);
		conta3.depositar(2000);
		
		
		conta1.exibirSaldo();
		conta2.exibirSaldo();
		conta3.exibirSaldo();
		
	}

}
