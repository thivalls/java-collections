package br.com.alura.modelos;

public class Aula implements Comparable<Aula> {
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "aula='" + titulo + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public int compareTo(Aula toCompare) {
        return this.titulo.compareTo(toCompare.titulo);
    }
}
