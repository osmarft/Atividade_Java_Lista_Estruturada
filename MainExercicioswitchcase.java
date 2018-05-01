package Exercicios;

import javax.swing.JOptionPane;

public class MainExercicioswitchcase {

	public static void main(String[] args) {
		boolean sair = false;
		
			while ( sair == false ) {
				try {
				
					int exercicio =Integer.parseInt( JOptionPane.showInputDialog("Lista de Exercicio Java: "
						+ "\nQual exercicio deseja Executar ?"
						+"\n(1)  (2)  (3)  (4)  (5)  (6)  (7)  (8)  (9)  (10)  (11) (12) (13) "));
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
								Exercicio08 ex8 = new Exercicio08();
								ex8.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Hora de entrada: ")));
								ex8.setMinutosEntrada(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os minutos da entrada: ")));
								ex8.setHoraSaida(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora da Saida: ")));
								ex8.setMinutosSaida(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os minutos da saida: ")));
								
								JOptionPane.showMessageDialog(null, "o valor a ser pagao é: R$" + ex8.calcularValorEstacionamento(), "Valor Estacionamento", JOptionPane.INFORMATION_MESSAGE);
								
								sair = true;
								break;
								
							case 9:
								Exercicio09 ex9 = new Exercicio09();								
								ex9.setValorGuardado(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o Valor Guardado no Cofre: ")));
								ex9.setCotacaoDolar(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a cotação do Dolar Hoje")));
								JOptionPane.showMessageDialog(null, "O valor guardado no cofre é de R$:" + ex9.valorEmCofre(), "Valor em Cofre" , JOptionPane.INFORMATION_MESSAGE);
								
								sair = true;
								break;
							case 10:
								Exercicio10 ex10 = new Exercicio10();
								
								ex10.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero: ")));
								ex10.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero: ")));
								JOptionPane.showMessageDialog(null,"Primeiro: " + ex10.getValor1() + "\n" + "Segundo: " + ex10.getValor2(), "Valores Antes da Troca", JOptionPane.INFORMATION_MESSAGE );
								ex10.trocarValores();
								JOptionPane.showMessageDialog(null,"Primeiro: " + ex10.getValor1() + "\n" + "Segundo: " + ex10.getValor2(), "Valores Trocados", JOptionPane.INFORMATION_MESSAGE );
								
								sair = true;
								break;
							case 11:
								Exercicio11 ex11 = new Exercicio11();
								
								ex11.setComprimentoTijolo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite Comprimento Tijolo: ")));
								ex11.setLarguraTijolo(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite Largula Tijolo: ")));
								ex11.setComprimentoParede(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite Comprimento Parede: ")));
								ex11.setLarguraParede(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite Largura Parede: ")));
								JOptionPane.showMessageDialog(null, "Você precisara de : " + ex11.calcularQuantitadadeTijolos() + " Tijolos para fazer a parede", "Quantidade de Tijolos", JOptionPane.INFORMATION_MESSAGE);
								
								sair = true;
								break;
							case 12:
								Exercicio12 ex12 = new Exercicio12();
								ex12.mudar();						
								
								JOptionPane.showMessageDialog(null, "O valor apresentado pelo programa é:" + 
										"\n"+ "" + 
										"\n" + ex12.getA() +
										"\n" + ex12.getB() +
										"\n" + ex12.getC() +
										"\n" + ex12.getD()
										
										, "Exercicio 11 Resultado", JOptionPane.INFORMATION_MESSAGE);
								sair = true;
								break;
							case 13:
															
								JOptionPane.showMessageDialog(null, " A variavel RASCUNHO não foi Declarada ", "Exercicio 13", JOptionPane.INFORMATION_MESSAGE);
								sair = true;
								break;
							default:
								JOptionPane.showMessageDialog(null,"Você tem que digitar um valor entre 1 e 13");
								sair = true;
								break;
								
						}
					}
				}
				catch (java.lang.NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Digite apenas valores numericos entre 1 e 13 .");
					
					
				}

			}
		
		
		
	}

}
