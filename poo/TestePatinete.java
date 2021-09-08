package poo;

public class TestePatinete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patinete[] lista = new Patinete[3];
		
		lista[0] = new Patinete("Skatenet Max 1530", 3, 339.90);
		lista[1] = new Patinete("Infantil Musical", 3, 152.99);
		lista[2] = new Patinete("Infantil Scooter Skatenet", 3, 272.74);
		
		for(Patinete roda:lista) {
			roda.imprimirFuncionario();
		}
	}

}
