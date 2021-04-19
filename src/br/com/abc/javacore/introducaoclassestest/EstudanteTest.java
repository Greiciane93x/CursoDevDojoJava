package br.com.abc.javacore.introducaoclassestest;

import br.com.abc.javacore.introducaoclasses.Estudante;

public class EstudanteTest {
	
	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		//joao.nome = "João"; 
		//// joao.matricula = "231231"; 
		//joao.idade = 15; 
		
		// System.out.println(joao.nome + ", \n" + joao.idade + ", \n" + joao.matricula);
		
		//joao.mediaEstudante(10,5,7);
		estudante.setNome("Ane");
		estudante.setIdade(-1); 
		
		System.out.println(estudante.getNome() + "\n" + estudante.getIdade());
		
	}

}
