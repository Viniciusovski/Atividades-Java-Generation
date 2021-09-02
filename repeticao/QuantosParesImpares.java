	//FOR
package repeticao;

public class QuantosParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contPar = 0, contImpar = 0;
		for(int i = 1; i < 11; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " é par.");
				contPar++;
			}else {
				System.out.println(i + " é ímpar.");
				contImpar++;
			}
		}
		System.out.println("Quantidade de numeros pares: "+contPar);
		System.out.println("Quantidade de numeros ímpares: "+contImpar);
	}

}
