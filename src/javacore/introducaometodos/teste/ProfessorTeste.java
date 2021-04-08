package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Professor; 

public class ProfessorTeste {
	public static void main(String[] args) {
		Professor p1 = new Professor(); 
		p1.cpf = "28098340982"; 
		p1.rg ="98398092183"; 
		p1.nome = "921309821398"; 
		p1.matricula = "92384982109"; 
		
		
		Professor p2 = new Professor(); 
		p2.cpf = "948398490238"; 
		p2.rg = "94082390892180"; 
		p2.nome = "983128093821083"; 
		p2.matricula = "93810928390218"; 
		
		p1.imprime(p1);
		p1.imprime(p2);
		
		//System.out.println(p1.nome + ", \n" + p1.rg + ", \n" + p1.cpf + ", \n" + p1.matricula);
		//System.out.println(p2.nome + ", \n" + p2.rg + ", \n" + p2.cpf + ", \n" + p2.matricula);
		
	}
	
	
}
