package br.com.alura.heranca.modelo.depuracao;

import java.util.Collection;
import java.util.Vector;

public class TesteArrayList {

	public static void main(String[] args) {
        //ArrayList lista = new ArrayList();
		//List<Conta> lista = new Vector<>();
		Collection<Conta> lista = new Vector<>();

        Conta cc = new ContaCorrente(22, 11, 600.0);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22, 50.0);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = (Conta) ((Vector<Conta>) lista).get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311, 300.0);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322, 150.0);
        lista.add(cc4);
        
        // A corrigir depois.

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = ((Vector<Conta>) lista).get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        for(Object oRef : lista) {
            System.out.println(oRef);
        }

	}

}
