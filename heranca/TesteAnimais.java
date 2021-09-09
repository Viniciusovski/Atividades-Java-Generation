package heranca;

public class TesteAnimais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro ca = new Cachorro("Rex", 5, 0);
		
		System.out.println(ca.emitirSom("AuAu"));
		ca.correr();
		
		Cavalo cav = new Cavalo("Pegasus", 15, 0);
		System.out.println(cav.emitirSom("rilinchin"));
		cav.correr();
		cav.correr();
		cav.correr();
		
		Preguica pre = new Preguica("Rob", 30, 0);
		System.out.println(pre.emitirSom("Uaaar"));
		pre.subirArvore();
		pre.subirArvore();
		
		System.out.println("\t---Informações dos Animais----");
		System.out.println("Cachorro");
		System.out.println("Nome: "+ca.getNome());
		System.out.println("Idade: "+ca.getIdade());
		System.out.println("-------------------");
		System.out.println("Cavalo");
		System.out.println("Nome: "+cav.getNome());
		System.out.println("Idade: "+cav.getIdade());
		System.out.println("-------------------");
		System.out.println("Preguiça");
		System.out.println("Nome: "+pre.getNome());
		System.out.println("Idade: "+pre.getIdade());
	}
	

}
