package br.com.alura.heranca.modelo.depuracao;

public class Teste {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(222, 123, 100.0);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(123, 111, 200.0);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
