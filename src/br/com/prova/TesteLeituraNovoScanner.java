package br.com.prova;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import java.util.NoSuchElementException;

public class TesteLeituraNovoScanner {

	public static void main(String[] args) throws Exception {
		
		
		Scanner scanner = new Scanner(new File("contas.csv")); // Aqui eu estou identificando o arquivo que será lido
		
		while(scanner.hasNextLine()) {		//Aqui eu inicio uma condição que será feita para ler cada linha do arquivo 
			String linha = scanner.nextLine(); //Aqui as linhas serão armazenadas nessa variável chamada "linha"
			System.out.println(linha); // Aqui será mostrado o conteúdo da linha
			
		
			
			/*Esse trecho de código abaixo é pra mostrar como visualizar os indícies da linha com a delimitação determinada
			String[] delimitador = linha.split(","); //Aqui a se torna um vetor, pois a linguagem entende que cada linha tem  uma separação de itens ou (índices) para trabalhar, naquela linha, então cada elemento daquela linha se torna uma parte do vetor.
			System.out.println(Arrays.toString(delimitador));
			*/	
		}	
//		Scanner sc = new Scanner(linha);
//		sc.useLocale(Locale.US);
//		sc.useDelimiter(",");
//		
//		String indice1 = sc.nextLine();
//		int indice2 = sc.nextInt();
//		int indice3 = sc.nextInt();
//		String indice4 = sc.nextLine();
//		double indice5 = sc.nextDouble();
//		
//		System.out.println(indice1 + indice2 + indice3 + indice4 + indice5);
//		
//		sc.close();
//		
			
		scanner.close();
	}

}
