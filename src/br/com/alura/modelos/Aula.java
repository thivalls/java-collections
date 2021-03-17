package br.com.alura.modelos;

public class Aula implements Comparable<Aula> {
    private String aula;
    private int tempo;

    public Aula(String aula, int tempo) {
        this.aula = aula;
        this.tempo = tempo;
    }

    public String getAula() {
        return aula;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "aula='" + aula + '\'' +
                ", tempo=" + tempo +
                '}';
    }

    @Override
    public int compareTo(Aula toCompare) {
        return this.aula.compareTo(toCompare.aula);
    }
}
