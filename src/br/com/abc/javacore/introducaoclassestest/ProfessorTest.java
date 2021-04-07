package br.com.abc.javacore.introducaoclassestest;

import br.com.abc.javacore.introducaoclasses.Professor;

public class ProfessorTest {
	public static void main(String[] args) {
		Professor p1 = new Professor(); 
		p1.nome = "Greiciane"; 
		p1.matricula = "212132"; 
		p1.cpf = "321311321"; 
		p1.rg = "2312111"; 
		
		Professor p2 = new Professor(); 
		p2.nome = "Assis"; 
		p2.matricula = "38192893081"; 
		p2.cpf = "290218390218"; 
		p2.rg = "93248902384"; 
		
		System.out.println(p1.nome + ", \n" + p1.matricula + ", \n"+ p1.cpf +", \n" + p1.rg + "\n");
		System.out.println(p2.nome + ", \n" + p2.matricula + ", \n"+ p2.cpf +", \n" + p2.rg + "\n");
				
	}

}
