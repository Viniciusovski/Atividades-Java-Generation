package programaOO;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao av1 = new Aviao(001, "Cessna 150/152", 5, "TAM", "Elton John");
		Aviao av2 = new Aviao(002, "Piper PA-28", 3, "Gol", "Prince");
		Aviao av3 = new Aviao(003, "Cessna 172", 2, "Azul", "John Travolta");
		
		av1.imprimirAviao();
		av2.imprimirAviao();
		av3.imprimirAviao();

}
}
