package javacore.introducaometodos.classes;

public class Professor {
	public String nome; 
	public String matricula; 
	public String rg;  
	public String cpf; 
	
	public void imprime(Professor p1) {
		System.out.println(p1.nome + ", \n" + p1.rg + ", \n" + p1.cpf + ", \n" + p1.matricula);
		System.out.println("-----------------------------------");
	}

}
