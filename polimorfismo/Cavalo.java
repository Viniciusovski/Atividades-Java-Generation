package polimorfismo;

public class Cavalo extends Mamifero implements Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		String som = "rilinchin";
		return som;
	}

}
