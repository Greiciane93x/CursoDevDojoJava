package javacore.sobrecargaconstrutores.teste;

import javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
	
	public static void main(String[] args) {
		Estudante est = new Estudante("12121", "Nane", new double[] {5,7,10}); 
		est.imprime();
	}

}
