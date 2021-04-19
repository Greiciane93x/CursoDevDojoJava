package br.com.abc.javacore.introducaoclasses;

public class Estudante {

	private String nome; 
	private int idade; //içamento -- global 
	
	
	
	public String getNome() {
		return nome; 
	}
	// o meu valor em memória está recebendo o que está sendo passado 
	public void setNome(String nome) {
		this.nome = nome; 
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade < 0) {
 			System.out.println("Idade deve ser maior que [zero]");
			return; 
		}
		this.idade = idade;
	}



	public void mediaEstudante(double nota1, double nota2, double nota3){ 
		double media = 0; 
		media = nota1+nota2+nota3/3; 
		if(media > 6) {
			System.out.println("aprovado");
		}else {
			System.out.println("reprovado");
		}
	}
	
	
}
