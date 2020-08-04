package br.com.alura.heranca.modelo.exerciciosarrays;

import br.com.alura.heranca.modelo.depuracao.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//Array de Refer�ncia
		ContaCorrente[] contas = new ContaCorrente[5];
		
		//Cria��o da primeira CC 
		ContaCorrente cc1 = new ContaCorrente(222, 111, 100.20);
		//Inclus�o da CC a um Array na primeira posi��o.
		contas[0] = cc1;
		
		//Cria��o da segunda CC
		ContaCorrente cc2 = new ContaCorrente(222, 111, 300.50);
		//Inclus�o da CC a um Array na segunda posi��o
		contas[1] = cc2;
		
		//System.out.println(contas[0].getAgencia());
		ContaCorrente ref = contas[0];
		System.out.println(cc2.getAgencia());
		System.out.println(ref.getAgencia());
	}

}
