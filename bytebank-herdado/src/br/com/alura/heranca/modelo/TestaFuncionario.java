package br.com.alura.heranca.modelo;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Carlos Menezes");
		f1.setCpf("123456789");
		f1.setSalario(2500);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
	}
}
