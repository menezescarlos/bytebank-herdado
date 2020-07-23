package br.com.alura.heranca.modelo;

public class SistemaInterno {
	private int senha = 222;
	
	public void autentica(Autenticavel  fa) {
		boolean autenticou = fa.autentica(this.senha);

		if (autenticou) {
			System.out.println("Pode autenticar");
		}else {
			System.out.println("N�o pode autenticar");
		}
	}
}
