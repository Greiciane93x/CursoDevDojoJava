package javaOnline;


public class ControledeFluxo3 {
	public static void main(String[] args) {
		byte dia = 10; 
		
		/*
		 * char, int, byte, short, enum, String(a partir do Java 7)
		 */
		switch(dia) {
			case 1:
				System.out.println("domingo \n");
				break; 
			case 2:  
				System.out.println("segunda \n");
				break; 
			case 3: 
				System.out.println("terça \n");
				break; 
			case 4: 
				System.out.println("quarta \n");
				break; 
			case 5: 
				System.out.println("quinta \n");
				break; 
			case 6: 
				System.out.println("sexta \n");
				break; 
			case 7: 
				System.out.println("sábado \n");
				break; 
			default: 
				System.out.println("Opção Inválida \n");
			
		}
		
		char sexo = 'X'; 
		switch(sexo) {
		case 'F': 
			System.out.println("Feminino");
			break; 
		
		case 'M': 
			System.out.println("Masculino");
			break; 
		default: 
			System.out.println("Opção Inválida");
		}
//		
//		if(dia == 1) {
//			System.out.println("domingo");
//		}else if(dia == 2) {
//			System.out.println("segunda");
//		}else if(dia == 3) {
//			System.out.println("terça");
//		}else if(dia == 4) {
//			System.out.println("quarta");
//		}
//		
//	
	}

}
