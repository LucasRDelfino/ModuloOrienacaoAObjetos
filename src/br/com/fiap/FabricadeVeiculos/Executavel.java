package br.com.fiap.FabricadeVeiculos;



public class Executavel {

	public static void main(String[] args) {
		carro carro1 = new carro("Fiat","Aro13","Manual","1.6","Uno","branco","15465141","Julinho Delas",
				"HPX22",1990,2020,100,"Aerofolio");
		
		
		carro1.ligar();
		
		carro1.acelerar(100);
		
		carro1.exibirDados();

	}

}
