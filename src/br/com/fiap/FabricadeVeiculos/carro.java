package br.com.fiap.FabricadeVeiculos;

public class carro extends Veiculo {
	private String aerofolio;



public carro(String marca, String roda, String cambio, String motor, String modelo, String cor, String renavam,
			String nomeMotorista, String placa, int anoFabricacao, int anoModelo, double velocidade, String aerofolio) {
		super(marca, roda, cambio, motor, modelo, cor, renavam, nomeMotorista, placa, anoFabricacao, anoModelo,
				velocidade);
		this.aerofolio = aerofolio;
	}









@Override
public void exibirDados() {
	System.out.println("Marca : " + this.marca);
	System.out.println("Modelo : " + this.modelo);
	System.out.println("Cor : " + this.cor);
	System.out.println("Ano de Fabricação : " + this.anoFabricacao);
	System.out.println("Ano modelo : " + this.anoModelo);
	System.out.println("Renavam : " + this.renavam);
	System.out.println("Motor : " + this.motor);
	System.out.println("Cambio : " + this.cambio);
	System.out.println("Aro da Roda : " + this.roda);
	System.out.println("Velocidade : " + this.velocidade);
	System.out.println("Condutor : " + this.nomeMotorista);
	System.out.println("Placa : " + this.placa);
	System.out.println("Aerofolio : " + this.aerofolio);
	
	
}
	
}
