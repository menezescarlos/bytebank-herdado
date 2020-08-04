package br.com.alura.heranca.modelo.exerciciosarrays;

import br.com.alura.heranca.modelo.depuracao.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(222, 111, 100.20);
		ContaCorrente cc2 = new ContaCorrente(222, 111, 300.50);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getAgencia());
	}

}
