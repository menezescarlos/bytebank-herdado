package br.com.alura.heranca.modelo.exerciciosarrays;

import br.com.alura.heranca.modelo.depuracao.Conta;

public class GuardadorDeReferencia {
		
		private Object[] referencias;
		private int posicaoLivre;
		
		public GuardadorDeReferencia() {
			this.referencias = new Conta[10];
			this.posicaoLivre = 0;
		}

		public void adiciona(Conta cc) {
			referencias[this.posicaoLivre] = cc;
			this.posicaoLivre++;
			
		}

		public int getQuantidadeDeElementos() {
			return this.posicaoLivre;
		}

		public Object getReferencia(int i) {
			return this.referencias[i];
		}
}
