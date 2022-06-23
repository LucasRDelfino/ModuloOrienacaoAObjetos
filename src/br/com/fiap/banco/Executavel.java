package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Lucas Delfino" ,"Canuto Borelli , 273", 320919,"lucasrdelfino20005@gmail.com");
		Cliente cliente2 = new Cliente("Bruninho Delas" ,"Yervant, 100",7878787,"bruno.teya@gmail.com");
		Cliente cliente3 = new Cliente("Julio Cesar" ,"Grajau, 1000", 56565656,"julio.cesar@gmail.com");
		
	
		ContaCorrente conta1 = new ContaCorrente(1,cliente1);
		
		ContaPoupanca conta2 = new ContaPoupanca(1,cliente2);
		
		conta1.depositar(1000);
		
		conta1.Investir(1000,"LCA");
		
		conta1.exibirSaldo();
		
		conta1.Resgatar(1006);
		
		conta1.exibirSaldo();
		
		conta1.transferir(conta2, 100);
		conta2.exibirSaldo();
	}

}
