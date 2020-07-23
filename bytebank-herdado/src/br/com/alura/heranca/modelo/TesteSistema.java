package br.com.alura.heranca.modelo;

public class TesteSistema {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Gerente();

		Autenticavel referencia1 = new Cliente();

		Autenticavel referencia2 = new Administrador();
		
		Gerente g = new Gerente();
		g.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);

	}

}
