package programaOO;

public class TesteProdutoEletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProdutoEletronico p1 = new ProdutoEletronico("Celular", "iPhone 7", "Apple");
		ProdutoEletronico p2 = new ProdutoEletronico("TV", "Smart TV 85\" QLED", "Samsung");
		ProdutoEletronico p3 = new ProdutoEletronico("Tablet", "Twist Tab", "Positivo");
		
		p1.imprimirProduto();
		p2.imprimirProduto();
		p3.imprimirProduto();
	}

}
