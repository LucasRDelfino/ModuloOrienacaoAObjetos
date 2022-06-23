package br.com.fiap.banco;

public class ContaCorrente extends Conta{
	private double saldoInvestimento;
	private String nomeInvestimento;
	

	public ContaCorrente(long numeroConta, Cliente cliente) {
		super(numeroConta, cliente);
		
	}
			
	
	public void Investir (double valor , String nomeInvestimento) {
		boolean teste = this.sacar(valor);
			if (teste == true) {
				if(nomeInvestimento.equals("CDB")) {
					saldoInvestimento += valor * (1+0.008);		
				}else if (nomeInvestimento.equals("LCA")) {
					saldoInvestimento += valor * (1+0.007);	
				}else if (nomeInvestimento.equals("LCI")) {
					saldoInvestimento += valor * (1+0.006);	
				}else {
					System.out.println("Esse investimento não existe nesse software");
						
				}
			}
			

	}
		
	public void Resgatar (double valor) {
		boolean teste = this.depositar(valor);
		if (teste == true) {
			saldoInvestimento -= valor;
			
			}
		}
	
	
	@Override
	public void exibirSaldo() {
		System.out.println("Nome Cliente : " + this.cliente.getNome());
		System.out.println("Saldo Investimento : " + this.saldoInvestimento);
		System.out.println("Saldo: " + this.saldo);
		
	}
	
}
