package poo;

public class Paciente {
	String nome;
	String doenca;
	
	public Paciente(String nome, String doenca) {
		this.nome = nome;
		this.doenca = doenca;
	}
	
	public void imprimirPaciente() {
		System.out.println("\tInformações do Paciente");
		System.out.println("Nome: "+this.doenca);
		System.out.println("Doença: "+this.nome);		
		System.out.println("*******************************");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDoenca() {
		return doenca;
	}

	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
	

}
