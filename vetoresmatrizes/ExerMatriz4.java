package vetoresmatrizes;

import java.util.Scanner;

public class ExerMatriz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		float con;
		int op;
		Scanner leia = new Scanner(System.in);

		// Criação da primeira matriz
		for (int linha = 0; linha < 2; linha++) {

			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("\nDigite o valor da M1[%.0f][%.0f]: ", linha + 1f, coluna + 1f);
				matriz1[linha][coluna] = leia.nextFloat();
			}
		}

		// Criação da segunda matriz
		for (int linha = 0; linha < 2; linha++) {

			for (int coluna = 0; coluna < 2; coluna++) {
				System.out.printf("\nDigite o valor da M2[%.0f][%.0f]: ", linha + 1f, coluna + 1f);
				matriz2[linha][coluna] = leia.nextFloat();

			}
		}
		//Menu de Opções
		System.out.println("===MENU===");
		System.out.println("1 - Somar as Matrizes");
		System.out.println("2 - Subtrair a primera matriz da segunda");
		System.out.println("3 - Adicionar uma constante");
		System.out.println("4 - Mostrar as matrizes");
		System.out.println("Qual opção desejada?:");
		op = leia.nextInt();
		//Opções
		switch (op) {
		case 1:
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {					
					matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
				}
			}
			//Mostrar matriz 3
			System.out.println("Matriz 3");
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {
					//
					//System.out.printf("%.1f \t", matriz2[linha][coluna]);
					System.out.print("[ "+matriz3[linha][coluna]+" ]");
				}
				System.out.println("\n");
			}

			break;
		case 2:
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {					
					matriz3[linha][coluna] = matriz1[linha][coluna] - matriz2[linha][coluna];
				}
			}
			// Mostrar matriz 3
			System.out.println("Matriz 2");
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {
					//
					//System.out.printf("%.1f \t", matriz2[linha][coluna]);
					System.out.print("[ "+matriz3[linha][coluna]+" ]");
				}
				System.out.println("\n");
			}
			break;
		case 3:
			System.out.println("Valor para a constante");
			con = leia.nextFloat();
			//Primeira matriz
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {					
					matriz1[linha][coluna] = matriz1[linha][coluna] + con;
				}
			}
			//Segunda matriz
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {					
					matriz2[linha][coluna] = matriz2[linha][coluna] + con;
				}
			}
			//Mostrar matriz
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.println("\t Matriz 1");
					System.out.printf("\t %.1f \t", matriz1[linha][coluna]);
				}
			}
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {
					System.out.println("\t Matriz 2");
					System.out.printf("\t %.1f \t", matriz2[linha][coluna]);
				}
			}
			break;
		case 4:
			System.out.println("Matriz 1");
			for (int linha = 0; linha < 2; linha++) {
				for (int coluna = 0; coluna < 2; coluna++) {					
					//System.out.printf("%.1f \t", matriz2[linha][coluna]);
					System.out.print("[ "+matriz1[linha][coluna]+" ]");
				}
				System.out.println("\n");
			}
			System.out.println("Matriz 2");
			for (int linha = 0; linha < 2; linha++) {

				for (int coluna = 0; coluna < 2; coluna++) {
					//
					//System.out.printf("%.1f \t", matriz2[linha][coluna]);
					System.out.print("[ "+matriz2[linha][coluna]+" ]");
				}
				System.out.println("\n");
			}
			break;
		default:
			System.out.println("Opção Invalida");
			break;
		}
	}

}
