package br.com.abc.introducao;

public class Arrays1 {
	public static void main(String[] args) {
		/*array de tamanho 3, mas o índice de tamanho 2
		 * porque sempre começa da posição 0
		 * variável do tipo reference --> new
		 */
		int[] idades = new int[3]; // cria um array de int com 3 posições
		idades[0] = 20; 
		idades[1] = 15; 
		idades[2]= 30;

		System.out.println("Idades 1: " + idades[0]);
		System.out.println("Idades 2: " + idades[1]);
		System.out.println("Idades 3: " + idades[2]);
		
		
	}
}
