package programaOO;

import java.text.NumberFormat;

public class Patinete {
	String modelo;
	int numeroRodas;
	double preco;
	
	public Patinete(String modelo, int numeroRodas, double preco) {

		this.modelo = modelo;
		this.numeroRodas = numeroRodas;
		this.preco = preco;
	}
	
	public String formatarPreco() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formato = nf.format(preco);
		return formato;
	}
	
	public void imprimirFuncionario() {
		System.out.println("\tInformações do Patinete");
		System.out.println("Modelo: "+this.modelo);
		System.out.println("QTD de Rodas: "+this.numeroRodas);
		System.out.println("Preço: "+this.formatarPreco());
		System.out.println("*******************************");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
