	//WHILE
package repeticao;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, sexo, opc, contPeCalma = 0, contMuNervosa =0, contHoAgressivo = 0;
		int contOutCalmos = 0, contPeNervMais40 = 0, contPeCalMenos18 = 0, contPes = 1;
		Scanner leia = new Scanner(System.in);
		
		while(contPes < 151) {
			System.out.println("---- Pessoa "+contPes+" ----");
			System.out.println("Qual a sua idade: ");
			idade = leia.nextInt();
			System.out.println("Qual o seu sexo: Opções"
					+ "\n1 - Feminino"
					+ "\n2 - Masculino"
					+ "\n3 - Outros");
			sexo = leia.nextInt();
			System.out.println("Qual das opções te define:"
					+ "\n1 - Calmo(a)"
					+ "\n2 - Nervoso(a)"
					+ "\n3 - Agressivo(a)");
			opc = leia.nextInt();
			
			if(opc == 1) {
				contPeCalma++;
			}
			if(sexo == 1 && opc == 2) {
				contMuNervosa++;
			}else if(sexo == 2 && opc == 3) {
				contHoAgressivo++;
			}else if(sexo == 3 && opc == 1) {
				contOutCalmos++;
			}else if(idade > 40 && opc == 2) {
				contPeNervMais40++;
			}else if(idade < 18 && opc == 1) {
				contPeCalMenos18++;
			}
			contPes++;
		}
		
		System.out.println("===RESULTADO DA PESQUISA===");
		System.out.println("0 número de pessoas calmas: "+ contPeCalma);
		System.out.println("O número de mulheres nervosas: " + contMuNervosa);
		System.out.println("0 número de homens agressivos: " + contHoAgressivo);
		System.out.println("0 número de outros calmos: " + contOutCalmos);
		System.out.println("0 número de pessoas nervosas com mais de 40 anos: " + contPeNervMais40);
		System.out.println("0 número de pessoas calmas com menos de 18 anos: " + contPeCalMenos18);
	}

}
