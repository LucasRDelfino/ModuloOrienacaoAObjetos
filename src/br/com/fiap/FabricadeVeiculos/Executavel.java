package br.com.fiap.FabricadeVeiculos;

import br.com.fiap.FabricadeVeiculos.Combustivel.Gasolina;

public class Executavel {

	public static void main(String[] args) {
		carro carro1 = new carro("Fiat","Aro13","Manual","1.6","Uno","branco","15465141","Julinho Delas",
				"HPX22",1990,2020,100,10,100,"Aerofolio");
		
		
		Gasolina gasolina = new Gasolina();
		
		carro1.ligar();
		
		carro1.acelerar(100);
		
		carro1.abastecer(gasolina,10);
		
		carro1.exibirDados();

	}

}
