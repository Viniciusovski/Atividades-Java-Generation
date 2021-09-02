	// DO WHILE
package repeticao;

import java.util.Scanner;

public class MediaMulti3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, soma = 0, media, qtd=0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Escreva um número: ");
			num = leia.nextInt();			
			if(num % 3 == 0)
				soma += num;
				qtd++;			
		}
		while(num != 0);
		media = soma / qtd;
		System.out.println("Média dos números multiplos de 3: " + media);
	}

}
