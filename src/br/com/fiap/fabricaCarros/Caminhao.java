package br.com.fiap.fabricaCarros;

import java.util.Date;

public class Caminhao{
	private String marca, modelo, cor,eixos, nmCliente, tipoCarga;
	private Date anoFabricacao, anoModelo;
	private long renavam;
	private double velocidade,qntCargaSup, qntCargaAbs;
	private boolean estado=false;
	private Roda roda;
	private Cambio cambio;
	private Motor motor;

	public Caminhao(String marca, String modelo, String cor, Motor motor, Roda roda, String eixos,
	String nmCliente, String tipoCarga, Cambio cambio, Date anoFabricacao, Date anoModelo, long renavam,
	double qntCargaSup) {
	
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.motor = motor;
		this.roda = roda;
		this.eixos = eixos;
		this.nmCliente = nmCliente;
		this.tipoCarga = tipoCarga;
		this.cambio = cambio;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.qntCargaSup = qntCargaSup;
		}
		public void ligar() {
		if(this.estado) {
		System.out.println("O carro ja est� ligado");
		}else {
		this.estado = true;
		System.out.println("O carro foi ligado");
		}
		}
		public void desligar() {
		if(this.estado) {
		if(this.velocidade>0) {
		System.out.println("O carro precisa estar parado");
		}else {
		this.estado= false;
		System.out.println("Carro desligado");
		}
		}else {
		System.out.println("O carro ja est� desligado");
		}
		}
		public void acelerar(double valor) {
		if(this.estado) {
		this.velocidade =this.velocidade+valor;
		   System.out.println("Velocidade alterada: "+this.velocidade);
		}else {
		System.out.println("O carro n�o est� ligado");
		}
		
		}
		public void frear(double valor) {
		if(this.velocidade>0 && valor>0 ) {
		if(valor>this.velocidade) {
		this.velocidade=0;
		}else {
		this.velocidade = this.velocidade -valor;
		}
		}else if(valor<0) {
		System.out.println("Valor inv�lido");
		}
		else {
		System.out.println("O carro est� parado");
		}
		
		}
		public void showDados() {
		System.out.println(this.roda.getAro());
		System.out.println(this.cor);
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.motor.getTipo());
		System.out.println(this.renavam);
		System.out.println(this.cambio.getTipo());
		System.out.println(this.anoFabricacao);
		System.out.println(this.nmCliente);
		System.out.println(this.eixos);
		System.out.println(this.qntCargaSup);
		System.out.println(this.qntCargaAbs);
		System.out.println(this.tipoCarga);
		System.out.println(this.anoModelo);
		
		}
		public void carregar(double valor) {
		if(this.qntCargaSup<(this.qntCargaAbs+valor)) {
		System.out.println("Esse valor excede o limite");
		}else {
		if(valor>0) {
		this.qntCargaAbs+=valor;
		System.out.println("Caminh�o carregado, peso: "+this.qntCargaAbs);
		}else {
		System.out.println("Valor inv�lido");
		}
		}
		
		}
		public void descarregar(double valor) {
		if(valor>this.qntCargaAbs) {
		this.qntCargaAbs=0;
		}else {
		if(valor>0) {
		this.qntCargaAbs-=valor;
		System.out.println("O caminh�o foi descarregado, peso: "+this.qntCargaAbs);
		}else {
		System.out.println("Valor inv�lido");
		}
		}
		}
		public void close() {
		System.exit(0);
		}
		
		
		}
		
