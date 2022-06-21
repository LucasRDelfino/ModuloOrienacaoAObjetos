package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private int anoFabricacao;
	private int anoModelo;
	private String renavam;
	private String motor;
	private char cambio;
	private int aro;
	private double velocidade;
	private String condutor;
	boolean confirmacao;

	public Carro(String marca, String modelo, String cor, int anoFabricacao, int anoModelo, String renavam,
			String motor, char cambio, int aro, String condutor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.cambio = cambio;
		this.aro = aro;
		this.condutor = condutor;
		this.confirmacao = false;
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
		System.out.println("Motor : " + this.motor);
		System.out.println("Cambio : " + this.cambio);
		System.out.println("Aro : " + this.aro);
		System.out.println("Velocidade : " + this.velocidade);
		System.out.println("Condutor : " + this.condutor);

	}
}
