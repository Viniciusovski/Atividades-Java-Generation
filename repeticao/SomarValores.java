	//DO WHILE
package repeticao;

import java.util.Scanner;

public class SomarValores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, soma =  0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
			soma += num;
		}
		while(num != 0);
		System.out.println("A soma dos valores digitados: " + soma);

	}

}
