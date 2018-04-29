package Exercicios;

public class Exercicio06 {
	
	
	private int anoAtual;
	private int anoNascimento;
	
	public Exercicio06() {
		
	}
	public Exercicio06(int anoAtual, int anoNascimento) {
		
		setAnoAtual(anoAtual);
		setAnoNascimento(anoNascimento);
	}
	
	
	public int getAnoAtual() {
		return anoAtual;
	}
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public int calcularIdade() {
		return getAnoAtual()-getAnoNascimento();
	}
	
}
