package br.com.alura.heranca.modelo.exerciciosarrays;

import java.util.ArrayList;
import java.util.Collection;

import br.com.alura.heranca.modelo.depuracao.Cliente;
import br.com.alura.heranca.modelo.depuracao.Conta;
import br.com.alura.heranca.modelo.depuracao.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//ArrayList lista = new ArrayList();
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(123, 333, 250.30);
		//Cliente cliente = new Cliente("Carlos", "1111", "Programador");
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(123, 444, 250.30);
		lista.add(cc2);
		
		 System.out.println("Tamanho: " + lista.size());
		 
		 Conta ref = (Conta) lista.get(1);
		 System.out.println(ref.getNumero());
		 
		 lista.remove(0);
		 System.out.println("Tamanho: " + lista.size());
		 
		 Conta cc3 = new ContaCorrente(123, 555, 250.30);
		 lista.add(cc3);
		 
		 Conta cc4 = new ContaCorrente(123, 666, 250.30);
		 lista.add(cc4);
		 
		 for (int i = 0; i < lista.size(); i++) {
			ContaCorrente oRef = (ContaCorrente) lista.get(i);
			System.out.println(oRef.getAgencia());
		}
		 
		 System.out.println("========================");
		 
		 for (Object object : lista) {
			 ContaCorrente object1 = (ContaCorrente) object;
			 System.out.println(object1.getNumero());	
		}
	}

}
