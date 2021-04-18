package br.com.abc.javacore.introducaoclasses;

public class Estudante {

	public String nome; 
	public int idade; 

	
	public void mediaEstudante(double nota1, double nota2, double nota3){ 
		double media = 0; 
		media = nota1+nota2+nota3/3; 
		if(media > 6) {
			System.out.println("aprovado");
		}else {
			System.out.println("reprovado");
		}
	}
	
	
}
