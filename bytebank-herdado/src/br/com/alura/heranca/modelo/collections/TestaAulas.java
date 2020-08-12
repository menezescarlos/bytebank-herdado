package br.com.alura.heranca.modelo.collections;

import java.util.List;

public class TestaAulas {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Java EE", "Carlos Menezes");
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
		System.out.println(javaColecoes);
		

	}

}
