package polimorfismo;

public class Preguica extends Mamifero implements Animal{
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		String som = "Uaaar";
		return som;
	}

}
