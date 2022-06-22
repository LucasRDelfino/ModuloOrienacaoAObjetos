package br.com.fiap.fabricaVeiculos;

public class Executavel {
	public static void main(String[] args) {
		
	Roda roda1 = new Roda(16,"Orbitral","Pirelli");
	Cambio cambio1 = new Cambio("Automatico","Travelex",3);		
	Motor motor1 = new Motor("Em V",12,"Fiat");
	
	Carro carro1 = new Carro("Fiat","Uno","Branco",1993,1990,"5694837",220,"Julinho Delas", roda1,cambio1,motor1);
	
	carro1.exibirDados();
	}
}
