package br.com.alura.heranca.modelo.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);	
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	@Override
	public String toString() {
		return "[ Nome: " + this.nome + " - Instrutor: " + this.instrutor + " ]";
	}

	public int getTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();	
//		}
//		return tempoTotal;
		
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}



	
	
	
}
