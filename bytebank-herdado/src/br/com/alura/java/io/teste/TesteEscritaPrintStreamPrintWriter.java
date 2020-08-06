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
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		//PrintStream ps = new PrintStream("lorem2.txt");
		
		PrintWriter pw = new PrintWriter("lorem2.txt");

		
		pw.println("Carlos Menezes de Oliveira");
		pw.print("São Paulo - 2020 - ");
		
		pw.close();

	}

}
