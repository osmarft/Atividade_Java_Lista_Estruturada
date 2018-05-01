package Exercicios;

public class Exercicio11 {
	private Double comprimentoTijolo;
	private Double larguraTijolo;
	private Double comprimentoParede;
	private Double larguraParede;
	
	public Exercicio11() {
		
	}

	public Exercicio11(Double comprimentoTijolo, Double larguraTijolo, Double comprimentoParede, Double larguraParede) {
		
		setComprimentoTijolo(comprimentoTijolo);
		setLarguraTijolo(larguraTijolo);
		setComprimentoParede(comprimentoParede);
		setLarguraParede(larguraParede);
	}

	public Double getComprimentoTijolo() {
		return comprimentoTijolo;
	}

	public void setComprimentoTijolo(Double comprimentoTijolo) {
		this.comprimentoTijolo = comprimentoTijolo;
	}

	public Double getLarguraTijolo() {
		return larguraTijolo;
	}

	public void setLarguraTijolo(Double larguraTijolo) {
		this.larguraTijolo = larguraTijolo;
	}

	public Double getComprimentoParede() {
		return comprimentoParede;
	}

	public void setComprimentoParede(Double comprimentoParede) {
		this.comprimentoParede = comprimentoParede;
	}

	public Double getLarguraParede() {
		return larguraParede;
	}

	public void setLarguraParede(Double larguraParede) {
		this.larguraParede = larguraParede;
	}
	
	public Double calcularQuantitadadeTijolos() {
		
		return ( (getComprimentoParede() * getLarguraParede() ) / (getComprimentoTijolo()*getLarguraTijolo()) );
	}
}
