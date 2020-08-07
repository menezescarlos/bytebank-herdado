package br.com.alura.heranca.modelo.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas{
	public static void main(String[] args) {

		String curso1 = "Java SE";
		String curso2 = "Angular";
		String curso3 = "PHP";

		ArrayList<String> cursos = new ArrayList<>();

		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

//		Collections.sort(cursos);
//
//		System.out.println(cursos);

		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("Aula : " + cursos.get(i));
		}
		
		
		Collections.sort(cursos);

		System.out.println(cursos);

//	    
//	    cursos.remove(0);
//	    
//	    System.out.println(cursos);
//	    	    
//	    System.out.println(cursos.get(0));
	}

}
