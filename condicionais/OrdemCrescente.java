package condicionais;

import java.util.Scanner;

public class OrdemCrescente {

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
			if(n2 > n3) {
				System.out.println("Ordem Crescente: "+ n3 + ", " + n2 + ", " + n1);
			}else {
				System.out.println("Ordem Crescente: "+ n2 + ", " + n3 + ", " + n1);
			}
		}else if (n2 > n1 && n2 > n3) {
			if(n3 > n1) {
				System.out.println("Ordem Crescente: "+ n1 + ", " + n3 + ", " + n2);
			}else {
				System.out.println("Ordem Crescente: "+ n3 + ", " + n1 + ", " + n2);
			}
		}else{
			if(n2 > n1) {
				System.out.println("Ordem Crescente: "+ n1 + ", " + n2 + ", " + n3);
			}else {
				System.out.println("Ordem Crescente: "+ n2 + ", " + n1 + ", " + n3);
			}
		}
	}

}
