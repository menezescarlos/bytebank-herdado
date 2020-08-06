package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		OutputStream fis = new FileOutputStream("lorem2.txt");
		Writer isr = new OutputStreamWriter(fis);
		BufferedWriter br = new BufferedWriter(isr);
		
		br.write("Carlos Menezes de Oliveira");
		br.newLine();
		br.write("São Paulo - 2020");
		
		br.close();

	}

}
