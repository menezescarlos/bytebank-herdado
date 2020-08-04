package br.com.alura.heranca.modelo.exerciciosarrays;

import br.com.alura.heranca.modelo.depuracao.Conta;
import br.com.alura.heranca.modelo.depuracao.ContaCorrente;
import br.com.alura.heranca.modelo.depuracao.ContaPoupanca;

public class TesteArrayReferenciaConta {

	public static void main(String[] args) {
		
		//Array de Referência
		Conta [] contas = new Conta[5];
		
		//Criação da primeira CC 
		ContaCorrente cc1 = new ContaCorrente(222, 111, 100.20);
		//Inclusão da CC a um Array na primeira posição.
		contas[0] = cc1;
		
		//Criação da segunda CC
        ContaPoupanca cc2 = new ContaPoupanca(222, 111, 300.50);
		//Inclusão da CC a um Array na segunda posição
		contas[1] = cc2;
		
		//System.out.println(contas[0].getAgencia());
		ContaCorrente ref = (ContaCorrente) contas[0];
		Conta ref1 = contas[1];
		System.out.println(cc2.getAgencia());
		System.out.println(ref.getAgencia());
		System.out.println(ref1.getAgencia());

	}

}
