package condicionais;

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		System.out.println("Entre com o terceiro numero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior numéro é o " + n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior numéro é o " + n2);
		}else {
			System.out.println("O maior numéro é o " + n3);
		}

	}

}
