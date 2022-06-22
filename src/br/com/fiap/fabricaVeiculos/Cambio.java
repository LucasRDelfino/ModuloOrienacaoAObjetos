package br.com.fiap.fabricaVeiculos;

public class Cambio {
	private String tipo,marca;
	private int qtdMarcha;

	public Cambio(String tipo, String marca, int qtdMarcha) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.qtdMarcha = qtdMarcha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getQtdMarcha() {
		return qtdMarcha;
	}

	public void setQtdMarcha(int qtdMarcha) {
		this.qtdMarcha = qtdMarcha;
	}
	
	
	

}
