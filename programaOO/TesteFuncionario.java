package programaOO;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario[] lista = new Funcionario[3];
		lista[0] = new Funcionario("Silvio Santos", "SBT", "Apresentador");
		lista[1] = new Funcionario("Glória Pires", "Globo", "Atriz");
		lista[2] = new Funcionario("Anitta", "Warner Music", "Cantora");
		
		for(Funcionario roda: lista) {
			roda.imprimirFuncionario();
		}
	}

}
