package polimorfismo;

public class TesteAnimaisPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro car = new Cachorro("Ben", 11);
		Cavalo cav = new Cavalo("Avante", 15);
		Preguica pre = new Preguica("Teresa", 8);
		
		System.out.println("O cachorro faz: "+car.emitirSom());
		System.out.println("O cavalo faz: "+cav.emitirSom());
		System.out.println("A preguiça faz: "+pre.emitirSom());
		
	}

}
