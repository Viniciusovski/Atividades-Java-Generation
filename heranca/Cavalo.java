package heranca;

public class Cavalo extends Animal {
	private int passos;

	public Cavalo(String nome, int idade, int passos) {
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
		System.out.println("O Cavalo correu " + getPassos() + " passos");
	}

}
