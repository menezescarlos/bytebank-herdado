package br.com.alura.heranca.modelo.depuracao;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente c1 = new ContaCorrente(111, 222, 100.0);
		ContaCorrente c2 = new ContaCorrente(222, 111, 300.0);
		
		contas[0] = c1;
		contas[1] = c2;
		
		System.out.println(contas[0].getSaldo());
		System.out.println(contas[1].getNumero());
		
	}

}
