package br.com.alura.heranca.modelo.depuracao;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		int[] idades = new int[5];
/*		idades[0] = 29;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 79;
		
		int idade5 = idades[2];
		System.out.println("Idade: " + idade5);
		System.out.println();*/
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;

		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		

	}

}
