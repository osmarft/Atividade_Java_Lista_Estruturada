package Exercicios;

import javax.swing.JOptionPane;

public class MainExercicioswitchcase {

	public static void main(String[] args) {
		boolean sair = false;
		
			while ( sair == false ) {
				try {
				
				int exercicio =Integer.parseInt( JOptionPane.showInputDialog("Lista de Exercicio Java: "
					+ "\nQual exercicio deseja Executar ?"
					+"\n(1)  (2)  (3)  (4)  (5)  (6)  (7)  (8)  (9)  (10)  (11)"));
				if ( exercicio == JOptionPane.CANCEL_OPTION)
					sair = true;
				else {
				switch ( exercicio ) {
			
					case 1:  
						Exercicio01 ex1 = new Exercicio01();
						ex1.setComprimentoC (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Comprimento 1")));
						ex1.setComprimentoL (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Comprimento 2")));
						JOptionPane.showMessageDialog(null,"O valor da area é "+ ex1.calcularArea()+ " m²");
						sair = true;
						break;
						
					case 2:
						Exercicio01 ex2 = new Exercicio01();
						ex2.setComprimentoC (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Comprimento 1")));
						ex2.setComprimentoL (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Comprimento 2")));
						JOptionPane.showMessageDialog(null,"O valor da Area é: "+ ex2.calcularArea()+ " m²\n"
								+"O valor do Perimetro é: " + ex2.calcularPerimetro() + " m²\"");
						sair = true;
						break;
						
					case 3: 
						Exercicio03 ex3 = new Exercicio03();
						ex3.setValor (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Produto: ")));
						JOptionPane.showMessageDialog(null,"O valor do desconto é: R$ "+ ex3.calcularDescontoFixo());
						sair = true;
						break;
						
					case 4:
						Exercicio03 ex4 = new Exercicio03();
						ex4.setValor (Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Produto: ")));
						Double valorComDesconto = ex4.calcularDescontoVariavel(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Desconto: ")));
						JOptionPane.showMessageDialog(null,"O valor do produto sem desconto é: R$ "+ ex4.getValor() + 
								"\n" +
								"O valor do Produto Com desconto é: R$ " + valorComDesconto);
						sair = true;
						break;
						
					case 5:
						Exercicio05 ex5 = new Exercicio05();
						ex5.setProdutoSemDesconto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Produto Sem Desconto: ")));
						ex5.setProdutoComDesconto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do Produto Com Desconto")));
						JOptionPane.showMessageDialog(null,"O desconto aplicado no produto é: "+ ex5.valordoDesconto() + "%");
						sair = true;
						break;
						
					case 6:
						Exercicio06 ex6 = new Exercicio06();
						ex6.setAnoAtual(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o ano Atual: ")));
						ex6.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua data de Nascimento: ")));
						JOptionPane.showMessageDialog(null,"Você tem : "+ ex6.calcularIdade() + " anos");
						sair = true;
						break;
					
					case 7:
						Exercicio07 ex7 = new Exercicio07();
						ex7.setRaio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do raio da esfera: ")));
						JOptionPane.showMessageDialog(null, "o valor do volume da esfera é: " + ex7.calcularVolume(), "Volume Esfera", JOptionPane.INFORMATION_MESSAGE);
						sair = true;
						break;
						
					case 8:
						Exercicio08 ex08 = new Exercicio08();
						ex08.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Hora de entrada: ")));
						ex08.setMinutosEntrada(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os minutos da entrada: ")));
						ex08.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora da Saida: ")));
						ex08.setMinutosSaida(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os minutos da saida: ")));
						
						JOptionPane.showMessageDialog(null, "o valor a ser pagao é: R$" + ex08.calcularValorEstacionamento(), "Valor Estacionamento", JOptionPane.INFORMATION_MESSAGE);
						
						sair = true;
						break;
					default:
						JOptionPane.showMessageDialog(null,"Você tem que digitar um valor entre 1 e 13");
				}
				}
				}
				catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite apenas valores numericos entre 1 e 13");
					
					
				}

			}
		
		
		
	}

}

