package br.com.alura.heranca.modelo.array;

import br.com.alura.heranca.modelo.depuracao.Conta;
import br.com.alura.heranca.modelo.depuracao.ContaCorrente;

public class ArrayModelo {
	public static void main(String[] args) {
		Object[] conta = new Object[10];
		
		Conta[] contas = new Conta[10];
		
		Conta c1 = new ContaCorrente(120, 333, 123.0);
		Conta c2 = new ContaCorrente(120, 333, 123.0);
		Conta c3 = new ContaCorrente(120, 333, 123.0);
		Conta c4 = new ContaCorrente(120, 333, 123.0);
		
		contas[0] = c1;
		contas[1] = c2;
		contas[2] = c3;
		contas[3] = c4;
		
		Conta conta1 = contas[0];
		
		System.out.println(conta1.getAgencia());
		
		
	}
	
}
