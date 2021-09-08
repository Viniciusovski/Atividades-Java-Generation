package programaOO;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente[] lista = new Paciente[3];
		
		lista[0] = new Paciente("Maria", "Gripe");
		lista[1] = new Paciente("Roberto", "Febre");
		lista[2] = new Paciente("Jefersson", "Dor nas Costas");
		
		for(Paciente roda:lista) {
			roda.imprimirPaciente();
		}

	}

}
