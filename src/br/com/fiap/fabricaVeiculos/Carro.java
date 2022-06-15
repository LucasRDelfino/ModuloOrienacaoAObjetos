package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private Date anoFabricacao;
	private int anoModelo;
	private String renavam;
	private String motor;
	private char cambio;
	private int aro;
	private double velocidade;
	private String condutor;
	boolean confirmacao;
	
public void ligar(){
	if(confirmacao==true) {
		System.out.println("Veículo ligado");
	}else {
		confirmacao = true;
	}
}

public void desligar(){
	if(confirmacao==false) {
		System.out.println("Veículo desligado");
	}else {
		confirmacao = false;
	}
}

public void acelerar(double aceleracao) {
	if (confirmacao==true) {
	System.out.println("O CARRO ACELEOU VRUM VRUM BI BI ");
	this.velocidade += aceleracao;
	}else {
		ligar();
		this.velocidade += aceleracao;
		}
}
	
public void frear(double frear) {
	if (confirmacao==true) {
		System.out.println("O CARRO FREIOU IHHHHHHHHHHHHH ");
		this.velocidade -= frear;
	}else {
			
	}
	}
	
public void exibirDados() {
	System.out.println("Marca : " +this.marca);
	System.out.println("Modelo : " +this.modelo);
	System.out.println("Cor : " +this.cor);
	System.out.println("Ano de Fabricação : " +this.anoFabricacao);
	System.out.println("Ano modelo : " +this.anoModelo);
	System.out.println("Renavam : " +this.renavam);
	System.out.println("Motor : " +this.motor);
	System.out.println("Cambio : " +this.cambio);
	System.out.println("Aro : " +this.aro);
	System.out.println("Velocidade : " +this.velocidade);
	System.out.println("Condutor : " +this.condutor);
	
	


}
}
