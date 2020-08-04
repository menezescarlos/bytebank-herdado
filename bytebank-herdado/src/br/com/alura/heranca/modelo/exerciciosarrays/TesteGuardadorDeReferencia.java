package br.com.alura.heranca.modelo.exerciciosarrays;

import br.com.alura.heranca.modelo.depuracao.Conta;
import br.com.alura.heranca.modelo.depuracao.ContaCorrente;

public class TesteGuardadorDeReferencia {

	public static void main(String[] args) {
		GuardadorDeReferencia guardador = new GuardadorDeReferencia();
		
		Conta cc1 = new ContaCorrente(123, 333, 250.30);
		guardador.adiciona(cc1);
		
		Conta cc2 = new ContaCorrente(123, 444, 250.30);
		guardador.adiciona(cc2);
		
		
		int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);
        
        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());
        
        ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());
		

	}

}
