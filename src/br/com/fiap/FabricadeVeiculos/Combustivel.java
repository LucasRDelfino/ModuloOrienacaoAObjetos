package br.com.fiap.FabricadeVeiculos;

public interface Combustivel {
	public double abastecer(double litros);
	
	
	public class Gasolina implements Combustivel {
		
		@Override
		public double abastecer (double litros) {
			return litros * 10;
			
		} 
	}
	
	public class Alcool implements Combustivel{
		
		@Override
		public double abastecer (double litros) {
			return litros * 7.5;
			
		} 
	}
}
