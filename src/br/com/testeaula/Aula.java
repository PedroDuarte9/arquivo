package br.com.testeaula;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula() {
		
	}
	
	public Aula(String nome, int tempo) {
		super();
		this.titulo = nome;
		this.tempo = tempo;
	}

	public String getNome() {
		return titulo;
	}

	public void setNome(String nome) {
		this.titulo = nome;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula [titulo=" + titulo + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
		}
	
}

