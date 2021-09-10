package polimorfismo;

public class Cachorro extends Mamifero implements Animal{
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
		
	public String emitirSom() {
		String som = "AuAu";
		return som;
	}
}
