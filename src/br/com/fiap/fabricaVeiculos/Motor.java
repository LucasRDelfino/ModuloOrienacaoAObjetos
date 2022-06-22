package br.com.fiap.fabricaVeiculos;

public class Motor {
	private String tipo,marca;
	private int cavalos;
	public Motor(String tipo, int cavalos, String marca) {
		super();
		this.tipo = tipo;
		this.cavalos = cavalos;
		this.marca = marca;
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
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}

	
	
}
