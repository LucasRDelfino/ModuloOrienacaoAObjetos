package br.com.fiap.fabricaCarros;

public class Roda {
	private int aro;
	private String calota , material , marca;
	
	
	public Roda(int aro, String calota, String material) {
		super();
		this.aro = aro;
		this.calota = calota;
		this.material = material;
	}


	public int getAro() {
		return aro;
	}


	public void setAro(int aro) {
		this.aro = aro;
	}


	public String getCalota() {
		return calota;
	}


	public void setCalota(String calota) {
		calota = calota;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	
}
