package br.com.alura.heranca.modelo;

public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();

	}

	
}
