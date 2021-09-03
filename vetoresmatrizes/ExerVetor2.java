package vetoresmatrizes;

import java.util.Scanner;

public class ExerVetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[6], contImpar = 0, somaPar = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < num.length; i++) {
			System.out.println("Entre com o valor:");
			num[i] = leia.nextInt();
			
			if(num[i] % 2 == 0) {
				System.out.println(num[i]+" é par");
				somaPar += num[i];
			}else {
				System.out.println(num[i]+" é ímpar");
				contImpar++;
			}
		}
		System.out.println("Soma dos numeros pares: "+ somaPar);
		System.out.println("Quantidade de numeros impares: "+ contImpar);

	}

}
