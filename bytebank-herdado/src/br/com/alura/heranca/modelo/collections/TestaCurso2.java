package br.com.alura.heranca.modelo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulaImutavel = javaColecoes.getAulas();
        System.out.println(aulaImutavel + " Tempo Total: " + javaColecoes.getTempoTotal());
        
        List<Aula> aulas = new ArrayList<>(aulaImutavel);
        Collections.sort(aulas);
        
        System.out.println(aulas  + " Tempo Total: " + javaColecoes.getTempoTotal());
        
        System.out.println("Tempo Total: " + javaColecoes.getTempoTotal());

	}

}
