package javacore.blocodeinicializacao.classes;

public class Cliente {
	// 1° É alocado espaço na memória para o objeto que será criado 
	// 2° Cada atributo de classe é criado e inicializado com seus valores default ou explícitos
	// 3° Bloco de inicializacao é executado 
	// 4° O construtor é executado 
	private int[] parcelas; 

	{
		// bloco de inicialização 
		// é uma boa prática criar antes do construtor
		// Pois ele é executado antes do construtor 
		parcelas = new int[100]; 
		System.out.println("Dentro do bloco de inicialização");
		for(int i =1; i <= 100; i++) {
			parcelas[i-1] = i; 
		}
	}
	public Cliente() {
	
	}
	public int[] getParcelas() {
		return parcelas;
	}
	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	} 
	
	
}
