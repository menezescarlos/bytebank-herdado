package br.com.alura.heranca.modelo;

public class ControleBonificacao {
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		System.out.println(this.soma = this.soma + boni);
		
	}

}
