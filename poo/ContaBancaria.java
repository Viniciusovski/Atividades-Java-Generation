package poo;

public class ContaBancaria {
	String nomeCliente;
	String agencia;
	int anosDeConta;
	
	public ContaBancaria(String nomeCliente, String agencia, int anosDeConta) {
		this.nomeCliente = nomeCliente;
		this.agencia = agencia;
		this.anosDeConta = anosDeConta;
	}
	
	public void imprimirConta() {
		System.out.println("\tInformações da Conta Bancaria");
		System.out.println("Cliente: "+this.nomeCliente);
		System.out.println("Agencia: "+this.agencia);
		System.out.println("Anos com essa conta: "+this.anosDeConta);
		System.out.println("*******************************");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getAnosDeConta() {
		return anosDeConta;
	}

	public void setAnosDeConta(int anosDeConta) {
		this.anosDeConta = anosDeConta;
	}
	
	
}
