package poo;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente lista[] = new Cliente[3];
		
		lista[0] = new Cliente(001, "Neymar Jr", 50000);
		lista[1] = new Cliente(002, "Jade Picon", 48000);
		lista[2] = new Cliente(003, "João Guilerme", 10000);
		
		for(Cliente roda: lista) {
			roda.imprimirCliente();
		}
	}

}
