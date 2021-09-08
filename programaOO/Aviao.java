package programaOO;

public class Aviao {
	int codigo;	
	String modelo;	
	int numeroPassageiros;
	String companhiaArea;
	String nomePiloto;
	
	public Aviao(int codigo, String modelo, int numeroPassageiros, String companhiaArea, String nomePiloto) {
		this.codigo = codigo;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.nomePiloto = nomePiloto;
	}
	
	public void imprimirAviao() {
		System.out.println("Numero do avião: "+this.codigo);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Quantidade de Passageiros: "+this.numeroPassageiros);
		System.out.println("Piloto: "+this.nomePiloto);
		System.out.println("*******************************");
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}

	public String getCompanhiaArea() {
		return companhiaArea;
	}

	public void setCompanhiaArea(String companhiaArea) {
		this.companhiaArea = companhiaArea;
	}

	public String getNomePiloto() {
		return nomePiloto;
	}

	public void setNomePiloto(String nomePiloto) {
		this.nomePiloto = nomePiloto;
	}
}
