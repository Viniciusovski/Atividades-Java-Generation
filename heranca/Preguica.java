package heranca;

public class Preguica extends Animal{
	
	private int subir;
	
	public Preguica(String nome, int idade, int subir) {
		super(nome, idade);
		this.subir = subir;
	}

	public int getSubir() {
		return subir;
	}

	public void setSubir(int subir) {
		this.subir = subir;
	}
	
	public void subirArvore() {
		this.subir += 5;
		System.out.println("A peguiça subiu "+getSubir()+" centimetros na arvore");
	}

}
