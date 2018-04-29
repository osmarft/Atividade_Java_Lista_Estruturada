package Exercicios;

public class Exercicio05 {

	private Double produtoSemDesconto;
	private Double produtoComDesconto;
	
	
	public Exercicio05() {
	
	}
	
	public Exercicio05(Double produtoSemDesconto, Double produtoComDesconto) {
		
		setProdutoSemDesconto(produtoSemDesconto);
		setProdutoComDesconto(produtoComDesconto);
	}
	
	
		
	public Double getProdutoSemDesconto() {
		return produtoSemDesconto;
	}
	public void setProdutoSemDesconto(Double produtoSemDesconto) {
		this.produtoSemDesconto = produtoSemDesconto;
	}
	public Double getProdutoComDesconto() {
		return produtoComDesconto;
	}
	public void setProdutoComDesconto(Double produtoComDesconto) {
		this.produtoComDesconto = produtoComDesconto;
	}
	
	public Double valordoDesconto() {
		
		return 100 - ((getProdutoComDesconto() / getProdutoSemDesconto() )*100 ) ;
	}
	
}
