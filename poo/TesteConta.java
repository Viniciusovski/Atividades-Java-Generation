package poo;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria[] lista = new ContaBancaria[3];
		
		lista[0] = new ContaBancaria("André", "Bradesco 001", 1);
		lista[1] = new ContaBancaria("Sérgio", "Bradesco 002", 10);
		lista[2] = new ContaBancaria("Henrique", "Bradesco 003", 3);
		
		for(ContaBancaria roda:lista) {
			roda.imprimirConta();
		}

	}

}
