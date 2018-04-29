package Exercicios;

public class Exercicio03 {

	
	private Double valor;
	
	
	
	
	
	public Exercicio03() {
		
	}
	
	public Exercicio03(Double valor) {

		setValor(valor);
		
	}
	
	
	
	public Double getValor() {
		
		return valor;
	}
	
	public void setValor(double valor) {
		
		this.valor = valor;
	}
	
	
	
	public Double calcularDescontoFixo() {
		
		return getValor()*0.05;
	}
	public Double calcularDescontoVariavel(Double valor) {
		return getValor()*(valor/100);
	}
	
}
