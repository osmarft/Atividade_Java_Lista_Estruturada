package Exercicios;

public class Exercicio09 {

	private Double valorGuardado;
	private Double cotacaoDolar;
	
	
	public Exercicio09() {
		
	}


	public Exercicio09(Double valorQuardado, Double cotacaoDolar) {
		
		setValorGuardado(valorQuardado);
		setCotacaoDolar(cotacaoDolar);
	}


	public Double getValorGuardado() {
		return valorGuardado;
	}


	public void setValorGuardado(Double valorGuardado) {
		this.valorGuardado = valorGuardado;
	}


	public Double getCotacaoDolar() {
		return cotacaoDolar;
	}


	public void setCotacaoDolar(Double cotacaoDolar) {
		this.cotacaoDolar = cotacaoDolar;
	}
	
	public Double valorEmCofre() {
		return getValorGuardado()*getCotacaoDolar();
	}


	
}
