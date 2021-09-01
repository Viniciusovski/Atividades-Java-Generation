package condicionais;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		valor = leia.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O valor é par");
			System.out.println("A raiz quadrada dele é: " + Math.sqrt(valor));
		}else {
			System.out.println("O valor é ímpar");
			System.out.println("Este numero elevado ao quadrado é: " + Math.pow(valor, 2));
		}
	}

}
