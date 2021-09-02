	//WHILE
package repeticao;

import java.util.Scanner;

public class IdadePessoas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 0, cont21 =0, cont50 =0;
		Scanner leia = new Scanner(System.in);		
		
		while(idade != -99) {
			System.out.println("Digite a sua idade:");
			idade =leia.nextInt();
			
			if(idade >= 1 && idade < 21) {
				cont21++;
			}else if(idade > 50) {
				cont50++;
			}else if (idade <= 0){
				System.out.println("Idade Inválida, digite valor positivo");
			}
			System.out.println("Digite a sua idade:");
			idade =leia.nextInt();
		}
		System.out.println("Pessoas com menos de 21: " + cont21);
		System.out.println("Pessoas com mais de 50: " + cont50);
	}

}
