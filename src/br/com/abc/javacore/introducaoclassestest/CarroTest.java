package br.com.abc.javacore.introducaoclassestest;

import br.com.abc.javacore.introducaoclasses.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro(); 
		carro.modelo = "Fusca"; 
		carro.placa = "QWHTC2"; 
		carro.velocidadeMaxima = 120f; 
		System.out.println(carro.placa); 
		System.out.println(carro.modelo);
		System.out.println(carro.velocidadeMaxima);
	}
}
