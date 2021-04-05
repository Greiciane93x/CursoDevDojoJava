package javaOnline;

public class Arrays2 {
	public static void main(String[] args) {
		//int [] idades = new int[3]; 
		
		/* byte, short, int, long, float, double  = 0
		 * 
		 * boolean false; 
		 * reference null 
		 * Ao trabalhar com arrays, os espaços de 
		 * memória são inicializados automaticamente
		 */
		
		String[] nomes = new String[4]; 
	
		nomes[0] = "Ane"; 
		nomes[1] = "Maria"; 
		nomes[2] = "Alice"; 
		nomes[3] = "Bruno"; 

		for(int i = 0; i < nomes.length; i++) {
			System.out.println("["+(i + 1)+"]" + " Nome: "  + nomes[i]);
		}
		nomes = new String[4]; 
	} 

}
