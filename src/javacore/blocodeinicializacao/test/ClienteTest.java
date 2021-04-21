package javacore.blocodeinicializacao.test;

import javacore.blocodeinicializacao.classes.Cliente;

public class ClienteTest {
	public static void main(String[] args) {
		Cliente c = new Cliente(); 
		for(int parcela : c.getParcelas()) {
			System.out.println(parcela + " ");
		}
		System.out.println("Exibindo a qtd de parcelas possíveis");
		
	}
}
