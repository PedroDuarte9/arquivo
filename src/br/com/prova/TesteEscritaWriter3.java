package br.com.prova;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaWriter3 {

	public static void main(String[] args) throws IOException {
		
//		FileWriter fw = new FileWriter("lorem.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		//PrintStream ps = new PrintStream(new File("lorem.txt")); Pode ser feito desta maneira também , ou pra facilitar como está abaixo
		
		//PrintStream ps = new PrintStream("lorem.txt"); //imprimir através dessa classe para um fluxo binário
		//ou
		PrintWriter ps = new PrintWriter("lorem.txt");
		ps.println("Aqui é a nova forma de escrever em um arquivo"); // Aqui eu imprimo os caracteres 
		
//		
//		bw.write("Olá, tudo bem ?");
//		bw.newLine();
//		bw.newLine();
//		bw.write("Essa é a próxima linha");
//		
//		bw.close();

	}

}
