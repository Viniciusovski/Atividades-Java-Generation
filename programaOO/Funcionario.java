package programaOO;

public class Funcionario {
	String nome;
	String empresa;
	String funcao;
	
	public Funcionario(String nome, String empresa, String funcao) {		
		this.nome = nome;
		this.empresa = empresa;
		this.funcao = funcao;
	}
	public void imprimirFuncionario() {
		System.out.println("\tInformações do Funcionario");
		System.out.println("Nome: "+this.nome);
		System.out.println("Empresa: "+this.empresa);
		System.out.println("Função: "+this.funcao);
		System.out.println("*******************************");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	

}
