package com.bank.study.staticfinal;

public class TesteStaticFinal {
	
	public static void main(String[] args) {
		PessoaStaticFinal.nome = "Analice";
		PessoaStaticFinal psf = new PessoaStaticFinal();

		System.out.println(psf.nome);//Analice
		
		PessoaStaticFinal psf2 = new PessoaStaticFinal();
		System.out.println(psf2.nome);//Analice
		
		
	}

}
