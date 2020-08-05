package br.com.alura.heranca.modelo.exerciciosarrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.alura.heranca.modelo.depuracao.Conta;
import br.com.alura.heranca.modelo.depuracao.ContaCorrente;
import br.com.alura.heranca.modelo.depuracao.ContaPoupanca;

public class TesteSever {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(123, 333);
		cc1.deposita(330.0);

		Conta cc2 = new ContaCorrente(123, 444);
		cc2.deposita(330.0);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		// System.out.println(cc2.getSaldo());
		for (Conta conta : lista) {
			System.out.println(conta.getAgencia());
		}

		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(comparator);

		System.out.println("---------");

		for (Conta conta : lista) {
			System.out.println(conta.getAgencia());
		}
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}
