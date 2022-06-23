package br.com.fiap.fabricaCarros;

import java.util.Date;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private int anoFabricacao;
	private int anoModelo;
	private String renavam;
	private double velocidade;
	private String condutor;
	private boolean confirmacao;
	private Roda roda;
	private Cambio cambio;
	private Motor motor;

	
	
	public Carro(String marca, String modelo, String cor, int anoFabricacao, int anoModelo, String renavam,
			double velocidade, String condutor, Roda roda, Cambio cambio, Motor motor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.velocidade = velocidade;
		this.condutor = condutor;
		this.roda = roda;
		this.cambio = cambio;
		this.motor = motor;
	}

	

	public void ligar() {
		if (confirmacao == true) {
			System.out.println("Veículo ligado");
		} else {
			confirmacao = true;
		}
	}

	public void desligar() {
		if (confirmacao == false) {
			System.out.println("Veículo desligado");
		} else {
			confirmacao = false;
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

	public void exibirDados() {
		System.out.println("Marca : " + this.marca);
		System.out.println("Modelo : " + this.modelo);
		System.out.println("Cor : " + this.cor);
		System.out.println("Ano de Fabricação : " + this.anoFabricacao);
		System.out.println("Ano modelo : " + this.anoModelo);
		System.out.println("Renavam : " + this.renavam);
		System.out.println("Motor : " + this.motor.getTipo());
		System.out.println("Cambio : " + this.cambio.getTipo());
		System.out.println("Aro da Roda : " + this.roda.getAro());
		System.out.println("Velocidade : " + this.velocidade);
		System.out.println("Condutor : " + this.condutor);

	}
}
