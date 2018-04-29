package Exercicios;

public class Exercicio01 {

	
		
		
		private Double ComprimentoL;
		private Double ComprimentoC;
		

		public Exercicio01() {
			
		}
		
		public Exercicio01(Double comprimentoL, Double comprimentoC) {
			
			setComprimentoL(comprimentoL);
			setComprimentoC(comprimentoC);
		}
		public Double calcularArea() {
			
			return (getComprimentoL() * getComprimentoC());
				 
		}
		public Double calcularPerimetro () {
			return (2.0*(getComprimentoL()+getComprimentoC()));
			
		}
		public void setComprimentoL(Double valor){
			
				ComprimentoL	 = valor;
			}
		public Double getComprimentoL() {
			return ComprimentoL;
		}
			
		public void setComprimentoC(Double valor){
			
				ComprimentoC = valor;
			}
			
		public Double getComprimentoC() {
				
			return ComprimentoC;
		}
		
		
		
		
	
}
