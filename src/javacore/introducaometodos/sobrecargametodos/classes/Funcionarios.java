package javacore.introducaometodos.sobrecargametodos.classes;


public class Funcionarios {
	private String nome;
	private String cpf; 
	private double salario;
	private String rg; 
	
	//overload 
	
	public Funcionarios(String nome) {
		this.nome = nome; 
	}
	
	public Funcionarios(String nome, String cpf, double salario, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.rg = rg;
	}

	public Funcionarios() {
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void imprime() {
		// this enxerga tudo do obj
		// é uma referência do obj dentro do próprio obj 
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.salario);
		System.out.println(this.rg);
	}
	
	

}
