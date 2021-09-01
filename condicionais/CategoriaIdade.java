package condicionais;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categroia: Infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Categroia: Juvenil");
		}else if(idade >= 18 && idade <= 25){
			System.out.println("Categroia: Adulto");
		}else {
			System.out.println("Idade Invalida, talvez você não possui a idade minima de 10 anos ou"
					+ " a idade máxima de 25 anos");
		}
	}

}
