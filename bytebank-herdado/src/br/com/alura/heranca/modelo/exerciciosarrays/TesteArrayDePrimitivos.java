package br.com.alura.heranca.modelo.exerciciosarrays;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 10;
		idades[1] = 12;
		idades[2] = 13;
		idades[3] = 14;
		idades[4] = 15;
		
		for (int i = 0; i < idades.length; i++) {
			int j = idades[i];
			System.out.println(j);
		}
		
		System.out.println("====================");
		
		System.out.println(idades[0]);
		
		
		System.out.println("====================");
		int idade1 = idades[1];
		System.out.println(idade1);
		
		System.out.println("====================");
		for (int i = 0; i < idades.length; i++) {
			System.out.println(i);
		}
		
		System.out.println("====================");
		System.out.println(idades.length);
		
		System.out.println("====================");
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			int array = idades[i];
			
			System.out.println(array);
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idades: " + idades[i]);
			
		}
		

	}

}
