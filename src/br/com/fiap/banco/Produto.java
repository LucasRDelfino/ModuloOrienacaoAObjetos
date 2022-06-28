package br.com.fiap.banco;

public interface Produto {
	
	public double investir(double valor); 
	
	public class CDB implements Produto{

		@Override
		public double investir(double valor) {
			return valor * (1+0.008);
		}}
	
	public class LCI implements Produto{

		@Override
		public double investir(double valor) {
			return valor * (1+0.006);
		}}

	public class LCA implements Produto{

		@Override
		public double investir(double valor) {
			return valor * (1+0.007);
		}}
	

}
