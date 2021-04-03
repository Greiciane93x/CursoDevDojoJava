package javaOnline;

public class ControleFluxo2 {
	public static void main(String[] args) {
		int idade = 15; 
		String status; 
//		
//		if(idade < 18) {
//			status = "Não adulto"; 
//		}else {
//			status = "Adulto"; 
//		}
		//status = idade < 18 ? "Não adulto" : "Adulto" ; 
		status = idade < 15 ? "Infantil" : idade <=15 ? "Juvenil" : "Adulto"; 
		System.out.println(status);
	}

}
