package javacore.introducaometodos.sobrecargametodos.test;

import javacore.introducaometodos.sobrecargametodos.classes.Funcionarios;

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionarios f = new Funcionarios("Ane","111.222.333-0", 4500, "231213231321");
		Funcionarios f1 = new Funcionarios();
		f.imprime();
		f1.imprime();
		
	
	}
}
