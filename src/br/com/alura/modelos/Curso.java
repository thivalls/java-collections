package br.com.alura.modelos;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private LocalDateTime createdAt;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    // Neste caso estamos retornando uma referência para a memória do array de aulas dentro de curso variavel AULAS
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void add(Aula aula) {
        this.aulas.add(aula);
    }

    public void addAll(List<Aula> aulas) {
        this.aulas.addAll(aulas);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                '}';
    }
}
