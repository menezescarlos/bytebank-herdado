package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		bw.write("Carlos Menezes de Oliveira");
		bw.newLine();
		bw.write("São Paulo - 2020 - ");
		
		bw.close();

	}

}
