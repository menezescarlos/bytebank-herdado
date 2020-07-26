package br.com.alura.heranca.modelo.depuracao;

import java.util.Calendar;
import java.util.Date;

public class Teste {
	
	public static void main(String[] args) {
		Date a = new Date();
		
		System.out.println(a.getDate());
		System.out.println(a.getDay());
		System.out.println(a.getHours());
		System.out.println(a.getTime());
	
		Calendar d = Calendar.getInstance();
		int c = d.get(Calendar.DATE);
		System.out.println(c);
		
		
		
	}

}
