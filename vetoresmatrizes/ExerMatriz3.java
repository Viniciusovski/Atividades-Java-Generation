package vetoresmatrizes;

import java.util.Scanner;

public class ExerMatriz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz[][] = new int[3][3];
		int contMaior10 = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < 3;linha++){
			
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("\nEntre com o valor de M[%d][%d]: ", linha+1,coluna+1);
				matriz[linha][coluna] = leia.nextInt();
				if(matriz[linha][coluna] > 10)
					contMaior10++;					
			}
		}
		System.out.println("Essa Matriz possui "+contMaior10+ " valores maiores que 10");		
		
	}

}
