package Exercicios;

public class Exercicio10 {
	private int valor1;
	private int valor2;
	
	
	public Exercicio10(int valor1, int valor2) {
		
		setValor1(valor1);
		setValor2(valor2);
	}
	public Exercicio10() {
		
	}
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public void trocarValores() {
		int trocar;
		trocar = getValor1();
		setValor1(getValor2());
		setValor2(trocar);
	}

}
