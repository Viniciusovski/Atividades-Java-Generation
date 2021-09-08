package poo;

import java.text.NumberFormat;

public class Cliente {
	int codigo;
	String nome;
	double valorDaCompra;
	
	public Cliente(int codigo, String nome, double valorDaCompra) {
		this.codigo = codigo;
		this.nome = nome;
		this.valorDaCompra = valorDaCompra;
	}
	
	public String formatarDinheiro() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorDaCompra);
		return formatoMoeda;
	}
	
	public void imprimirCliente() {
		System.out.println("O cliente "+this.nome+", cujo o cógido é "
	+this.codigo+", fez uma compra no valor de "+this.formatarDinheiro());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(float valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}
	
}
