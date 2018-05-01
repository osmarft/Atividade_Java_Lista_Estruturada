package Exercicios;

public class Exercicio12 {
	private Double a;
	private Double b;
	private Double c;
	private Double d;
	
	
	
	public Exercicio12() {
		
	}
	
	public Exercicio12(Double a, Double b, Double c, Double d) {
		
		setA(a);
		setB(b);
		setC(c);
		setD(d);
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}
	
	public void mudar() {
		setA(2d);
		setB(4d);
		setC(  ( (getA() + getB()) * getB() )  );
		setD(  (getC() * getB()) / (getA()* getA())  );
		setA( getD() / (getC() + getB())  );
		setB( getB() + getA() );
	}
}
