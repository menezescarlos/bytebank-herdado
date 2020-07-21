package br.com.alura.heranca.modelo;

public class TesteReferencias {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Carlos");
		f.setSalario(2000);
		
		Gerente g = new Gerente();
		g.setNome("Pedro");
		g.setSalario(3000);
		
		Designer d = new Designer();
		g.setNome("Andre");
		g.setSalario(4000);
		
		EditorVideo e = new EditorVideo();
		e.setNome("João");
		e.setSalario(5000);
		
		ControleBonificacao t = new ControleBonificacao();
		t.registra(f);
		t.registra(g);
		t.registra(d);
		t.registra(e);
		
		
		
		System.out.println(t.getSoma());

	}

}
