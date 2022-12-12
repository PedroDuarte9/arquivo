package br.com.testeaula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		Aula a1 = new Aula("Aprendendo nova habilidades", 22);
		
		Aula a2 = new Aula("Usando Variáveis", 15);
		
		Aula a3 = new Aula("Tipos Primitivos", 32);
		
		Aula a4 = new Aula("Interface", 15);
		
		List<Aula> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		
		
		for (Aula aula : list) {
			System.out.println(aula);
		}
		
		
		System.out.println("---------------------------------");
		
		Collections.sort(list, Comparator.comparing(Aula::getTempo));
		
		for (Aula aula : list) {
			System.out.println(aula);
		}
		
		System.out.println("---------------------------------");
		//Existe essa maneira e uma mais simples abaixo desta:
		//Collections.sort(list, Comparator.comparing(Aula::getTempo));
		
		list.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(list);
		
	}

}
