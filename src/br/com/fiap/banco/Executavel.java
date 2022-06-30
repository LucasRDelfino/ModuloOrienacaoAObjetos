package br.com.fiap.banco;

import br.com.fiap.banco.Produto.CDB;
import br.com.fiap.banco.Produto.LCA;
import br.com.fiap.banco.Produto.LCI;

public class Executavel {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Lucas Delfino" ,"Canuto Borelli , 273", 320919,"lucasrdelfino20005@gmail.com");
		Cliente cliente2 = new Cliente("Bruninho Delas" ,"Yervant, 100",7878787,"bruno.teya@gmail.com");
		Cliente cliente3 = new Cliente("Julio Cesar" ,"Grajau, 1000", 56565656,"julio.cesar@gmail.com");
		
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
	
		ContaCorrente conta1 = new ContaCorrente(1,cliente1);
		
		ContaPoupanca conta2 = new ContaPoupanca(1,cliente2);
		
		conta1.depositar(1000);
		
		try {
			conta1.Investir(1000,lca);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		
		conta1.exibirSaldo();
		
		try {
			conta1.Resgatar(100);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}
		
		conta1.exibirSaldo();
		
		conta1.transferir(conta2, 100);
		conta2.exibirSaldo();
		
		Conta.exibirContador();
	}

}
