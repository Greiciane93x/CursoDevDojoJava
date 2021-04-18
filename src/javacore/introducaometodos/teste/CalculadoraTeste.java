package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora(); 
		
		//calc.multiplicacao(2, 2);
		//System.out.println(calc.divideDoisNumeros(20, 0)); 
		//calc.imprimeDoisNumerosDividos(20, 5);
		
		
		int[] numeros = new int[] {1,2,3,4,5}; 
		calc.somaArray(numeros);
		calc.somaVarArgs(1,3,42,1);
	}

}
