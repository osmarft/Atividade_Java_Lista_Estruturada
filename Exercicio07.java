package Exercicios;

public class Exercicio07 {
	
	private Double raio;
	
	
	public Exercicio07() {
		
	}
	public Exercicio07(Double raio) {
		
		setRaio(raio);
	}
	
	public Double getRaio() {
		return raio;
	}
	public void setRaio(Double raio) {
		if (raio != 0)
			this.raio = raio;
	}
	
	public Double calcularVolume() {
		return 3.14*(raio*raio);
	}

}
