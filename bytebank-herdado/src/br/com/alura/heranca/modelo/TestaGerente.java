package br.com.alura.heranca.modelo;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Pedro Santos");
		g1.setCpf("123456789");
		g1.setSalario(3000);
		g1.setSenha(222);
		
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		boolean autentica = g1.autentica(222);
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}

}
