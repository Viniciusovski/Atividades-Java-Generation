package vetoresmatrizes;

public class ExerVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 0, 5, -2, -5, 7}, soma = 0; 
		
		soma += a[0];
		soma += a[1];
		soma += a[5];
		System.out.println("Soma dos vetores: "+ soma);
		
		a[4] = 100;
		
		System.out.println("----Mostrar Vetor----");
		for(int i : a) {
			System.out.println(i);
		}
	}

}
