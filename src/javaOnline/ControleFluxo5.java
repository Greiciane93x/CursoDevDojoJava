package javaOnline;

public class ControleFluxo5 {
	public static void main(String[] args) {
		/*
		 * Dado um valor de um carro, descubra quantas vezes
		 * ele pode ser parcelado. 
		 * Obs.: As parcelas não podem ser menores que 1000; 
		 * 
		 */
		
		double valorTotal = 30000; 
		for(int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela; 
			if(valorParcela < 1000) {
				break;
			}
				System.out.println("Parcela: " + parcela + " R$ " + valorParcela); 
		
		}
		
	}

}
