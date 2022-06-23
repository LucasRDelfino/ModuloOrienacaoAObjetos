package br.com.fiap.FabricadeVeiculos;

public abstract class Veiculo {
	protected String marca,roda,cambio,motor,modelo,cor,renavam,nomeMotorista,placa;
	protected int anoFabricacao,anoModelo;
	protected double velocidade;
	protected boolean confirmacao;
	
	
	public Veiculo(String marca, String roda, String cambio, String motor, String modelo, String cor, String renavam,
			String nomeMotorista, String placa, int anoFabricacao, int anoModelo, double velocidade) {
		this.marca = marca;
		this.roda = roda;
		this.cambio = cambio;
		this.motor = motor;
		this.modelo = modelo;
		this.cor = cor;
		this.renavam = renavam;
		this.nomeMotorista = nomeMotorista;
		this.placa = placa;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.velocidade = velocidade;
		
	}

	public void ligar() {
		if (confirmacao == true) {
			System.out.println("Veículo ligado");
		} else {
			confirmacao = true;
			ligar();
		}
	}

	public void desligar() {
		if (confirmacao == false) {
			System.out.println("Veículo desligado");
		} else {
			confirmacao = false;
			desligar();
		}
	}

public void acelerar(double aceleracao) {
	if (confirmacao==true) {
		if(this.velocidade + aceleracao < 220){
		this.velocidade += aceleracao;
		System.out.println("Velocidade atual :" + this.velocidade+"Km/h");
		System.out.println("Aceleração : "+aceleracao+ "Km/h");
		
		}else if(this.velocidade + aceleracao > 220) {
			System.out.println("Veículo ultrapassou o limite de velocidade");
		}else{
			System.out.println("Veículo desligado" );
			ligar();
			acelerar(aceleracao);
		}
	}
	}
	public void frear(double frear) {
		if (confirmacao == true) {
			System.out.println("O CARRO FREIOU IHHHHHHHHHHHHH ");
			this.velocidade -= frear;
		} else {
			System.out.println("O veiculo já está parado");
		}

}

	
	
	
	public abstract void exibirDados();
	
	
	

}
