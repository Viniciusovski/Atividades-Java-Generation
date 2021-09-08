package poo;

public class ProdutoEletronico {
	String tipo;
	String modelo;
	String fabricante;
	
	public ProdutoEletronico(String tipo, String modelo, String fabricante) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public void imprimirProduto() {
		System.out.println("\tInformações do Produto");
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("*******************************");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
}
