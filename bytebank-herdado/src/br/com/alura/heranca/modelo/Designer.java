package br.com.alura.heranca.modelo;

public class Designer extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();

	}
		
}
