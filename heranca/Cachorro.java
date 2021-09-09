package heranca;

public class Cachorro extends Animal{
	
	private int passos = 0;
	
	public Cachorro(String nome, int idade, int passos) {
		super(nome, idade);
		this.passos = passos;
	}	
	
	
	public int getPassos() {
		return passos;
	}


	public void setPassos(int passos) {
		this.passos = passos;
	}


	public void correr() {
		this.passos += 10;
		System.out.println("O Cachorro correu "+getPassos()+" passos");
	}
}
