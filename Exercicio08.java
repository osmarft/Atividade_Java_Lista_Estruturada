package Exercicios;

public class Exercicio08 {

	private int horaEntrada;
	private int minutosEntrada;
	private int horaSaida;
	private int minutosSaida;
	public Exercicio08() {
		
	}
	
	public Exercicio08(int horasEntrada, int minutosEntrada , int horaSaida , int minutosSaida) {
		setHoraEntrada(horasEntrada);
		setMinutosEntrada(minutosEntrada);
		setHoraSaida(horaSaida);
		setMinutosSaida(minutosSaida);
	}
	
	
	
	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getMinutosEntrada() {
		return minutosEntrada;
	}

	public void setMinutosEntrada(int minutosEntrada) {
		this.minutosEntrada = minutosEntrada;
	}

	public int getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getMinutosSaida() {
		return minutosSaida;
	}

	public void setMinutosSaida(int minutosSaida) {
		this.minutosSaida = minutosSaida;
	}

	public double calcularValorEstacionamento() {
		
		return (((horaSaida * 60 + minutosSaida)  - (horaEntrada * 60 + minutosEntrada))/15) ;
	} 
}
