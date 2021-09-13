package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estoque est = new Estoque();
		ArrayList<Produtos> lista = new ArrayList();
		ArrayList<Produtos> lista2 = new ArrayList();
		
		Produtos pro1 = new Produtos("Sabão", 20);
		Produtos pro2 = new Produtos("Detergente", 20);
		Produtos pro3 = new Produtos("Sabonete", 20);
		
		lista2.add(pro1);
		lista2.add(pro2);
		lista2.add(pro3);
		
		Produtos prod;
		prod = est.criarProduto();
		//lista.add(prod);
		est.armazenarProdutos(lista, prod);
		prod = est.criarProduto();
		//lista.add(prod);
		est.armazenarProdutos(lista, prod);		
				
		est.mostrarLista(lista);
		est.removerProduto(lista);
		est.mostrarLista(lista);
		est.atualizarLista(lista2);
		est.mostrarLista(lista2);

	}
	
	public void armazenarProdutos(ArrayList<Produtos> list, Produtos pro) {
		list.add(pro);
	}
	
	public Produtos criarProduto() {		
		System.out.println("Digite o nome do produto: ");
		String nome;
		double preco;
		Scanner leia = new Scanner(System.in);
		nome = leia.next();
		System.out.println();
		System.out.println("Digite o preco do produto: ");
		preco = leia.nextDouble();
		Produtos pro = new Produtos(nome, preco);
		return pro;		
	}
	
	public void mostrarLista(ArrayList<Produtos> list){
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Nome do Produto "+list.get(i).getNome());
			System.out.println("Preco do Produto "+list.get(i).getPreco());
		}
	}
	
	public void removerProduto(ArrayList<Produtos> list) {
		String nome;
		double preco;
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual o produto nome do produto que voce quer remover?");
		nome = leia.next();
		System.out.println("Qual o produto nome do produto que voce quer remover?");
		preco = leia.nextDouble();			
		list.remove(new Produtos(nome, preco));
	}
	
	public void atualizarLista(ArrayList<Produtos> list) {
		Scanner leia = new Scanner(System.in);
		String nome;
		double preco;
		int ind;
		System.out.println("Qual o numero de indice quer atualizar");
		ind = leia.nextInt();
		System.out.println("Qual o nome?");
		nome = leia.next();		
		System.out.println("Qual o preço");
		preco = leia.nextDouble();
		list.set(ind, new Produtos(nome, preco));		
	}

}
