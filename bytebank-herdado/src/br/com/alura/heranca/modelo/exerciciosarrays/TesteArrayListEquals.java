package br.com.alura.heranca.modelo.exerciciosarrays;

import java.util.ArrayList;
import java.util.Collection;

import br.com.alura.heranca.modelo.depuracao.Cliente;
import br.com.alura.heranca.modelo.depuracao.Conta;
import br.com.alura.heranca.modelo.depuracao.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		//ArrayList lista = new ArrayList();
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(123, 444, 250.30);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(123, 444, 250.30);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc1);
		System.out.println("Já existe? " + existe);
		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		
		boolean igual = cc1.equals(cc2);
		System.out.println(igual);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	
	}

}
